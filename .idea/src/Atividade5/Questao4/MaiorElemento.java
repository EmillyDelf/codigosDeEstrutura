package Atividade5.Questao4;

public class MaiorElemento {

    public static int maior(int[] vetor, int indice) {
        if (indice == vetor.length - 1) {
            return vetor[indice];
        }

        int maiorDoResto = maior(vetor, indice + 1);

        if (vetor[indice] > maiorDoResto) {
            return vetor[indice];
        } else {
            return maiorDoResto;
        }
    }
}
