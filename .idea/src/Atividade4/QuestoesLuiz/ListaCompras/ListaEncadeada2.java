package Atividade4.QuestoesLuiz.ListaCompras;

public class ListaEncadeada2<T> {
    private No2<T> inicio;
    private int tamanho;

    public ListaEncadeada2() {
        this.inicio = null;
        this.tamanho = 0;
    }

    // adicionar no final
    public void adiciona(T valor) {
        No2<T> novo = new No2<>(valor);

        if (inicio == null) {
            inicio = novo;
        } else {
            No2<T> atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }

    // mostrar todos
    public void mostrar() {
        No2<T> atual = inicio;

        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }

    public T procurar(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        No2<T> atual = inicio;

        for (int i = 0; i < indice; i++) {
            atual = atual.proximo;
        }

        return atual.valor;
    }

    public boolean pesquisarProduto(String nome1) {
        No2<T> atual = inicio;

        while (atual != null) {
            Produto produto = (Produto) atual.valor;

            if (produto.nome.equalsIgnoreCase(nome1)) {
                return true;
            }

            atual = atual.proximo;
        }

        return false;
    }

    // tamanho
    public int getTamanho() {
        return tamanho;
    }
}