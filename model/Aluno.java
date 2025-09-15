public class Aluno {
    private String nome;
    private int quantidadeNotas;
    private int limiteFaltas;
    private double[] notas;
    private int faltas;

    public Aluno(String nome, int quantidadeNotas, int limiteFaltas) {
        this.nome = nome;
        this.quantidadeNotas = quantidadeNotas;
        this.limiteFaltas = limiteFaltas;
        this.notas = new double[quantidadeNotas];
        this.faltas = 0;  // Inicializa as faltas com zero
    }

    public void adicionarNota(int indice, double nota) {
        if (indice >= 0 && indice < quantidadeNotas) {
            this.notas[indice] = nota;
        }
    }

    // Método modificado para aceitar um argumento e definir as faltas
    public void adicionarFalta(int faltas) {
        this.faltas = faltas;
    }

    public String getNome() {
        return nome;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / quantidadeNotas;
    }

    public int getFaltas() {
        return faltas;
    }

    public String situacao() {
        if (faltas > limiteFaltas) {
            return "Reprovado por faltas";
        }
        if (calcularMedia() < 6) {
            return "Reprovado por média";
        }
        return "Aprovado";
    }
}
