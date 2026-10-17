package pizzaria.app;

import pizzaria.Item;
import pizzaria.Pedido;
import pizzaria.Pizza;
import pizzaria.Tamanho;
import pizzaria.controle.ControlePizza;


import javax.swing.*;

public class Appteste {
    static public void main(String[] args) {

        Pizza pizza1 = new Pizza(1111, "Mussarela", Tamanho.grande, 60.00), pizza2 = new Pizza(1112, "Calabresa", Tamanho.familia, 75.00);

        JOptionPane.showMessageDialog(null, pizza1.imprimir());
        JOptionPane.showMessageDialog(null, pizza2.imprimir());

        Item item1 = new Item(pizza1, 5), item2 = new Item(pizza2, 3);
        item1.imprimir();

        Pedido pedido1 = new Pedido("24/09/2026", 1113);
        pedido1.AddItens(item1);
        pedido1.AddItens(item2);
        JOptionPane.showMessageDialog(null, pedido1.imprimir());

    }
}

