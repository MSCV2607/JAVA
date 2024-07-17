public class Persona {
    int id;
    String nombre;
    String apellido;
    String DNI;
    String domicilio;
    int telefono;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String DNI, String domicilio, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
