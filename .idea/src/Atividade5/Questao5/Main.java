package Atividade5.Questao5;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        int resultado = ContagemDigitos.contarDigitos(numero);

        System.out.println("Quantidade de dígitos: " + resultado);

        sc.close();
    }
}