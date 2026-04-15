package AtividadeEncadeada8;

public class ListaEncadeada {
    Contato inicio;
    int tamanho;

    public ListaEncadeada() {
        inicio = null;
        tamanho = 0;
    }

    public void adicionar(String nome, String telefone) {
        Contato novo = new Contato(nome, telefone);

        if (inicio == null) {
            inicio = novo;
        } else {
            Contato atual = inicio;
            while (atual.prox != null) {
                atual = atual.prox;
            }
            atual.prox = novo;
        }
        tamanho++;
    }

    public void exibir() {
        Contato atual = inicio;

        while (atual != null) {
            System.out.println("Nome: " + atual.nome + " | Telefone: " + atual.telefone);
            atual = atual.prox;
        }
    }

    public boolean contem(String nome) {
        Contato atual = inicio;

        while (atual != null) {
            if (atual.nome.equalsIgnoreCase(nome)) {
                return true;
            }
            atual = atual.prox;
        }
        return false;
    }

    public int getTamanho() {
        return tamanho;
    }
}
