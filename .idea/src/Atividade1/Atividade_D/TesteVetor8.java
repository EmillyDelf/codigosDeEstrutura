package Atividade1.Atividade_D;

public class TesteVetor8 {

    public static void main(String[] args) {

        // 12B. TesteVetor8 — Testar remove(String elemento)

        // Vetor: A, B, C, B, D.
        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("B");
        vetor.adiciona("D");

        System.out.println("Vetor inicial: " + vetor);

        // Remova "B" → só a primeira ocorrência desaparece.
        System.out.println("\nRemovendo B");
        boolean removido = vetor.remove("B");
        System.out.println("Removido: " + removido);
        System.out.println(vetor);

        // Remova "X" → false, vetor permanece o mesmo.
        System.out.println("\nRemovendo X");
        boolean removido2 = vetor.remove("X");
        System.out.println("Removido: " + removido2);
        System.out.println(vetor);

    }
}