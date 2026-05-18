package FactoryMethod;

public class CadastroDocumentos {

    public static void main(String[] args) {

        Fabrica fabrica = new FabricaDocumentos();

        Documento doc1 = fabrica.criarDocumento(1, "João Silva",   "carta");
        Documento doc2 = fabrica.criarDocumento(2, "Maria Souza",  "telegrama");
        Documento doc3 = fabrica.criarDocumento(3, "Carlos Lima",  "notificacao");
        Documento doc4 = fabrica.criarDocumento(4, "Ana Pereira",  "carta");
        Documento doc5 = fabrica.criarDocumento(5, "Pedro Santos", "notificação");

        System.out.println("=== DOCUMENTOS CADASTRADOS ===");
        System.out.println(doc1);
        System.out.println(doc2);
        System.out.println(doc3);
        System.out.println(doc4);
        System.out.println(doc5);
    }
}
