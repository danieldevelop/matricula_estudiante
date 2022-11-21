package com.matricula_estudiante.model;

public class Estudiante extends Persona {

	private int matricula;
	private String nombreInstitucion;
	private String carrera;
	private String horario;
	private double mensualidad;
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNombreInstitucion() {
		return nombreInstitucion;
	}
	
	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}
	
	public String getCarrera() {
		return carrera;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public double getMensualidad() {
		return mensualidad;
	}
	
	public void setMensualidad(double mensualidad) {
		this.mensualidad = mensualidad;
	}
}
