package Atividade4.QuestoesBruno.HistoricoDeNavegacao;

class No {
    Pagina pagina;
    No proximo;

    No(Pagina pagina) {
        this.pagina = pagina;
        this.proximo = null;
    }
}
