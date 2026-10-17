package Livraria;

public class Livro extends Produto{
    protected String Autor;
    protected int Paginas;
    public Livro(int codigo, String nome, double preco, int estoque, String autor, int paginas) {
        super(codigo, nome, preco, estoque); // chama o construtor da superclasse Produto com os atributos dela
        this.Autor = autor;
        this.Paginas = paginas;
    }
        /* getNome e ehCaro funcionam por que sao metdos da superclasse
         a ultima linha imprimia o endereço de memoria do objeto, toStrinng vem
         da Object, superclasse base do java que todo novo objeto herda naturalmente*/

        public String getAutor(){return this.Autor;}
        public int getPaginas(){ return this.Paginas;}
        public boolean ehGrande(){ return this.Paginas > 200;}

        public String toString(){
        return this.getNome() + " de " + this.getAutor() + ", " + this.getPreco();
        }

}
