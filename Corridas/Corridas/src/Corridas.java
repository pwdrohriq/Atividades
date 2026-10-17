public abstract class Corridas {
    protected String origem;
    protected String destino;
    protected double distanciaKm;
    protected int minutos;


    /*
    é sobrecarga pq tem exatamente o mesmo nome, é decidido em tempo de compilaçao
    depende do parametro, se for vazio é esse, se tiver um double, é o outro
     */
    abstract public double calcularValor();

    protected double tarifaPadrao(){
        return 5.00 + 2.00 * distanciaKm + 0.30 * minutos;
    }

    public double calcularValor(double percentualDesconto) {
        return calcularValor() * (1 - percentualDesconto / 100);
    }

    @Override
    public String toString() {
        return origem + " -> " + destino + " (" + distanciaKm + " km, "
                + minutos + " min) - R$ " + String.format("%.2f", calcularValor());
    }
    /*
    rodar isso sem essa sobreposiçao vai imprimir o endereço de memoria do objeto
     */

    public String getOrigem(){return this.origem;}
    public String getDestino(){return this.destino;}
    public double getDistanciaKm(){return this.distanciaKm;}
    public int getMinutos(){return this.minutos;}
}