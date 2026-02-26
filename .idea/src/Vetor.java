public class Vetor {

    private String[] Elementos;
    private int capacidade;

    public Vetor(int capacidade) {

        this.capacidade = 0;


    }

    public void adicionar(String pergunta){;
        String[] Elemento = {pergunta};
        setElementos(Elemento);

        for (String e : Elemento){
            System.out.println(e);
        }
    }

    public void estaVazia(){
        if (getElementos() == null){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }


    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String[] getElementos() {
        return Elementos;
    }

    public void setElementos(String[] elementos) {
        Elementos = elementos;
    }
}