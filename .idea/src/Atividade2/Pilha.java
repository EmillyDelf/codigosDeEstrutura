package Atividade2;

import java.util.Arrays;

public class Pilha<T> {
    private Object[] elementos;
    private int tamanho;


    public Pilha(int capacidade) {
        elementos = new Object[capacidade];
        tamanho = 0;
    }

    //Parte 1

    public void empilha(T elemento) {
        if (tamanho == elementos.length) {
            System.out.println("Pilha cheia!");
            return;
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }


    public T desempilha() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        T elementoRemovido = (T) elementos[tamanho - 1];
        elementos[tamanho - 1] = null;
        tamanho--;
        return elementoRemovido;
    }


    public T topo() {
        if (estaVazia()) {
            return null;
        }
        return (T) elementos[tamanho - 1];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    //Parte 2

    public static String inverter(String palavra) {
        String palavra_invertida = "";

        for (int i = palavra.length() -1; i >= 0 ; i--) {
            palavra_invertida += palavra.charAt(i);
        }

        return palavra_invertida;
    }

    public static <T> boolean ehPalindromoBase(T[] palavra) {

        Pilha<T> pilha = new Pilha<T>(palavra.length);


        for (int i = 0; i < palavra.length; i++) {
            pilha.empilha(palavra[i]);
        }



        for (int i = 0; i < palavra.length; i++) {
            T elementoOriginal = palavra[i];
            T elementoDesempilhado = pilha.desempilha();

            if (!elementoOriginal.equals(elementoDesempilhado)) {
                return false;
            }
        }

        return true;
    }


    public static boolean ehPalindromo(String palavra) {
        // Remove espaços e converte para minúsculas
        palavra = palavra.toLowerCase().replace(" ", "");

        // Converte a string para um array de Character
        Character[] caracteres = new Character[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            caracteres[i] = palavra.charAt(i);
        }

        // Usa a função genérica
        return ehPalindromoBase(caracteres);
    }

    public static String inverterOrdem(String frase) {
        String[] palavras = frase.split(" ");
        Pilha<String> pilha = new Pilha<String>(palavras.length);

        // Empilha as palavras
        for (String palavra : palavras) {
            pilha.empilha(palavra);
        }

        // Desempilha para inverter
        StringBuilder resultado = new StringBuilder();
        while (!pilha.estaVazia()) {
            resultado.append(pilha.desempilha());
            if (!pilha.estaVazia()) {
                resultado.append(" ");
            }
        }

        return resultado.toString();
    }
    @Override
    public String toString() {
        return "Pilha{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }


}
