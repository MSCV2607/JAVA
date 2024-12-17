class Empleado {

    private final String nombre;
    private String seccion;

    //Static
    private int ID;

    private static int IDsiguiente = 1;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.seccion = "Administracion";
        ID = IDsiguiente;
        IDsiguiente++;
    }

    public String getNombre() {
        return "El nombre es " + nombre;
    }

    public int getID() {
        return ID;
    }

    public String getSeccion() {
        return "La seccion es " + seccion;
    }

    public void cambioSeccion(String seccion) {
        this.seccion = seccion;
    }
}