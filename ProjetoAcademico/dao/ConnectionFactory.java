package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection obtemConexao() throws SQLException {
        // Exemplo para SQLite, adapte para seu banco de dados se necessário
        String url = "jdbc:sqlite:meubanco.db";
        return DriverManager.getConnection(url);
    }
}