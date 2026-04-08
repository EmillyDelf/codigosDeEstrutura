package Atividade3.QuestoesEmilly.ListaDeConvidados;

// Representa um convidado
public class Convidado {
    private String nome;
    private String cpf;

    public Convidado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Convidado)) return false;
        Convidado outro = (Convidado) obj;
        return this.nome.equalsIgnoreCase(outro.nome) && this.cpf.equals(outro.cpf);
    }
}