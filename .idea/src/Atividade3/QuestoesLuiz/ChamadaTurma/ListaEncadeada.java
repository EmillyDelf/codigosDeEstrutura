package Atividade3.QuestoesLuiz.ChamadaTurma;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }

    // adicionar no final
    public void adiciona(T valor) {
        No<T> novo = new No<>(valor);

        if (inicio == null) {
            inicio = novo;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }

    // mostrar todos
    public void mostrar() {
        No<T> atual = inicio;

        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }

    // pega primeiro
    public T pegaPrimeiro() {
        if (inicio == null) return null;
        return inicio.valor;
    }

    // pega último
    public T pegaUltimo() {
        if (inicio == null) return null;

        No<T> atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        return atual.valor;
    }

    // tamanho
    public int getTamanho() {
        return tamanho;
    }
}