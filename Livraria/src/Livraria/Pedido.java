package Livraria;

import java.util.ArrayList;

public class Pedido {

    public ArrayList<Item> itens;
    public int codigo;
    public String Data;

    public Pedido(int codigo, String data){
        this.codigo = codigo;
        this.Data = data;
        this.itens = new ArrayList<>();
    }

    public void addItens(Produto produto, int qtd){
        itens.add(new Item( produto, qtd));
    }

    public String getData(){ return this.Data;}
    public int getCodigo(){ return this.codigo;}

    public double calcularValor(){
        double total =0;
        for(Item i : itens){
            total += i.getValor();
        }
        return total;
    }
}
