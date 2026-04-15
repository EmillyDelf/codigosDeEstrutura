package Atividade4.QuestoesBruno.BoletimDeNotas;

class Boletim {
    private No inicio;
    private int tamanho;

    public Boletim() {
        inicio = null;
        tamanho = 0;
    }

    public void adicionar(Disciplina disciplina) {
        No novo = new No(disciplina);

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
        int i = 0;

        while (atual != null) {
            sb.append("[").append(i).append("] ")
                    .append(atual.disciplina.toString())
                    .append("\n");
            atual = atual.proximo;
            i++;
        }

        return sb.toString();
    }

    public Disciplina pega(int indice) {
        if (indice < 0 || indice >= tamanho) {
            return null;
        }

        No atual = inicio;
        int contador = 0;

        while (contador < indice) {
            atual = atual.proximo;
            contador++;
        }

        return atual.disciplina;
    }

    public boolean contem(String nome) {
        No atual = inicio;

        while (atual != null) {
            if (atual.disciplina.nome.equalsIgnoreCase(nome)) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    public int getTamanho() {
        return tamanho;
    }
}
