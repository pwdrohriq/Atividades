package pizzaria.controle;

import pizzaria.Pizza;
import pizzaria.Tamanho;

import javax.swing.*;
import java.util.ArrayList;

public class ControlePizza {

    private ArrayList <Pizza> pizzas = new ArrayList();

    public void cadastrarPizza(int codigo, String sabor, Tamanho tamanho, double preco){
        pizzas.add(new Pizza(codigo, sabor, tamanho, preco));
    }

    public Pizza pesquisarPizza(int codigo){
        for(Pizza p : pizzas){
            if(p.getCodigo() == codigo) return p;
        }
        return null;
    }
}

