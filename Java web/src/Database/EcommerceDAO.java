import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EcommerceDAO {
	private Connection connection;
	
	public EcommerceDAO() { // construtor
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void add(Funcionario funcionario) { 
		String sql = "insert into funcionarios " + "(nome,user,pass)" + " values (?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, ecommerce.getNome());
			stmt.setString(2, ecommerce.getUser());
			stmt.setInt(3, ecommerce.getPass());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void altera(Ecommerce ecommerce) {
	      String sql = "update funcionarios set nome=?, email=?,"+
	              "endereco=?, dataNascimento=? where id=?";

	      try {
	          PreparedStatement stmt = connection.prepareStatement(sql);
	          stmt.setString(1, ecommerce.getNome());
	          stmt.setString(2, ecommerce.getUser());
			  stmt.setInt(3, ecommerce.getPass());
	          
	          stmt.setLong(5, ecommerce.getId());
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	
	public void remove(Ecommerce ecommerce) {
	      try {
	          PreparedStatement stmt = connection
	                  .prepareStatement("delete from funcionarios where id=?");
	          stmt.setLong(1, ecommerce.getId());
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	
	public List<Ecommerce> getLista() {
	      try {
	          List<Ecommerce> funcionarios = new ArrayList<Ecommerce>();
	          PreparedStatement stmt = this.connection.
	                  prepareStatement("select * from funcionarios");
	          ResultSet rs = stmt.executeQuery();

	          while (rs.next()) {
	        	  Ecommerce ecommerce = new Ecommerce();
	              ecommerce.setId(rs.getLong("id"));
	              ecommerce.setNome(rs.getString("nome"));
	              ecommerce.setUser(rs.getString("user"));
	              ecommerce.setPass(rs.getInt("pass"));

	  			ecommerce.add(ecommerce);
	          }
	          rs.close();
	          stmt.close();
	          return ecommerce;
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	}