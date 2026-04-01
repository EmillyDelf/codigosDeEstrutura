package Atividade2;

public class MainTeste {
    static void main(String[] args) {

        Pilha<String> pilha = new Pilha(10);

        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");

        System.out.println("Topo da Pilha: " + pilha.topo());

        String removido = pilha.desempilha();
        System.out.println("Removido: " + removido);

        System.out.println("Topo: " + pilha.topo());
        System.out.println("lista: " + pilha);

        System.out.println("=======================================");

        System.out.println(pilha.inverter("luiz"));

        System.out.println("=======================================");

        System.out.println(pilha.ehPalindromo("arara"));
        System.out.println(pilha.ehPalindromo("casa"));

        System.out.println("=======================================");

        System.out.println(pilha.inverterOrdem("eu gosto de java"));
    }
}
