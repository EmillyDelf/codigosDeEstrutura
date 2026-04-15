package Atividade4.QuestoesLuiz.PlaylistMusica;

public class ListaEncadeada3<T> {
    private No3<T> inicio;
    private int tamanho;

    public ListaEncadeada3() {
        this.inicio = null;
        this.tamanho = 0;
    }

    // adicionar no final
    public void adiciona(T valor) {
        No3<T> novo = new No3<>(valor);

        if (inicio == null) {
            inicio = novo;
        } else {
            No3<T> atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }

    // mostrar todos
    public void mostrar() {
        No3<T> atual = inicio;

        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }


    public boolean contemMusica(String nome) {
        No3<T> atual = inicio;

        while (atual != null) {
            Musica m = (Musica) atual.valor;

            if (m.titulo.equalsIgnoreCase(nome)) {
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