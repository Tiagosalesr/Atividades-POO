package LaboratórioAbstracaoAssocModelos;

class Compositor {
    private String nome;
    private String nacionalidade;

    public Compositor(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Compositor: " + nome + " | Nacionalidade: " + nacionalidade;
    }
}

class Musica {
    private String nome;
    private int ano;
    private String tipo;
    private Compositor compositor;

    public Musica(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) { this.ano = ano; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setCompositor(Compositor compositor) { this.compositor = compositor; }

    @Override
    public String toString() {
        return "Música: " + nome + " (" + ano + ") | Estilo: " + tipo + " | " + compositor;
    }
}

public class MainMusica {
    public static void main(String[] args) {
        Compositor c1 = new Compositor("Chico Buarque");
        c1.setNacionalidade("Brasileira");

        Musica m1 = new Musica("Construção");
        m1.setAno(1971);
        m1.setTipo("MPB");
        m1.setCompositor(c1);

        System.out.println(m1);
    }
}
