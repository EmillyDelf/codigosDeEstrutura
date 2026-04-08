package Atividade3.QuestoesEmilly.estruturas;

// Lista encadeada genérica
public class ListaEncadeada<T> {
    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho;

    public ListaEncadeada() {
        primeiro = null;
        ultimo = null;
        tamanho = 0;
    }

    // Adiciona elemento no final
    public void adiciona(T dado) {
        No<T> novo = new No<>(dado);
        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
        }
        tamanho++;
    }

    // Retorna true se a lista contém o elemento
    public boolean contem(T dado) {
        No<T> atual = primeiro;
        while (atual != null) {
            if (atual.dado.equals(dado)) return true;
            atual = atual.proximo;
        }
        return false;
    }

    // Mostra todos os elementos
    public void mostraTodos() {
        No<T> atual = primeiro;
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }

    public T pegaPrimeiro() {
        if (primeiro == null) return null;
        return primeiro.dado;
    }

    public T pegaUltimo() {
        if (ultimo == null) return null;
        return ultimo.dado;
    }

    public int getTamanho() {
        return tamanho;
    }
}