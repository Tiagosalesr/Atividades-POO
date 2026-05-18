package FactoryMethod;

public class FabricaDocumentos extends Fabrica {

    @Override
    public Documento criarDocumento(int numero, String remetente, String tipo) {
        switch (tipo.toLowerCase()) {
            case "carta":       return new Carta(numero, remetente);
            case "telegrama":   return new Telegrama(numero, remetente);
            case "notificacao":
            case "notificação": return new Notificacao(numero, remetente);
            default:
                throw new IllegalArgumentException("Tipo de documento desconhecido: " + tipo);
        }
    }
}
