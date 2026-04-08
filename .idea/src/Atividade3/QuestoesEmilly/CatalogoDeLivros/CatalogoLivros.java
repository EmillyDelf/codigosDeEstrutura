package Atividade3.QuestoesEmilly.CatalogoDeLivros;

import Atividade3.QuestoesEmilly.estruturas.ListaEncadeada;

// Programa principal do catálogo de livros
public class CatalogoLivros {
    public static void main(String[] args) {
        ListaEncadeada<Livro> catalogo = new ListaEncadeada<>();

        // Cadastrar livros
        catalogo.adiciona(new Livro("1984", "George Orwell", 1949));
        catalogo.adiciona(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        catalogo.adiciona(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        catalogo.adiciona(new Livro("Harry Potter", "J.K. Rowling", 1997));
        catalogo.adiciona(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));

        // Mostrar todos
        System.out.println("Todos os livros cadastrados:");
        catalogo.mostraTodos();

        System.out.println("\nPrimeiro livro cadastrado:");
        System.out.println(catalogo.pegaPrimeiro());

        System.out.println("\nÚltimo livro cadastrado:");
        System.out.println(catalogo.pegaUltimo());

        System.out.println("\nQuantidade de livros: " + catalogo.getTamanho());
    }
}