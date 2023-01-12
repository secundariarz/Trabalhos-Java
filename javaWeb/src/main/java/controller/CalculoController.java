package controller;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.entity.Calculo;
import model.service.CalculoService;

public class CalculoController extends HttpServlet {
    private Calculo calculo;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int tipo = Integer.parseInt(request.getParameter("tipoJuros"));

        calculo = new Calculo();

        calculo.setValorPrincipal(Double.parseDouble(request.getParameter("valorPrincipal")));
        calculo.setTaxa(Double.parseDouble(request.getParameter("taxa")));
        calculo.setMeses(Integer.parseInt(request.getParameter("meses")));
        calculo.setTipo(tipo == 1 ? Calculo.TipoJuros.SIMPLES : Calculo.TipoJuros.COMPOSTOS);

        calcular(calculo);

        request.setAttribute("valorPrincipal", doubleFormat(calculo.getValorPrincipal()));
        request.setAttribute("taxa", doubleFormat(calculo.getTaxa()));
        request.setAttribute("meses", calculo.getMeses());
        request.setAttribute("tipo", calculo.getTipo().getDescricao());
        request.setAttribute("juros", doubleFormat(calculo.getTotalJuros()));
        request.setAttribute("montante", doubleFormat(calculo.getMontante()));

        RequestDispatcher dispatcher = request.getRequestDispatcher("resultadoForm.jsp");

        dispatcher.forward(request, response);
    }

    private Calculo calcular(Calculo calculo) {
        CalculoService service = new CalculoService();

        Calculo resultado;
        if (calculo.getTipo().getValor() == 1) {
            resultado = service.jurosSimples(calculo);
        } else {
            resultado = service.jurosCompostos(calculo);
        }
        return resultado;
    }

    private String doubleFormat(Double aDouble) {
        NumberFormat nf =
                NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        nf.setMaximumFractionDigits(2);
        return nf.format(aDouble);
    }


}


