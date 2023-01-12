package Ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItensDao {

private Connection connection;
	
	public ItensDao() {
		this.connection = new ConnectionFactory().getConnection();
}
	
	public void add(Itens Itens) throws Exception { 
		String sql = "insert into Itens " + "(nome,Quantidade,id,Validade,Preço)" + " values (?,?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, Itens.getNome());
			stmt.setString(2, Itens.getQuantidade());
			stmt.setInt(3, Itens.getId());
			stmt.setString(4, Itens.getValidade());
			stmt.setDouble(5, Itens.getPreço());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new Exception(e);
		}
	}
	
	public void altera(Itens Itens) throws Exception {
	      String sql = "update funcionarios set nome=?, email=?,"+
	              "Quantidade=?, dataNascimento=? where id=?";

	      try {
	          PreparedStatement stmt = connection.prepareStatement(sql);
	          stmt.setString(1, Itens.getNome());
				stmt.setString(2, Itens.getQuantidade());
				stmt.setInt(3, Itens.getId());
				stmt.setString(4, Itens.getValidade());
				stmt.setDouble(5, Itens.getPreço());
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new Exception(e);
	      }
	  }
	
	public void remove(Itens Itens) throws Exception {
	      try {
	          PreparedStatement stmt = connection
	                  .prepareStatement("delete from funcionarios where id=?");
	          stmt.setLong(1, Itens.getId());
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new Exception(e);
	      }
	  }
	
	public List<Itens> getLista() throws Exception {
	      try {
	          List<Itens> Itenss = new ArrayList<Itens>();
	          PreparedStatement stmt = this.connection.
	                  prepareStatement("select * from Itens");
	          ResultSet rs = stmt.executeQuery();

	          while (rs.next()) {
	        	  Itens Itens = new Itens();
	              Itens.setId(rs.getInt("id"));
	              Itens.setNome(rs.getString("nome"));
	              Itens.setQuantidade(rs.getString("Quantidade"));
	              Itens.setValidade(rs.getString("Validade"));
	              Itens.setPreço(rs.getInt("Preço"));
	              Itens.add(Itens);
	          }
	          rs.close();
	          stmt.close();
	          return Itenss;
	      } catch (SQLException e) {
	          throw new Exception(e);
	      }
	  }
	}

