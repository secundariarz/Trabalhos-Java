package ClonedConnect;

import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/adicionaCartao")
public class AdicionaCartaoServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int numero1;
	int cvv1;
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// busca o writer
		PrintWriter out = response.getWriter();
		MostrarCartao nomeDef = MostrarCartao();
		// buscando os parâmetros no request
		String nome = request.getParameter("nome");
		String numero = request.getParameter("numero");
		String cvv = request.getParameter("cvv");
		String validade = request.getParameter("validade");
		Calendar dataValidade= null;

		// fazendo a conversão da data
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(validade);
			dataValidade = Calendar.getInstance();
			dataValidade.setTime(date);
		} catch (ParseException e) {
			out.println("Erro de conversão da data");
			return; // para a execução do método
		}
		
		//Conversao para numero
		try {
			cvv1 = Integer.parseInt(cvv);
			numero1 = Integer.parseInt(numero);
		}  catch (NumberFormatException ex){
            ex.printStackTrace();
            return;
        }

		// monta um objeto contato
		Cartao cartao= new Cartao();
		cartao.setNome(nome);
		cartao.setNumero(numero1);
		cartao.setCvv(cvv1);
		cartao.setValidade(dataValidade);

		// salva o contato
		CartaoDao dao = new CartaoDao();
		dao.adiciona(cartao);

		
		out.println("<html>");
		out.println("<body>");
		out.println("Usuario " + dao.consulta(nome) + " adicionado com sucesso");
		out.println("</body>");
		out.println("</html>");
		
		
	}
}