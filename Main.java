//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o aluno
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Quantas notas o aluno tem? ");
        int quantidadeNotas = scanner.nextInt();

        System.out.print("Qual o limite de faltas permitidas? ");
        int limiteFaltas = scanner.nextInt();

        Aluno aluno = new Aluno(nome, quantidadeNotas, limiteFaltas);

        // Inserindo notas
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            aluno.adicionarNota(i, nota);
        }

        // Inserindo faltas
        System.out.print("Quantas faltas o aluno teve? ");
        int faltas = scanner.nextInt();
        aluno.adicionarFalta(faltas);

        // Exibindo a situação do aluno
        System.out.println("\n--- Situação do Aluno ---");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Faltas: " + aluno.getFaltas());
        System.out.println("Situação: " + aluno.situacao());

        scanner.close();
    }
}
