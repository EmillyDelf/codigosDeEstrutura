package AtividadeEncadeada7;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Nome: " + nome + " | Preço: " + preco + " | Quantidade: " + quantidade;
    }
}