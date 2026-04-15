package AtividadeEncadeada8;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada agenda = new ListaEncadeada();

        agenda.adicionar("Luiz", "1111-1111");
        agenda.adicionar("Otavio", "2222-2222");
        agenda.adicionar("Adao", "3333-3333");
        agenda.adicionar("Vitor", "4444-4444");
        agenda.adicionar("Emilly", "5555-5555");
        agenda.adicionar("Bruno", "6666-6666");

        System.out.println("Contatos:");
        agenda.exibir();

        System.out.println("\nBuscar contato:");
        if (agenda.contem("Maria")) {
            System.out.println("Maria está cadastrada");
        } else {
            System.out.println("Maria não encontrada");
        }

        System.out.println("\nTotal de contatos: " + agenda.getTamanho());
    }
}
