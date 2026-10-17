public class CorridaNoturna extends Corridas {
    public CorridaNoturna(String origem, String destino, double distanciaKm, int minutos) {
        this.origem = origem;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.minutos = minutos;
    }

    public double calcularValor() {
        return tarifaPadrao() + 6.00;
    }

    @Override
    public String toString(){
        return "[Noturna] " + super.toString();
    }

/*
alem de criar a classe nova, eh preciso criar o if instance of no for sem polimorfismo
so que no for each nao precisa fazer nada pq ele ja chama o metodo sobrecarregado.

inclusive, seria mto melhor fazer de norturna um boolean em Corridas
que o construtor recebe na criaçao do objeto corrida.
 dai testar ele ja no metodo dela, adicionando o valor a mais
 assim toda corrida poderia ser ou nao noturna, diferente de como ta agora
 */
}
