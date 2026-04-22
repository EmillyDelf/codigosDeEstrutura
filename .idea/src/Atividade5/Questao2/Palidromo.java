package Atividade5.Questao2;

public class Palidromo {
    
    public boolean ehpalidromo(String nome){
        if (nome.length() <= 1){
            return true;
        }
        if (nome.charAt(0) != nome.charAt(nome.length() -1)){
            return false;
        }

        return ehpalidromo(nome.substring(1, nome.length() -1));
    }
}
