package Atividade4.QuestoesBruno.BoletimDeNotas;

public class Main {
    public static void main(String[] args) {
        Boletim boletim = new Boletim();

        boletim.adicionar(new Disciplina("Matemática", 8.5));
        boletim.adicionar(new Disciplina("Português", 7.0));
        boletim.adicionar(new Disciplina("História", 9.0));
        boletim.adicionar(new Disciplina("Geografia", 6.5));
        boletim.adicionar(new Disciplina("Física", 8.0));

        System.out.println(" Boletim:");
        System.out.println(boletim);

        int indice = 2;
        System.out.println("Disciplina na posição " + indice + ":");
        System.out.println(boletim.pega(indice));

        String busca = "Física";
        System.out.println("Disciplina '" + busca + "' existe? " + boletim.contem(busca));

        System.out.println("Total de disciplinas: " + boletim.getTamanho());
    }
}
