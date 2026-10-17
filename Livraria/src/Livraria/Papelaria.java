package Livraria;

public class Papelaria extends Produto {
    private String descricao;
    private String fabricante;
    public Papelaria(int codigo, String nome, double preco, int estoque,
                     String descricao, String fabricante) {
        super(codigo, nome, preco, estoque);
        this.descricao = descricao;
        this.fabricante = fabricante;
    }
    public String listarEtiqueta() {
        return nome + " - " + fabricante + " - " + preco;
        // nao tem problema pra usar esses metodos pq sao protected, classes herdeiras tem acesso direto
        // se trocar por private ele nem compila
        // deixar protected é melhor do que criar getters pra esses atributos
            }
}