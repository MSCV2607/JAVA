package com.msv.odontologo.controller;

// Importo las clases necesarias
import com.msv.odontologo.Paciente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

// Defino el controlador REST de Spring
@RestController
public class OdontologoController {

    // Defino el endpoint para traer todos los pacientes
    @GetMapping("/pacientes/todos")
    @ResponseBody  // Indico que la respuesta será el cuerpo de la solicitud (la lista de pacientes)
    public List<Paciente> traerPacientes() {
        // Creo una lista vacía para almacenar los pacientes
        List<Paciente> ListaPaciente = new ArrayList<Paciente>();

        // Agrego algunos pacientes con datos ficticios
        ListaPaciente.add(new Paciente(1, 123, "Roman", "Valal", LocalDate.of(2019, 2, 1)));
        ListaPaciente.add(new Paciente(2, 321, "Marta", "Valal", LocalDate.of(2020, 2, 15)));
        ListaPaciente.add(new Paciente(3, 213, "Marcos", "Royo", LocalDate.of(1995, 2, 1)));

        // Retorno la lista completa de pacientes
        return ListaPaciente;
    }

    // Defino el endpoint para traer solo los pacientes menores de 18 años
    @GetMapping("/pacientes/menores")
    @ResponseBody  // Indico que la respuesta será el cuerpo de la solicitud (la lista de pacientes menores de 18 años)
    public List<Paciente> traerPacientesMenores() {
        // Creo una lista vacía para almacenar los pacientes
        List<Paciente> ListaPaciente = new ArrayList<Paciente>();


        ListaPaciente.add(new Paciente(1, 123, "Roman", "Valal", LocalDate.of(2019, 2, 1)));
        ListaPaciente.add(new Paciente(2, 321, "Marta", "Valal", LocalDate.of(2020, 2, 15)));
        ListaPaciente.add(new Paciente(3, 213, "Marcos", "Royo", LocalDate.of(1995, 2, 1)));

        // Creo una lista vacía donde voy a almacenar los pacientes menores de 18 años
        List<Paciente> PacientesMenores = new ArrayList<Paciente>();

        // Recorro todos los pacientes en la lista original
        for (Paciente paciente : ListaPaciente) {
            // Obtengo la fecha de nacimiento del paciente
            LocalDate fechaNac = paciente.getFechaNacimiento();

            // Calculo la diferencia entre la fecha de nacimiento y la fecha actual (edad)
            Period periodo = Period.between(fechaNac, LocalDate.now());

            // Si el paciente tiene 18 años o menos, lo agrego a la lista de pacientes menores
            if (periodo.getYears() <= 18) {
                PacientesMenores.add(paciente);
            }
        }

        // Retorno la lista de pacientes menores de 18 años
        return PacientesMenores;
    }
}


