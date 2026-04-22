package Atividade5.Questao1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inverter nomInverter = new Inverter();
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        int numero = Integer.parseInt(input.next());
        System.out.println(nomInverter.inverter(nome, numero));
    }
    
}