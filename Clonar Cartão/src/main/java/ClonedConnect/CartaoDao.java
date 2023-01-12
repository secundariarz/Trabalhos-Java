package ClonedConnect;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cardConnect.ConnectionFactory;

public class CartaoDao {
	private Connection connection;

	public CartaoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Cartao cartao) {
		String sql = "insert into card " + "(nome,numero,validade,cvv)" + " values (?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, cartao.getNome());
			stmt.setInt(2, cartao.getNumero());
			stmt.setDate(3, new Date(cartao.getValidade().getTimeInMillis()));
			stmt.setInt(4, cartao.getCvv());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void altera(Cartao cartao) {
	      String sql = "update card set numero=?, nome=?,"+"cvv=?, validade=?";

	      try {
	          PreparedStatement stmt = connection.prepareStatement(sql);
	          stmt.setInt(1, cartao.getNumero());
	          stmt.setString(2, cartao.getNome());
	          stmt.setInt(3, cartao.getCvv());
			  stmt.setDate(4, new Date(cartao.getValidade().getTimeInMillis()));
				
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	
	public void remove(Cartao contato) {
	      try {
	          PreparedStatement stmt = connection.prepareStatement("delete from card where cvv=?");
	          stmt.setLong(1, contato.getCvv());
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	
	
	public Cartao consulta(String nome) {
		Cartao nomeBanco = new Cartao();
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT DISTINCT nome from card WHERE nome = ?");
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				nomeBanco.setNome(rs.getString(1));
				return nomeBanco;
			} else {
				return null;   //https://www.youtube.com/watch?v=WZywbebNOmc
			}
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

