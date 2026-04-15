package Atividade4.QuestoesEmilly.ListaDeConvidados;

import Atividade3.QuestoesEmilly.estruturas.ListaEncadeada;

// Programa principal da lista de convidados
public class ListaConvidados {
    public static void main(String[] args) {
        ListaEncadeada<Convidado> lista = new ListaEncadeada<>();

        // Adicionar 6 convidados
        lista.adiciona(new Convidado("Ana", "123.456.789-00"));
        lista.adiciona(new Convidado("Bruno", "234.567.890-11"));
        lista.adiciona(new Convidado("Carlos", "345.678.901-22"));
        lista.adiciona(new Convidado("Daniela", "456.789.012-33"));
        lista.adiciona(new Convidado("Eduardo", "567.890.123-44"));
        lista.adiciona(new Convidado("Fernanda", "678.901.234-55"));

        // Mostrar todos
        System.out.println("Lista completa de convidados:");
        lista.mostraTodos();

        // Verificar um convidado
        Convidado buscar = new Convidado("Carlos", "345.678.901-22");
        System.out.println("\nVerificando se " + buscar + " está na lista:");
        System.out.println(lista.contem(buscar) ? "Convidado está cadastrado!" : "Convidado não está cadastrado.");

        // Quantidade total
        System.out.println("\nQuantidade de convidados: " + lista.getTamanho());
    }
}