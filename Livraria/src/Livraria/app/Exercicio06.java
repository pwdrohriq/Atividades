package Livraria.app;
import Livraria.Livro;
import Livraria.LivroDidatico;
import Livraria.Papelaria;
import Livraria.Produto;

import javax.swing.*;
import java.util.ArrayList;

public class Exercicio06 {


    public static void cadastrarProduto(ArrayList<Produto> proutos){
        Produto p;
        int menu =1;
        while (menu!=0) {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "[0] Sair\n[1] Livro\n[2]Papelaria\n[3]Livro Didatico\n[4] Produto Qualquer"));

            if(menu==0) break;

            int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo"));
            String nome = JOptionPane.showInputDialog(null, "Nome");
            double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço"));
            int estoque = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade em estoque"));

            switch (menu){
                case(1):{
                    String Autor = JOptionPane.showInputDialog(null, "Autor:");
                    int paginas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de paginas:"));
                    p = new Livro(codigo, nome, preco, estoque, Autor, paginas);
                    proutos.add(p);
                    break;
                } case(2):{
                    String Descricao  = JOptionPane.showInputDialog(null, "Descriçao do produto:");
                    String fabricante = JOptionPane.showInputDialog(null, "Fabricante:");
                    p= new Papelaria(codigo, nome, preco, estoque, Descricao, fabricante );
                    proutos.add(p);
                } case(3):{
                    String Disciplina = JOptionPane.showInputDialog(null , "Diisciplina:");
                    String Autor = JOptionPane.showInputDialog(null , "Autor:");
                    int paginas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de paginas:"));
                    p = new LivroDidatico(codigo, nome, preco, estoque, Autor, paginas, Disciplina);
                    proutos.add(p);
                    break;
                } case(4):{
                    p = new Produto(codigo, nome, preco, estoque);
                    proutos.add(p);
                    break;
                } default: JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja Adicionar outro item?\n[0] Naes\n[1] Sim"));
            if(menu == 0) break;
        }
        String s = "";
        double total =0;
        for(Produto produto : proutos){
            s += produto.listar() + "\n";
            total += produto.getPreco();
        }
        s += "R$ " + total;
        JOptionPane.showMessageDialog(null, "Itens e Total:\n" + s);
    }


    public static void main(String[] args) {
        ArrayList <Produto> produtos = new ArrayList();
        String resultado="";
        produtos.add(new Livro(3,"Java Como Programar", 200.0,5,"Deitel", 1000));
        produtos.add(new Produto(4,"Lapis Preto", 2.0,50));
        produtos.add(new Papelaria(5, "Caneta Azul", 3.5, 100,"Esferografica 1.0mm", "BIC"));
        produtos.add(new Livro (6,"A hora da estrela",43.0, 7,"Clarice Lispector",
                120));
        produtos.add(new LivroDidatico(7, "Principia", 150.00, 1, "Sir Isaac Newton", 300, "Matematica/Fisica"));

            cadastrarProduto(produtos);

    }
}
