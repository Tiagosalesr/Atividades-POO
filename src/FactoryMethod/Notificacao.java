package FactoryMethod;

public class Notificacao extends Documento {

    public Notificacao(int numero, String remetente) {
        super(numero, remetente, "Notificação");
    }

    @Override
    public String getDetalhes() {
        return "Aviso oficial emitido para ciência do destinatário.";
    }
}
