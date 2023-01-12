package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public abstract class GenericDao<T> {
    private Connection connection;

    protected GenericDao() {
        this.connection = new Conexao().getConnection();
    }

    protected Connection getConnection() {
        return connection;
    }

    public void save(String insertSql, Object... parametros) {
        try {
            PreparedStatement pstmt = connection.prepareStatement(insertSql);
            for (int i = 0; i < parametros.length; i++) {
                pstmt.setObject(i + 1, parametros[i]);
            }
            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    protected void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}