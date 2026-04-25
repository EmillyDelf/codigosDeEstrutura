package Slide;

public class Selection {


    public void selectionSort(int []vetor){

        for (int i = 0; i < vetor.length - 1; i++) {
            int menorIndex = i;

            for (int j = i + 1 ; j < vetor.length; j++) {
                if (vetor[j] < vetor[menorIndex]) {
                    menorIndex = j;
                }
            }

            int temp = vetor[i];
            vetor[i] = vetor[menorIndex];
            vetor[menorIndex] = temp;
            
            
            
            
        }
    }


}
