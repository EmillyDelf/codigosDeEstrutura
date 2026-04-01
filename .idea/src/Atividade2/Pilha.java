package Atividade2;

import java.util.Arrays;

public class Pilha {
    private String[] elementos;
    private int tamanho;


    public Pilha(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }


    public void empilha(String elemento) {
        if (tamanho == elementos.length) {
            System.out.println("Pilha cheia!");
            return;
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }


    public String desempilha() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        String elementoRemovido = elementos[tamanho - 1];
        elementos[tamanho - 1] = null;
        tamanho--;
        return elementoRemovido;
    }


    public String topo() {
        if (estaVazia()) {
            return null;
        }
        return elementos[tamanho - 1];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }
}
