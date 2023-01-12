package Ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
	private Connection connection;
	
	public ClienteDAO() { // construtor
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void add(Cliente cliente) { 
		String sql = "insert into cliente " + "(nome,endereco,id,cpf,cep)" + " values (?,?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEndereco());
			stmt.setInt(3, cliente.getId());
			stmt.setInt(4, cliente.getCPF());
			stmt.setInt(5, cliente.getCEP());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void altera(Cliente cliente) {
	      String sql = "update funcionarios set nome=?, email=?,"+
	              "endereco=?, dataNascimento=? where id=?";

	      try {
	          PreparedStatement stmt = connection.prepareStatement(sql);
	          stmt.setString(1, cliente.getNome());
				stmt.setString(2, cliente.getEndereco());
				stmt.setInt(3, cliente.getId());
				stmt.setInt(4, cliente.getCPF());
				stmt.setInt(5, cliente.getCEP());
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	
	public void remove(Cliente cliente) {
	      try {
	          PreparedStatement stmt = connection
	                  .prepareStatement("delete from funcionarios where id=?");
	          stmt.setLong(1, cliente.getId());
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	
	public List<Cliente> getLista() {
	      try {
	          List<Cliente> clientes = new ArrayList<Cliente>();
	          PreparedStatement stmt = this.connection.
	                  prepareStatement("select * from cliente");
	          ResultSet rs = stmt.executeQuery();

	          while (rs.next()) {
	        	  Cliente cliente = new Cliente();
	              cliente.setId(rs.getInt("id"));
	              cliente.setNome(rs.getString("nome"));
	              cliente.setEndereco(rs.getString("endereco"));
	              cliente.setCPF(rs.getInt("cpf"));
	              cliente.setCEP(rs.getInt("cep"));
	              cliente.add(cliente);
	          }
	          rs.close();
	          stmt.close();
	          return clientes;
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	}

