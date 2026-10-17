public class CorridaMoto extends Corridas{

    public CorridaMoto(String origem, String destino, double distanciaKm, int minutos) {
        this.origem = origem;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.minutos = minutos;
    }
    @Override
    public double calcularValor() {
        return tarifaPadrao()*0.75;
    }
    @Override
    public String toString() {
        return "[Moto] " + super.toString();
    }
}
