package Database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class funcionarioDAO {
	private Connection connection;
	
	public funcionarioDAO() { // construtor
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void add(Funcionario funcionario) { 
		String sql = "insert into funcionarios " + "(nome,user,pass)" + " values (?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUser());
			stmt.setInt(3, funcionario.getPass());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void altera(Funcionario funcionario) {
	      String sql = "update funcionarios set nome=?, email=?,"+
	              "endereco=?, dataNascimento=? where id=?";

	      try {
	          PreparedStatement stmt = connection.prepareStatement(sql);
	          stmt.setString(1, funcionario.getNome());
	          stmt.setString(2, funcionario.getUser());
			  stmt.setInt(3, funcionario.getPass());
	          
	          stmt.setLong(5, funcionario.getId());
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	
	public void remove(Funcionario funcionario) {
	      try {
	          PreparedStatement stmt = connection
	                  .prepareStatement("delete from funcionarios where id=?");
	          stmt.setLong(1, funcionario.getId());
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	
	public List<Funcionario> getLista() {
	      try {
	          List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	          PreparedStatement stmt = this.connection.
	                  prepareStatement("select * from funcionarios");
	          ResultSet rs = stmt.executeQuery();

	          while (rs.next()) {
	              Funcionario funcionario = new Funcionario();
	              funcionario.setId(rs.getLong("id"));
	              funcionario.setNome(rs.getString("nome"));
	              funcionario.setUser(rs.getString("user"));
	  			  funcionario.setPass(rs.getInt("pass"));

	              funcionarios.add(funcionario);
	          }
	          rs.close();
	          stmt.close();
	          return funcionarios;
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	}

