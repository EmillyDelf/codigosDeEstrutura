package Atividade4.QuestoesBruno.BoletimDeNotas;

class Disciplina {
    String nome;
    double nota;

    Disciplina(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome + " | Nota: " + nota;
    }
}