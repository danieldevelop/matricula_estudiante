package com.matricula_estudiante.model;

public class Docente extends Persona {

	private String especialidad;
	private String moduloAsignado;
	
	public String getEspecialidad() {
		return especialidad;
	}
	
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public String getModuloAsignado() {
		return moduloAsignado;
	}
	
	public void setModuloAsignado(String moduloAsignado) {
		this.moduloAsignado = moduloAsignado;
	}
	
}
