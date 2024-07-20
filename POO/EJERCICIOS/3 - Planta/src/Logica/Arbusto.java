package Logica;

public class Arbusto extends Planta {
    private double ancho;
    private boolean esDomestico;
    private String varidadArbusto;
    private String colorArbusto;
    private boolean sePoda;

    public Arbusto() {
    }

    public Arbusto(String nombre, double altoTallo, boolean hojas, String clima, double ancho, boolean esDomestico, String varidadArbusto, String colorArbusto, boolean sePoda) {
        super(nombre, altoTallo, hojas, clima);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.varidadArbusto = varidadArbusto;
        this.colorArbusto = colorArbusto;
        this.sePoda = sePoda;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVaridadArbusto() {
        return varidadArbusto;
    }

    public void setVaridadArbusto(String varidadArbusto) {
        this.varidadArbusto = varidadArbusto;
    }

    public String getColorArbusto() {
        return colorArbusto;
    }

    public void setColorArbusto(String colorArbusto) {
        this.colorArbusto = colorArbusto;
    }

    public boolean isSePoda() {
        return sePoda;
    }

    public void setSePoda(boolean sePoda) {
        this.sePoda = sePoda;
    }

    @Override
    public void queSoy() {
        System.out.println("Hola soy un arbusto");
    }
}
