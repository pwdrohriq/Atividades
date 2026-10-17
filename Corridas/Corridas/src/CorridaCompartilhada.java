public class CorridaCompartilhada extends Corridas{

    int passageiros;

    public CorridaCompartilhada(String origem, String destino, double distanciaKm, int minutos, int passageiros) {
        this.origem = origem;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.minutos = minutos;
        this.passageiros = passageiros;
    }
    /*
    É meljhorn usar super pq o trecho de codigo é o mesmo, retorna o valor padrao
    e depois faz o acrecimo que precisa
     */
    @Override
    public double calcularValor() {
        return tarifaPadrao()* 1.2 / passageiros;
    }

    @Override
    public String toString() {
        return "[Compartilhada x" + passageiros + "] " + super.toString();
    }
}

