package Atividade4.QuestoesLuiz.ChamadaTurma;

public class Aluno {
    String nome;
    int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Matrícula: " + matricula;
    }
}