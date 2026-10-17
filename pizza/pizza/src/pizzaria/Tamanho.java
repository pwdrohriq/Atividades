package pizzaria;

public enum Tamanho {
    pequena(10), media(15), grande(20), familia(25);

    private final int tempoForno;

    Tamanho(int tempoForno) {
        this.tempoForno = tempoForno;
    }

    public int getTempoForno() {
        return tempoForno;
    }
}

