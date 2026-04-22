package Atividade5.Questao5;

public class ContagemDigitos {

    public static int contarDigitos(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }
}
