package com.msv.odontologo;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    private long id;
    private int DNI;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Paciente() {
    }

    public Paciente(long id, int DNI, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.id = id;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
