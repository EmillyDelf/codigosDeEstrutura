package AtividadeEncadeada7;

public class ListaEncadeada {
    private No inicio;


    public void adicionar(String nome, double preco, int quantidade) {
        Produto novoProduto = new Produto(nome, preco, quantidade);
        No novoNo = new No(novoProduto);

        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void exibir() {
        No atual = inicio;
        int pos = 0;

        while (atual != null) {
            System.out.println("Posição " + pos + ": " + atual.dado);
            atual = atual.proximo;
            pos++;
        }
    }

    public Produto pega(int indice) {
        No atual = inicio;
        int pos = 0;

        while (atual != null) {
            if (pos == indice) {
                return atual.dado;
            }
            atual = atual.proximo;
            pos++;
        }

        return null;
    }

    public boolean contem(String nome) {
        No atual = inicio;

        while (atual != null) {
            if (atual.dado.nome.equalsIgnoreCase(nome)) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    public Produto pegaPrimeiro() {
        if (inicio != null) {
            return inicio.dado;
        }
        return null;
    }

    public Produto pegaUltimo() {
        if (inicio == null) return null;

        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        return atual.dado;
    }
}