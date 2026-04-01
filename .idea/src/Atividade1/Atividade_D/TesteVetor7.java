package Atividade1.Atividade_D;

public class TesteVetor7 {

    public static void main(String[] args) {

        // 11B. TesteVetor7 — Testar remove(int posicao)

        // Crie um vetor e adicione: A, B, C, D, E.
        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println("Vetor inicial: " + vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        // Remova posição 0
        System.out.println("\nRemovendo posição 0");
        vetor.remove(0);
        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        // Remova uma posição do meio
        System.out.println("\nRemovendo posição do meio");
        vetor.remove(2);
        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        // Remova a última posição
        System.out.println("\nRemovendo última posição");
        vetor.remove(vetor.tamanho() - 1);
        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        // Teste uma remoção inválida e observe a exceção
        System.out.println("\nTestando remoção inválida");

        try {
            vetor.remove(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

    }
}