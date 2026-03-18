package Atividade_A;

public class Vetor {

    private String[] elementos;
    private int capacidade;

    public Vetor(int tamanho) {
        elementos = new String[tamanho];
        this.capacidade = 0;


    }

    // Metodo de adicionar, ele funciona para adicionar uma palavra no array ou "Vetor".

    public void adicionar(String pergunta){;

        if (capacidade < elementos.length) {
            elementos[capacidade] = pergunta;
            capacidade++;


        }
    }

    //Parte A

    //#1 questão

    // Metodo de estaVazia, esse metodo funciona para analisa se o array ou "Vetor" estar vazio e retornar em modo booleano.
    public boolean estaVazia(){
        if (capacidade == 0){
            return true;
        }else {
            return false;
        }
    }


    //#3 questão

    // Metodo de imprimeUmPorLinha, esse metodo ele vai imprimir o Vetor por linha.
    public void imprimeUmPorLinha(){
        for (int i = 0; i < capacidade; i++) {
            System.out.println(elementos[i]);
        }
    }

    // #2 questão

    //Metodo ultimo, esse metodo ele vai procura o ultimo que foi criado no array ou "Vetor.

    public String ultimo(){
        if (capacidade == 0){
            throw new IllegalStateException("Vetor estar Vazio.");
        }

        return elementos[capacidade-1];
    }


    //#4 Quetão

    //Metodo contem, esse metodo vai procurar o nome dentro do array e vai dizer se é true ou false

    public boolean contem(String elemento){

        for (int i = 0; i < capacidade; i++) {
            if (elementos[i].equals(elemento)){
                return true;
            }
        }

        return false;
    }

    // #5 Busca foi adicionado por conta dos testes

    //Metodo busca, esse metodo vai buscar o nome dentro do Vetor e vai aparecer o indice do array, caso não tiver o nome dentro do array vai reponder -5.

    public int busca(String elemento) {
        for (int i = 0; i < capacidade; i++) {
            if (elementos[i].equals(elemento)){
                return i;
            }
        }

        return -5;
    }

    // Parte C
    //# 8 Questão

    // Metodo limpar, esse metodo vai limpar o array ou "vetor".

    public void limpar(){
        for (int i = 0; i < capacidade; i++) {
            elementos[i] = null;
        }
        capacidade = 0;
    }

    //#9 Questão

    //Metodo contarOcorrencia, Esse metodo vai contar nomes repetidos no array.

    public int contarOcorrencias(String elemento){
        int contador = 0;
        for (int i = 0; i < capacidade; i++) {
            if (elementos[i].equals(elemento)){
                contador++;
            }
        }

        return contador;
    }

    //#10 Questão

    //Metodo substituir, esse metodo vai substituir um nome antigo para outro nome novo.

    public boolean substituir(String antigo, String novo){
        for (int i = 0; i < capacidade; i++) {
            if (elementos[i].equals(antigo)){
                elementos[i] = novo;
                return true;
            }
        }
        return false;
    }
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String[] getElementos() {
        return elementos;
    }

    public void setElementos(String[] elementos) {
        elementos = elementos;
    }
}