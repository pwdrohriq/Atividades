package Livraria;

public class LivroDidatico extends Livro {
    private String Disciplina;
    public LivroDidatico(int codigo, String nome, double preco, int estoque, String autor, int paginas, String disciplina) {
        super(codigo, nome, preco, estoque, autor, paginas);
        this.Disciplina = disciplina;
    }

    public String getDisciplina(){ return this.Disciplina;}
}
