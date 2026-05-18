package ListaExercicio02.Exercicio01;

class Aluno {
    private String nome;
    private int matricula;
    private int ano;
    private String curso;

    Aluno (String nome) {
        this.nome = nome;
    }

    public void matricular (int matricula, String curso, int ano) {
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    public String toString() {
        return "Aluno : "+ nome + " - matricula : " + matricula + " - Curso : " + curso + " - " + ano;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}


public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Joao");
        aluno01.matricular(202503313,"Engenharia de Software",2025);
        System.out.println(aluno01.toString());

        aluno01.setCurso("Enfermagem");
        aluno01.setAno(2026);
        System.out.println(aluno01.toString());
    }
}
