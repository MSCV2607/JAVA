public class Jefe extends Persona {
    int idJefe;
    String depJefe;

    public Jefe() {
    }

    public Jefe(int id, String nombre, String apellido, String DNI, String domicilio, int telefono, int idJefe, String depJefe) {
        super(id, nombre, apellido, DNI, domicilio, telefono);
        this.idJefe = idJefe;
        this.depJefe = depJefe;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getDepJefe() {
        return depJefe;
    }

    public void setDepJefe(String depJefe) {
        this.depJefe = depJefe;
    }
}
