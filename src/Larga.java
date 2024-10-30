public class Larga extends Arma implements Comparable<Larga> {
    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;

    public Larga(int cantidadMuniciones, double alcance, String marca, int calibre, String estado, Policia policia, String justifUso, int nivelArma, boolean tieneSello) {
        super(cantidadMuniciones, alcance, marca, calibre, estado, policia);
        this.justifUso = justifUso;
        this.nivelArma = nivelArma;
        this.tieneSello = tieneSello;
    }

    @Override
    public int compareTo(Larga otraArma) {
        return Integer.compare(this.nivelArma, otraArma.nivelArma);
    }

    @Override
    public String toString() {
        return "Larga{\n" +
                "   Justificacion de uso = '" + justifUso + "'\n" +
                "   Nivel arma = " + nivelArma + "\n" +
                "   Tiene sello = " + tieneSello + "\n" +
                "   Cantidad municiones = " + cantidadMuniciones + "\n" +
                "   Alcance = " + alcance + "\n" +
                "   Marca = '" + marca + "'\n" +
                "   Calibre = " + calibre + "\n" +
                "   Estado = '" + estado + "'\n" +
                "   Policia = " + getPolicia() + "\n" +
                '}';
    }
}
