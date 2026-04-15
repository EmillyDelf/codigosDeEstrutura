package Atividade4.QuestoesBruno.VagaDeEstacionamento;

public class Main {
    public static void main(String[] args) {
        Estacionamento est = new Estacionamento();

        est.adicionar(new Carro("ABC-1234", "Gol"));
        est.adicionar(new Carro("DEF-5678", "Civic"));
        est.adicionar(new Carro("GHI-9012", "Corolla"));
        est.adicionar(new Carro("JKL-3456", "HB20"));
        est.adicionar(new Carro("MNO-7890", "Onix"));

        System.out.println(" Carros estacionados:");
        System.out.println(est);

        String busca = "GHI-9012";
        System.out.println("Carro com placa " + busca + " está no estacionamento? " + est.contem(busca));

        System.out.println("Primeiro carro estacionado:");
        System.out.println(est.pegaPrimeiro());

        System.out.println("Último carro estacionado:");
        System.out.println(est.pegaUltimo());
    }
}