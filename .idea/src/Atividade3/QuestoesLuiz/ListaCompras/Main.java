package Atividade3.QuestoesLuiz.ListaCompras;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Maçã", 5);
        Produto produto2 = new Produto("Pera", 5);
        Produto produto3 = new Produto("Banana", 5);
        Produto produto4 = new Produto("Melancia", 5);
        Produto produto5 = new Produto("Abacate", 5);
        Produto produto6 = new Produto("Pão", 5);
        Produto produto7 = new Produto("Bolo", 5);


        ListaEncadeada2<Produto> listaProduto = new ListaEncadeada2<Produto>();
        listaProduto.adiciona(produto1);
        listaProduto.adiciona(produto2);
        listaProduto.adiciona(produto3);
        listaProduto.adiciona(produto4);
        listaProduto.adiciona(produto5);
        listaProduto.adiciona(produto6);
        listaProduto.adiciona(produto7);

        System.out.println("Lista dos produtos na loja ");
        listaProduto.mostrar();




        System.out.println(" ");
        System.out.println("Quantidade de produtos no estoque: " + listaProduto.getTamanho());

        System.out.println("Produto: " + listaProduto.procurar(2));

        System.out.println("Pesquisando... " + listaProduto.pesquisarProduto("Abacate"));

    }
}