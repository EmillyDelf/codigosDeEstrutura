package Atividade5.Questao3;

public class SomaArray {
    public static int soma(int[] v, int i) {
        if (i == v.length) {
            return 0;
        }

        return v[i] + soma(v, i + 1);
    }
}