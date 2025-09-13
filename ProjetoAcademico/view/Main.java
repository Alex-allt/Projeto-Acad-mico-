package view;
import model.Aluno;
import model.Professor;
import model.Disciplina;
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "joao@email.com", 12345);
        Professor professor = new Professor("Maria", "maria@email.com", "Matemática");
        Disciplina disciplina = new Disciplina("Matemática", "MAT101");
        System.out.println("Aluno: " + aluno.getNome() + " - Email: " + aluno.getEmail() + " - RA: " + aluno.getRa());
        System.out.println("Professor: " + professor.getNome() + " - Email: " + professor.getEmail() + " - Disciplina: " + professor.getDisciplina());
        System.out.println("Disciplina: " + disciplina.getNome() + " - Código: " + disciplina.getCodigo());
    }
}