package ListaExercicio02.Exercicio02;

class Cliente{
    private String nome;
    private String telefone;
    private int idade;

    public Cliente(String nome){
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }
}

public class Cadastro {
    public static void main(String[] args) {

        Cliente cliente = new Cliente ("Maria");
        cliente.setTelefone("9823-2323");
        cliente.setIdade(20);

        System.out.println("Cliente : " + cliente.getNome() + " - Idade : " + cliente.getIdade() + " - Telefone : " + cliente.getTelefone());

        System.out.println(cliente.toString());
    }

}
