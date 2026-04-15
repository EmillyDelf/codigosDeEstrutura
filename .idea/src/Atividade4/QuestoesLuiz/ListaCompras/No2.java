package Atividade4.QuestoesLuiz.ListaCompras;

public class No2<T> {
    T valor;
    No2<T> proximo;  // era No<T> - corrigido para No2<T>

    public No2(T valor) {
        this.valor = valor;
        this.proximo = null;
    }
}