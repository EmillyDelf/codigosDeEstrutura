package Atividade4.QuestoesBruno.VagaDeEstacionamento;

public class Carro {
    String placa;
    String modelo;

    Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + " | Modelo: " + modelo;
    }
}

