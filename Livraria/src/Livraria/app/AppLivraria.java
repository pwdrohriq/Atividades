package Livraria.app;
import Livraria.Livro;
import Livraria.Papelaria;
import Livraria.Produto;
public class AppLivraria {
    public static void main(String[] args) {
        Produto p = new Produto(1, "Mochila", 150.0, 8);
        System.out.println(p.getNome() + " Eh  caro? " + p.ehCaro());

        Livro livro = new Livro(2, "Java como programar", 200.0, 5, "Deitel", 1000);
        System.out.println(livro.getNome() + " de " + livro.getAutor());
        System.out.println("é caro? " + livro.ehCaro());
        System.out.println("é grande? " + livro.ehGrande());
        System.out.println(livro.toString());


        Papelaria caneta = new Papelaria(3, "Caneta azul", 3.5, 100,
"Esferográfica 1.0", "BIC");
        System.out.println(caneta.listarEtiqueta());

    }
}