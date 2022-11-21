package com.matricula_estudiante;

import java.util.Scanner;

import com.matricula_estudiante.model.Docente;
import com.matricula_estudiante.model.Estudiante;
import com.matricula_estudiante.model.Persona;
import com.matricula_estudiante.view.FichaEstudiante;

/**
 * Tarea 3: Youtube - Belisario de la Matta
 * De acuerdo a lo aprendido, realice un pequeño programa a su eleccion usando
 * la herencia en clase padre y clase hijo.
 * NOTA: no olvidar crear la clase principal en el proyecto
 */

public class TestMatriculaEstudiante {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		Persona per = new Persona();
		Estudiante est = new Estudiante();
		Docente doc = new Docente();
		FichaEstudiante dataStudent = new FichaEstudiante();
		
		System.out.println("Solicitud de Ingreso");
		System.out.println("--------------------");
		
//		Ingreso datos personales
		System.out.print("Rut: "); per.setRut(cin.nextLine());
		System.out.print("Apellidos: "); per.setApellidos(cin.nextLine());
		System.out.print("Nombre: "); per.setNombre(cin.nextLine());
		System.out.print("Edad: "); per.setEdad(cin.nextInt());
		System.out.print("Sexo (M = Masculino, F = Femino): "); per.setSexo(cin.next().charAt(0));
		
//		Ingreso datos estudiantes
		est.setMatricula(2987);
		est.setNombreInstitucion("Instituto Profesional de Chile");
		est.setCarrera("Analista Programador Computacional");
		est.setMensualidad(166.582);
		
//		Ingreso datos docente
		doc.setRut("5773529-5");
		doc.setApellidos("Reyes Ortega");
		doc.setNombre("Claudio");
		doc.setEspecialidad("Ingenieria Informatica & CiberSeguridad");
		doc.setModuloAsignado("Taller de Programacion");
		
		
		dataStudent.showFichaStudent(per, est, doc);
	}

}
