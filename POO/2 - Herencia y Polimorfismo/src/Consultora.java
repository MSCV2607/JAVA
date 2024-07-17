public class Consultora extends Persona {

    String nombreConsultora;
    int numConsultor;

    public Consultora() {
    }

    public Consultora(int id, String nombre, String apellido, String DNI, String domicilio, int telefono, String nombreConsultora, int numConsultor) {
        super(id, nombre, apellido, DNI, domicilio, telefono);
        this.nombreConsultora = nombreConsultora;
        this.numConsultor = numConsultor;
    }

    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public int getNumConsultor() {
        return numConsultor;
    }

    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }
}
