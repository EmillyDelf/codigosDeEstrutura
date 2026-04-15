package Atividade4.QuestoesBruno.VagaDeEstacionamento;

class No {
    Carro carro;
    No proximo;

    No(Carro carro) {
        this.carro = carro;
        this.proximo = null;
    }
}