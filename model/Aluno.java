public class Aluno {

    private final String nome;
    private final double[] notas;
    private int faltas;
    private final int limiteFaltas;

    public Aluno(String nome, int quantidadeNotas, int limiteFaltas) {
        this.nome = nome;
        this.notas = new double[quantidadeNotas];
        this.faltas = 0;
        this.limiteFaltas = limiteFaltas;
    }

    public void adicionarNota(int indice, double nota) {
        if (indice >= 0 && indice < notas.length) {
            notas[indice] = nota;
        } else {
            System.out.println("Índice de nota inválido.");
        }
    }

    public void adicionarFalta() {
        this.faltas++;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7.0 && faltas <= limiteFaltas;
    }

    public boolean reprovadoPorFalta() {
        return faltas > limiteFaltas;
    }

    public String situacao() {
        if (reprovadoPorFalta()) {
            return "Reprovado por falta";
        } else if (estaAprovado()) {
            return "Aprovado";
        } else {
            return "Reprovado por nota";
        }
    }

    public String getNome() {
        return nome;
    }

    public int getFaltas() {
        return faltas;
    }
}
