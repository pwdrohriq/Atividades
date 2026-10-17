public class CorridaExecutiva extends Corridas{

    public CorridaExecutiva(String origem, String destino,
                    double distanciaKm, int minutos) {
        this.origem = origem;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.minutos = minutos;
    }

    @Override
    public double calcularValor() {
        return tarifaPadrao()*1.5;
    }
    @Override
    public String toString() {
        return "[Executiva] " + super.toString();
    }
}
