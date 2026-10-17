public class CorridaEconomica extends Corridas{

    public CorridaEconomica(String origem, String destino, double distanciaKm, int minutos) {
        this.origem = origem;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.minutos = minutos;
    }


    @Override
    public double calcularValor() {
        return tarifaPadrao();
    }

    @Override
    public String toString(){
        return "[Economica] " + super.toString();
    }
}
