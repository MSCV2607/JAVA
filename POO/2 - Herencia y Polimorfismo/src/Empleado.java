//La herencia se realiza con la palabra reservada extends [clasHija extends clasePadre]
public class Empleado extends Persona {
    int numLegajo;
    String cargo;
    int sueldo;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String DNI, String domicilio, int telefono, int numLegajo, String cargo, int sueldo) {
        super(id, nombre, apellido, DNI, domicilio, telefono);
        this.numLegajo = numLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
