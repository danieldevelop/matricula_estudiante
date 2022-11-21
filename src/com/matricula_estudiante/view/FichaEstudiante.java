package com.matricula_estudiante.view;

import com.matricula_estudiante.model.Docente;
import com.matricula_estudiante.model.Estudiante;
import com.matricula_estudiante.model.Persona;

public class FichaEstudiante {

	public void showFichaStudent(Persona per, Estudiante est, Docente doc) {
		String run = per.getRut().toUpperCase();
		String nombreEstudiante = per.getApellidos().toUpperCase() + " " + per.getNombre().toUpperCase();
		String nombreDocente = doc.getApellidos().toUpperCase() + " " + doc.getNombre().toUpperCase();
		
		System.out.println("\nFicha del Estudiante");
		System.out.println("----------------------");
		
//		Datos personales del estudiante
		System.out.println("----- Datos Personales -----");
		System.out.println("Rut: " + run);
		System.out.println(" | Nombre Estudiante: " + nombreEstudiante);
		System.out.println("\nEdad: " + per.getEdad() + "años");
		System.out.println((per.isEstadoCivil()) ? " | Estado civil: Casado" : " | Estado Civil: Soltero");
		System.out.println((per.getSexo() == 'M') ? " | Sexo: MASCULINO" : " | Sexo: FEMENINO");
		
//		Datos de la institucion
		System.out.println("\n\n----- Datos de la Institucion ------");
		System.out.println("Institución: " + est.getNombreInstitucion());
		System.out.println("N° de Matricula: " + est.getMatricula());
		System.out.println("Carrera: " + est.getCarrera());
		System.out.println("Mensualidad: $" + est.getMensualidad());
		
//		Datos del docente
		System.out.println("\n----- Datos de la Docente ------");
		System.out.println("Nombre del Docente: " + nombreDocente);
		System.out.println("Especialidad: " + doc.getEspecialidad());
		System.out.println("Modulo asignado: " + doc.getModuloAsignado());
		
	}
}
