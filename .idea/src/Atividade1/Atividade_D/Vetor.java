package Atividade1.Atividade_D;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int busca(String elemento) {

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    // PARTE D — Remoção por posição
    // 11. Método void remove(int posicao)
    public void remove(int posicao) {

        // Regra 1: Se a posição for inválida, lance IllegalArgumentException
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        // Regra 2: Desloque os elementos à direita uma posição para a esquerda
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        // Regra 3: Decremente tamanho
        tamanho--;

        // Regra 4 (opcional): limpar a última posição usada
        elementos[tamanho] = null;
    }

    // PARTE E — Remoção usando busca
    // 12. Método boolean remove(String elemento)
    public boolean remove(String elemento) {

        // Regra 1: Use busca(elemento)
        int pos = busca(elemento);

        // Regra 2: Se não encontrar, retorne false
        if (pos == -1) {
            return false;
        }

        // Regra 3: Se encontrar, chame remove(posicao)
        remove(pos);

        // Regra 4: Retorne true
        return true;
    }

    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < tamanho; i++) {
            s.append(elementos[i]);

            if (i < tamanho - 1) {
                s.append(", ");
            }
        }

        s.append("]");

        return s.toString();
    }
}