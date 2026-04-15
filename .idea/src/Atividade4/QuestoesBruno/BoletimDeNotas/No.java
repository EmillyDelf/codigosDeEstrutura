package Atividade4.QuestoesBruno.BoletimDeNotas;

class No {
    Disciplina disciplina;
    No proximo;

    No(Disciplina disciplina) {
        this.disciplina = disciplina;
        this.proximo = null;
    }
}