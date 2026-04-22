package Atividade5.Questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Palidromo palidromo = new Palidromo();
        Scanner input = new Scanner(System.in);

        String nome = input.next();
        System.out.println(palidromo.ehpalidromo(nome));

    }
    
    
}
