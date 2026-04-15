package Atividade4.QuestoesBruno.VagaDeEstacionamento;

class Estacionamento {
    private No inicio;
    private int tamanho;

    public Estacionamento() {
        inicio = null;
        tamanho = 0;
    }

    public void adicionar(Carro carro) {
        No novo = new No(carro);

        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }

        tamanho++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        No atual = inicio;

        while (atual != null) {
            sb.append(atual.carro.toString()).append("\n");
            atual = atual.proximo;
        }

        return sb.toString();
    }

    public boolean contem(String placa) {
        No atual = inicio;

        while (atual != null) {
            if (atual.carro.placa.equalsIgnoreCase(placa)) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    public Carro pegaPrimeiro() {
        if (inicio == null) return null;
        return inicio.carro;
    }

    public Carro pegaUltimo() {
        if (inicio == null) return null;

        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        return atual.carro;
    }

}