package Logica;

public class Alumno {
    int id;
    String nombre;
    String apellido;

    //Constructor vacio
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public void mostrarNombre() {
        System.out.println("El nombre del alumno es: " + nombre + "Y su apellido es: " + apellido);
    }

    public void saberAprobado(double calificacion) {
        if(calificacion >= 60) {
            System.out.println("Aprobe la materia");
        } else {
            System.out.println("Debo estudiar mas");
        }
    }
}
