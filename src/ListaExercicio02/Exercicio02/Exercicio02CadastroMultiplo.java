package ListaExercicio02.Exercicio02;

public class CadastroMultiplo {
    public static void main(String[] args) {

        Cliente[] cliente = new Cliente[5];

        cliente[0] = new Cliente("Maria");
        cliente[0].setIdade(20);
        cliente[0].setTelefone("999-8899");

        cliente[1] = new Cliente("Jon Snow");
        cliente[1].setIdade(25);
        cliente[1].setTelefone("94234-2342349");

        cliente[2] = new Cliente("Sansa Stark");
        cliente[2].setIdade(22);
        cliente[2].setTelefone("93453499-889435349");

        cliente[3] = new Cliente("Renly Baratheon");
        cliente[3].setIdade(24);
        cliente[3].setTelefone("996787689-88423499");

        cliente[4] = new Cliente("Bron of the blackwater");
        cliente[4].setIdade(32);
        cliente[4].setTelefone("9242342399-882432499");


        for (int i=0;i<cliente.length;i++) {
            System.out.println(cliente[i]);

        }
    }

}
