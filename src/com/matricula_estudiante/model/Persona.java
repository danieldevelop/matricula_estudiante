package com.matricula_estudiante.model;

public class Persona {
	
	private String rut;
	private String apellidos;
	private String nombre;
	private int edad;
	private boolean estadoCivil;
	private String nacionalidad;
	private char sexo;
	
	public Persona() {
		this.apellidos = "";
		this.nombre = "";
		this.edad = 0;
		this.estadoCivil = false;
		this.nacionalidad = "";
	}
	
	public String getRut() {
		return rut;
	}
	
	public void setRut(String rut) {
		this.rut = rut;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean isEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
