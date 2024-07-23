/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sql_connection.logica;

import com.mycompany.sql_connection.Controller.ControladoraPersistencia;
import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class Controladora {
    ControladoraPersistencia controlPer = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu) {
    controlPer.crearAlumno(alu);
    }
    public void eliminarAlumno(int id){
        controlPer.eliminarAlumno(id);
    }
    public void editAlumno(Alumno alu){
        controlPer.editarAlumno(alu);
    }
    
    //FUNCION traer alumno
    public Alumno traerAlumno(int id) {
    return controlPer.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumno(){
    return controlPer.traerListaAlumnos();
    }
    
}
