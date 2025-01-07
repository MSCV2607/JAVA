package com.msv.ejercicio3;

public class platos {
    private long numPlato;
    private String nombrePlato;
    private double precioPlato;
    private String descripcionPlato;

    public platos(long numPlato, String nombrePlato, double precioPlato, String descripcionPlato) {
        this.numPlato = numPlato;
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
        this.descripcionPlato = descripcionPlato;
    }

    public long getNumPlato() {
        return numPlato;
    }

    public void setNumPlato(long numPlato) {
        this.numPlato = numPlato;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getPrecioPlato() {
        return precioPlato;
    }

    public void setPrecioPlato(double precioPlato) {
        this.precioPlato = precioPlato;
    }

    public String getDescripcionPlato() {
        return descripcionPlato;
    }

    public void setDescripcionPlato(String descripcionPlato) {
        this.descripcionPlato = descripcionPlato;
    }

    @Override
    public String toString() {
        return "Plato #" + numPlato + "\n " + nombrePlato + "\n - $" + precioPlato + "\nDescripción: " + descripcionPlato;
    }
}
