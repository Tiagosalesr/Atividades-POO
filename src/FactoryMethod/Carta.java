package FactoryMethod;

public class Carta extends Documento {

    public Carta(int numero, String remetente) {
        super(numero, remetente, "Carta");
    }

    @Override
    public String getDetalhes() {
        return "Documento formal enviado por correspondência.";
    }
}
