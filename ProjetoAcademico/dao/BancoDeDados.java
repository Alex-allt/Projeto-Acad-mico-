package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDeDados {
    /**
     * Insere uma nova pessoa no banco de dados.
     * @param nome O nome da pessoa.
     * @param email O email da pessoa.
     * @param fone O telefone da pessoa.
     * @throws SQLException se ocorrer um erro de acesso ao banco de dados.
     */
    public void inserirPessoa(String nome, String email, String fone) throws SQLException {
        String sql = "INSERT INTO tb_pessoa(nome, email, fone) VALUES(?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, fone);
            ps.execute();
        }
    }
}