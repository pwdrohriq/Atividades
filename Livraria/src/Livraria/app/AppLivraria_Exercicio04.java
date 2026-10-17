package Livraria.app;
import Livraria.Livro;
import Livraria.LivroDidatico;
import Livraria.Papelaria;
import Livraria.Produto;

import java.util.ArrayList;
public class AppLivraria_Exercicio04 {
    public static void main(String[] args) {
        ArrayList <Produto> produtos = new ArrayList();
        String resultado="";
        produtos.add(new Livro(3,"Java Como Programar", 200.0,5,"Deitel", 1000));
        produtos.add(new Produto(4,"Lapis Preto", 2.0,50));
        produtos.add(new Papelaria(5, "Caneta Azul", 3.5, 100,"Esferografica 1.0mm", "BIC"));
        produtos.add(new Livro (6,"A hora da estrela",43.0, 7,"Clarice Lispector",
        120));
        produtos.add(new LivroDidatico(7, "Principia", 150.00, 1, "Sir Isaac Newton", 300, "Matematica/Fisica"));

        for (int i=0; i<produtos.size(); i++){
            resultado = resultado + produtos.get(i).listar() + "\n--------\n";
            if (produtos.get(i) instanceof Livro) {
                System.out.println(((Livro) produtos.get(i)).ehGrande());
            }
        }
        System.out.println(resultado);
    }
}
/*
a) o erro do codigo é q ele chama o metodo solto sem imprimir, e tambem pq é um metodo de Livro, mas nem
todos os itens do List sao livros

b) nao, pq nem todos os itens sao livros, entao nao tem acesso a esse metodo

c) assim funciona pq SE o produto for um livro, ele imprime o resultado do metodo

*/