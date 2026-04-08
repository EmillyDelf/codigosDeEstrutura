package Atividade3.QuestoesLuiz.ChamadaTurma;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Luiz", 25);
        Aluno aluno2 = new Aluno("Otavio", 26);
        Aluno aluno3 = new Aluno("Jose", 27);
        Aluno aluno4 = new Aluno("Maria", 28);
        Aluno aluno5 = new Aluno("Neves", 29);

        ListaEncadeada<Aluno> lista = new ListaEncadeada<>();
        lista.adiciona(aluno1);
        lista.adiciona(aluno2);
        lista.adiciona(aluno3);
        lista.adiciona(aluno4);
        lista.adiciona(aluno5);
        System.out.println("Lista completa dos alunos. ");
        lista.mostrar();
        System.out.println("========Primeiro da lista========");
        System.out.println(" ");
        System.out.println(lista.pegaPrimeiro());
        System.out.println("========Ultimo da lista========");
        System.out.println(" ");
        System.out.println(lista.pegaUltimo());
        System.out.println("========Tamnho da lista========");
        System.out.println(" ");
        System.out.println(lista.getTamanho());
    }
}