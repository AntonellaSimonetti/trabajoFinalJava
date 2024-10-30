public abstract class Arma {
    protected int cantidadMuniciones;
    protected double alcance;
    protected String marca;
    protected int calibre;
    protected String estado;
    private Policia policia;

    public Arma(int cantidadMuniciones, double alcance, String marca, int calibre, String estado, Policia policia) {
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        this.policia = policia;
    }

    public boolean enCondicion() {
        return estado.equals("EN USO") && calibre >= 9;
    }

    public Policia getPolicia() {
        return policia;
    }

    @Override
    public abstract String toString();
}

