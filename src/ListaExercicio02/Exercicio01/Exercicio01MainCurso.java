package ListaExercicio02.Exercicio01;

class Aluno02 {
    private String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    Aluno02 (String nome) {
        this.nome = nome;
    }

    public void matricular (int matricula, Curso curso, int ano) {
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    public String toString() {
        return "Aluno : "+ nome + " - matricula : " + matricula + " - Curso : " + this.curso.toStringCurso() + " - " + ano;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}

class Curso {
    private String nome;
    private String sigla;

    public Curso(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }


    public String toStringCurso() {
        return (nome + " - "+ sigla);
    }
}

public class MainCurso {
    public static void main(String[] args) {
        Curso c = new Curso("Engenharia de Software", "ES");
        Aluno02 aluno02 = new Aluno02("Joao");
        aluno02.matricular(202503313,c,2025);
        System.out.println(aluno02.toString());

        Curso c2 = new Curso("Enfermagem", "EF");
        aluno02.setCurso(c2);
        aluno02.setAno(2026);
        System.out.println(aluno02.toString());
    }
}
