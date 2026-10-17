package pizzaria;

import javax.swing.*;

public class Item {
    private Pizza pizza;
    private int quantidade;

    public Item(Pizza pzz, int qtd){
        this.pizza = pzz;
        this.quantidade = qtd;
    }

    public Pizza getPizza(){
        return this.pizza;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double calcularTotal(){
        return this.quantidade*this.pizza.getPreco();
    }

    public void imprimir(){
        JOptionPane.showMessageDialog(null, this.pizza.imprimir() + "\nQuantidade: " + this.quantidade);
    }

    
}



