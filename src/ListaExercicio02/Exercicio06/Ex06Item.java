package ListaExercicio02.Exercicio06;

public class Item {
    private String titulo;
    private int ano;
    private String tempo;
    private String comentarios;

    public Item(String titulo, int ano, String tempo, String comentarios) {
        this.titulo = titulo;
        this.ano = ano;
        this.tempo = tempo;
        this.comentarios = comentarios;
    }


    public void mostrarDadosComuns() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Duração: " + tempo);
        System.out.println("Comentários: " + comentarios);


    }

    public void mostrarDadosEspecificos(){};


    public static void main(String[] args) {
        Item[] itens = new Item[10];
        itens[0] = new CD("Fuga das galinhas",2007,"2h:30min","Muito bom o CD!!!","paulo",5);
        itens[1] = new CD("Abbey Road", 1969, "47min", "Um clássico eterno", "The Beatles", 17);
        itens[2] = new CD("Discovery", 2001, "61min", "Ícone do French House", "Daft Punk", 14);
        itens[3] = new Filme("O Poderoso Chefão", 1972, "2h 55min", "Melhor filme de máfia", "Francis Ford Coppola");
        itens[4] = new Filme("Interestelar", 2014, "2h 49min", "Ficção científica profunda", "Christopher Nolan");
        itens[5] = new Filme("Pulp Fiction", 1994, "2h 34min", "Diálogos e narrativa incríveis", "Quentin Tarantino");
        itens[6] = new Jogo("The Witcher 3", 2015, "100h+", "Melhor RPG da geração", 1, "PC/PS4/Xbox");
        itens[7] = new Jogo("Elden Ring", 2022, "80h", "Desafiador e imersivo", 1, "Multiplataforma");
        itens[8] = new Jogo("FIFA 23", 2022, "Indeterminado", "Ótimo para jogar com amigos", 4, "PS5");
        itens[9] = new Jogo("Mario Kart 8", 2014, "Indeterminado", "Divertido para todas as idades", 4, "Nintendo Switch");

        for (Item i : itens) {
            if (i != null) {
                System.out.println("\n--- INFORMAÇÕES DO ITEM ---");

                i.mostrarDadosComuns();

                i.mostrarDadosEspecificos();

                if (i instanceof Jogo){
                    Jogo temp = (Jogo) i;
                    System.out.println("ALERTA DE PLATAFORMA: " + temp.getPlataforma());
                }

                System.out.println("----------------------------");
            }
        }

    }
}

class CD extends Item{
    private String artista;
    private int qntdDeFaixa;

    public CD(String titulo, int ano, String tempo, String comentarios, String artista, int qntdDeFaixa) {
        super(titulo, ano, tempo, comentarios);
        this.artista = artista;
        this.qntdDeFaixa = qntdDeFaixa;
    }

    public void mostrarDadosEspecificos() {
        System.out.println("Artista: " + artista);
        System.out.println("Quantidade de Faixas: " + qntdDeFaixa);
    }
}

class Filme extends Item{
    private String diretor;

    public Filme(String titulo, int ano, String tempo, String comentarios, String diretor) {
        super(titulo, ano, tempo, comentarios);
        this.diretor = diretor;
    }

    public void mostrarDadosEspecificos() {
        System.out.println("Diretor: " + diretor);
    }
}

class Jogo extends Item{
    private int nmrJogadores;
    private String plataforma;

    public Jogo(String titulo, int ano, String tempo, String comentarios, int nmrJogadores, String plataforma) {
        super(titulo, ano, tempo, comentarios);
        this.nmrJogadores = nmrJogadores;
        this.plataforma = plataforma;
    }

    public void mostrarDadosEspecificos() {
        System.out.println("Nº de Jogadores: " + nmrJogadores);
    }


    public String getPlataforma() {
        return plataforma;
    }
}

