package FactoryMethod;

public abstract class Documento {

    private int numero;
    private String remetente;
    private String tipo;

    public Documento(int numero, String remetente, String tipo) {
        this.numero    = numero;
        this.remetente = remetente;
        this.tipo      = tipo;
    }

    public int    getNumero()    { return numero; }
    public String getRemetente() { return remetente; }
    public String getTipo()      { return tipo; }

    public abstract String getDetalhes();

    @Override
    public String toString() {
        return "[" + tipo + "] Nº " + numero
                + " | Remetente: " + remetente
                + " | " + getDetalhes();
    }
}
