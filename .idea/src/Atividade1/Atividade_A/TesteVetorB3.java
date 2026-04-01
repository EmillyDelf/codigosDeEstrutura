package Atividade1.Atividade_A;



public class TesteVetorB3 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        try {
            System.out.println("Ultimo item da lista é: " + vetor.ultimo());
        } catch (IllegalStateException e){
            System.out.println("Exceção capturada: "+ e.getMessage());
        }

        vetor.adicionar("Teclado");
        vetor.adicionar("Mouse");
        vetor.adicionar("GPU");
        vetor.imprimeUmPorLinha();
        System.out.println("Ultimo item da lista é: " + vetor.ultimo());

    }
}
