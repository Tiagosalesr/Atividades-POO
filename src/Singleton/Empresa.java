package Singleton;

public class Empresa {

    private static Empresa instancia;

    private final String nome;
    private final String cnpj;
    private final String endereco;
    private final String cep;

    private Empresa() {
        this.nome     = "EBM INCORPORACOES S/A";
        this.cnpj     = "03.025.881/0002-74";
        this.endereco = "Rua T 55, 930 SETOR BUENO GOIANIA – GO";
        this.cep      = "74215-170";
    }

    public static Empresa getInstancia() {
        if (instancia == null) {
            instancia = new Empresa();
        }
        return instancia;
    }

    public String getNome()     { return nome; }
    public String getCnpj()     { return cnpj; }
    public String getEndereco() { return endereco; }
    public String getCep()      { return cep; }

    @Override
    public String toString() {
        return "Empresa{"
                + "nome='"     + nome     + '\''
                + ", cnpj='"   + cnpj     + '\''
                + ", endereco='" + endereco + '\''
                + ", cep='"    + cep      + '\''
                + '}';
    }
}
