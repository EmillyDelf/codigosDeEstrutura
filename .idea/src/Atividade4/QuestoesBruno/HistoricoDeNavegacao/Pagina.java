package Atividade4.QuestoesBruno.HistoricoDeNavegacao;

class Pagina {
    String titulo;
    String url;

    Pagina(String titulo, String url) {
        this.titulo = titulo;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | URL: " + url;
    }
}