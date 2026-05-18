package ListaExercicio02.Exercicio05;

import java.util.Scanner;

public class Filme {
    private int codigo;
    private String nome;
    private String genero;
    private int ano;
    private String autor;
    private static int qntd = 0;

    public Filme(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        qntd++;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\nFilme" + codigo +
                "\nnome= " + nome +
                "\ngenero= " + genero +
                "\nano= " + ano +
                "\nautor= " + autor;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cod;
        String nome;
       do {
           System.out.println("\nCódigo do filme: ");
           cod = scan.nextInt();
           if (cod == 0){
               break;
           }
           scan.nextLine();
           System.out.println("Nome do filme: ");
           nome = scan.nextLine();

           Filme filme = new Filme(cod,nome);
           System.out.println("Gênero do filme: ");
           filme.setGenero(scan.nextLine());
           System.out.println("Ano do filme: ");
           filme.setAno(scan.nextInt());
           scan.nextLine();
           System.out.println("Autor do filme: ");
           filme.setAutor(scan.nextLine());
           System.out.println(filme.toString());
       } while (true);
        System.out.println("Quantidade total de filmes: " + qntd);
    }
}

