public class Corta extends Arma {
    private boolean esAutomatica;

    public Corta(int cantidadMuniciones, double alcance, String marca, int calibre, String estado, Policia policia, boolean esAutomatica) {
        super(cantidadMuniciones, alcance, marca, calibre, estado, policia);
        this.esAutomatica = esAutomatica;
    }

    public boolean efectivaADistancia() {
        return alcance >= 200;
    }

    @Override
    public String toString() {
        return "Corta{\n" +
                "   Es automatica? = " + esAutomatica + "\n" +
                "   Cantidad de Municiones = " + cantidadMuniciones + "\n" +
                "   Alcance = " + alcance + "\n" +
                "   Marca = '" + marca + "'\n" +
                "   Calibre = " + calibre + "\n" +
                "   Estado = '" + estado + "'\n" +
                "   Policia = " + getPolicia() + "\n" +
                '}';
    }
}
