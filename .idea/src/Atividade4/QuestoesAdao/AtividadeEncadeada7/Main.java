package AtividadeEncadeada7;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada estoque = new ListaEncadeada();

        estoque.adicionar("Teclado", 100.0, 10);
        estoque.adicionar("Mouse", 50.0, 20);
        estoque.adicionar("Monitor", 900.0, 5);
        estoque.adicionar("Notebook", 3500.0, 3);
        estoque.adicionar("Headset", 200.0, 8);

        System.out.println("Produtos:");
        estoque.exibir();

        System.out.println("\nProduto na posição 2:");
        Produto p = estoque.pega(2);
        if (p != null) {
            System.out.println(p.toString());
        } else {
            System.out.println("Posição inválida");
        }

        System.out.println("\nExiste Mouse?");
        System.out.println(estoque.contem("Mouse"));

        System.out.println("\nPrimeiro produto:");
        Produto primeiro = estoque.pegaPrimeiro();
        if (primeiro != null) {
            System.out.println(primeiro.toString());
        }

        System.out.println("\nÚltimo produto:");
        Produto ultimo = estoque.pegaUltimo();
        if (ultimo != null) {
            System.out.println(ultimo.toString());
        }
    }
}