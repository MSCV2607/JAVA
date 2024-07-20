package Logica;

public class Flor extends Planta{
    private String colorPe;
    private int cantidadPromPe;
    private String colorPistilo;
    private String variedadFlor;
    private String estacionFlorece;

    public Flor() {
    }

    public Flor(String nombre, double altoTallo, boolean hojas, String clima, String colorPe, int cantidadPromPe, String colorPistilo, String variedadFlor, String estacionFlorece) {
        super(nombre, altoTallo, hojas, clima);
        this.colorPe = colorPe;
        this.cantidadPromPe = cantidadPromPe;
        this.colorPistilo = colorPistilo;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorPe() {
        return colorPe;
    }

    public void setColorPe(String colorPe) {
        this.colorPe = colorPe;
    }

    public int getCantidadPromPe() {
        return cantidadPromPe;
    }

    public void setCantidadPromPe(int cantidadPromPe) {
        this.cantidadPromPe = cantidadPromPe;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }

    @Override
    public void queSoy() {
        System.out.println("Hola soy una flor");
    }
}
