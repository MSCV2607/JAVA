/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sql_connection.Controller;

import com.mycompany.sql_connection.Controller.exceptions.NonexistentEntityException;
import com.mycompany.sql_connection.logica.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mauro
 */
public class ControladoraPersistencia {
    AlumnoJpaController alujpa = new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
       alujpa.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            alujpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            alujpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return alujpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        List <Alumno> listaA = alujpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(listaA);
        return listaAlumnos;
    }
}