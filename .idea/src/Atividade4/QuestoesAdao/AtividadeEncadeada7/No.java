package AtividadeEncadeada7;

public class No {
    Produto dado;
    No proximo;

    public No(Produto dado) {
        this.dado = dado;
        this.proximo = null;
    }
}