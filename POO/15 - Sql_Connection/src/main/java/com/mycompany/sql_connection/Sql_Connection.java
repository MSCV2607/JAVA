/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sql_connection;

import com.mycompany.sql_connection.Controller.ControladoraPersistencia;
import com.mycompany.sql_connection.logica.Alumno;
import com.mycompany.sql_connection.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mauro
 */
public class Sql_Connection {
    public static void main(String[] args) {
        // ESTO PARA CREAR LAS TABLAS ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        Controladora control = new Controladora();
        
        /*CREO UN ALUMNO*/
        Alumno alu1 = new Alumno(10,"Mauro","Seb",new Date());
        Alumno alu2 = new Alumno (20,"Sabri","Soto",new Date());
        //control.crearAlumno(alu2); 
        
        /* EDITAR ALUMNO
        alu1.setApellido("Loto");
        control.editAlumno(alu1);
        */
        
        /*ELIMINAR ALUMNO
        control.eliminarAlumno(10); */
        
        System.out.println("------------------------------------ALUMNO------------------------------------");
        Alumno alu = control.traerAlumno(10);
        System.out.println("El alumno es: "+alu.toString());
        
        System.out.println("------------------------------------LISTA ALUMNOS------------------------------------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumno();
        for(Alumno al : listaAlumnos) {
            System.out.println("El alumno es: "+ al.toString());
        }
    }
        
}
