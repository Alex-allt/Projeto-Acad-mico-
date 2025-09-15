package dao;

public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private String fone;

    // Construtor para criar um novo objeto Pessoa (sem id, pois o banco de dados o gerará)
    public Pessoa(String nome, String email, String fone) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }

    // Construtor para criar um objeto Pessoa a partir de dados do banco (com id)
    public Pessoa(int id, String nome, String email, String fone) {
        this(nome, email, fone);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getFone() {
        return fone;
    }
}
