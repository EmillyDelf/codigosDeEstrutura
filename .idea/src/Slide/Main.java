package Slide;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {5, 3, 8, 4, 2};

        Selection selection =  new Selection();
        
        
        selection.selectionSort(numeros);

        System.out.println(java.util.Arrays.toString(numeros));
    }
}
