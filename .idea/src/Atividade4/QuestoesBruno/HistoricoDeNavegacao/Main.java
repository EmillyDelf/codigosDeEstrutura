package Atividade4.QuestoesBruno.HistoricoDeNavegacao;

public class Main {
    public static void main(String[] args) {
        Historico historico = new Historico();

        historico.adicionar(new Pagina("Google", "https://www.google.com")/);
        historico.adicionar(new Pagina("YouTube", "https://www.youtube.com")/);
        historico.adicionar(new Pagina("Wikipedia", "https://www.wikipedia.org")/);
        historico.adicionar(new Pagina("GitHub", "https://www.github.com")/);
        historico.adicionar(new Pagina("StackOverflow", "https://stackoverflow.com")/);
        historico.adicionar(new Pagina("Twitter", "https://www.twitter.com")/);
        historico.adicionar(new Pagina("Instagram", "https://www.instagram.com")/);
        historico.adicionar(new Pagina("Facebook", "https://www.facebook.com")/);

        System.out.println("Histórico de Navegação:");
        System.out.println(historico);

        String busca = "YouTube";
        System.out.println("Página '" + busca + "' foi visitada? " + historico.contem(busca));

        System.out.println("Última página visitada:");
        System.out.println(historico.pegaUltimo());

        System.out.println("Total de páginas: " + historico.getTamanho());
    }
}