package Atividade4.QuestoesLuiz.PlaylistMusica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Cartinha Pra Seu luis", "Flavio Jose");
        Musica musica2 = new Musica("Numa Sala de Reboco", "Filho Do Piserio");
        Musica musica3 = new Musica("5 Da Manhã", "Rai Saia Rodada");
        Musica musica4 = new Musica("Paredões", "Grelo");
        Musica musica5 = new Musica("Mega Sena", "Pablo");
        Musica musica6 = new Musica("Bilu Bilu", "Pablo");


        ListaEncadeada3<Musica> lista = new ListaEncadeada3<>();
        lista.adiciona(musica1);
        lista.adiciona(musica2);
        lista.adiciona(musica3);
        lista.adiciona(musica4);
        lista.adiciona(musica5);
        lista.adiciona(musica6);

        System.out.println("Lista da playlist ");
        lista.mostrar();

        System.out.println("Verificando musica...");
        System.out.println(" ");
        System.out.println(lista.contemMusica("Cartinha Pra Seu luis"));

        System.out.println("Quantidade musicas na playlist...");
        System.out.println(" ");
        System.out.println(lista.getTamanho());
    }
}