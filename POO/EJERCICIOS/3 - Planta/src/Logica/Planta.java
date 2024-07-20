package Logica;

public abstract class Planta {
    private String nombre;
    private double altoTallo;
    private boolean hojas;
    private String clima;

    public Planta() {
    }

    public Planta(String nombre, double altoTallo, boolean hojas, String clima) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.hojas = hojas;
        this.clima = clima;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isHojas() {
        return hojas;
    }

    public void setHojas(boolean hojas) {
        this.hojas = hojas;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "nombre='" + nombre + '\'' +
                ", altoTallo=" + altoTallo +
                ", hojas=" + hojas +
                ", clima='" + clima + '\'' +
                '}';
    }

    public abstract void queSoy();

}
