package Atividade3.QuestoesLuiz.PlaylistMusica;


public class No3<T> {
    public T valor;
    No3<T> proximo;

    public No3(T valor) {
        this.valor = valor;
        this.proximo = null;
    }
}
