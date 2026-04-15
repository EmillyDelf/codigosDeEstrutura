package Atividade4.QuestoesLuiz.PlaylistMusica;

public class Musica {
    String titulo;
    String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " | Artista: " + artista;
    }
}