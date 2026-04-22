package Atividade5.Questao1;
public class Inverter {
    public String inverter(String str, int numero){
        if (numero < 0){
            return "";
        }

        return str.charAt(numero) + inverter(str, numero - 1);
    }
}
