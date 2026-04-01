package Atividade1.Atividade_A;



public class TesteVetorC4 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adicionar("CG_150");
        vetor.adicionar("Biz_125");

        System.out.println("Vetor: ");
        vetor.imprimeUmPorLinha();
        System.out.println("Limpando o vetor!");
        vetor.limpar();

        System.out.println("Vetor: ");
        vetor.imprimeUmPorLinha();
    }
}
