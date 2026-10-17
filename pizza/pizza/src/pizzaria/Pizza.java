package pizzaria;

public class Pizza {
    private int codigo;
    private String sabor;
    private Tamanho tamanho;
    private double preco;

    public Pizza(int codigo, String sabor, Tamanho tamanho, double preco){
        this.codigo = codigo;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getSabor(){
        return this.sabor;
    }

    public Tamanho getTamanho(){
        return this.tamanho;
    }

    public double getPreco(){
        return this.preco;
    }

    public String imprimir(){
        return "Codigo: " + this.codigo +"\nSabor: "+ this.sabor + "\nTamanho: "+ this.tamanho + "\nPreco: " + this.preco + "\nTempo: " + this.tamanho.getTempoForno() + " Minutos";
    }

}
