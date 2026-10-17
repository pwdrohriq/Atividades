package Livraria;

public class Item {
    private Produto produto;
    private int quantidade;

    public  Item(Produto pruduto, int qtd){
        this.produto = pruduto;
        this.quantidade = qtd;
    }
    public Produto getProduto(){return this.produto;}
    public int getQuantidade(){ return this.quantidade;}

    public double getValor(){
        return this.produto.getPreco() * this.quantidade;
    }
}
