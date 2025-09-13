package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class BancoDeDados {
    public void inserirPessoa(String nome, String email, String fone) {
        String sql = "INSERT INTO tb_pessoa(nome, email, fone) VALUES(?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, fone);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}