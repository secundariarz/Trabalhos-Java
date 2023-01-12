package Ecommerce;

import java.sql.Connection;
import java.sql.SQLException;

import Database.ConnectionFactory;

public class TestConnection {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
	}
}
