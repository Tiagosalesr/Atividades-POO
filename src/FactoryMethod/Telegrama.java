package FactoryMethod;

public class Telegrama extends Documento {

    public Telegrama(int numero, String remetente) {
        super(numero, remetente, "Telegrama");
    }

    @Override
    public String getDetalhes() {
        return "Mensagem urgente transmitida via telégrafo.";
    }
}
