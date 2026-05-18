package Singleton;

public class Principal {

    public static void main(String[] args) {

        Empresa empresa = Empresa.getInstancia();
        System.out.println("=== EMPRESA ===");
        System.out.println(empresa);

        // Confirma que Singleton retorna sempre a mesma instância
        Empresa outraReferencia = Empresa.getInstancia();
        System.out.println("\nMesma instância? " + (empresa == outraReferencia));

        System.out.println("\n=== PROJETOS ===");

        Projeto p1 = new Projeto(
                "Residencial Bosque Verde",
                "Condomínio residencial com 120 apartamentos",
                "01/03/2025",
                "31/12/2026",
                "Em andamento"
        );

        Projeto p2 = new Projeto(
                "Centro Comercial Bueno",
                "Complexo comercial com 40 salas e 8 lojas",
                "15/06/2025",
                "30/06/2027",
                "Planejamento"
        );

        Projeto p3 = new Projeto(
                "Edifício Sede EBM",
                "Sede administrativa da empresa",
                "01/01/2024",
                "28/02/2025",
                "Concluído"
        );

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
