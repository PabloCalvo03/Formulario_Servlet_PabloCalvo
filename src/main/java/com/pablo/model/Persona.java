package com.pablo.model;

import java.io.Serializable;
import java.util.List;

public class Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellidos;
	private String correo;
	private String genero;
	private List<String> conocimientos;
	private List<String> idiomas;
	private String comentario;

	public Persona() {
		
	}
	
	

	public Persona(String nombre, String apellidos, String correo, String genero, List<String> conocimientos,
			List<String> idiomas, String comentario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.genero = genero;
		this.conocimientos = conocimientos;
		this.idiomas = idiomas;
		this.comentario = comentario;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<String> getConocimientos() {
		return conocimientos;
	}

	public void setConocimientos(List<String> conocimientos) {
		this.conocimientos = conocimientos;
	}

	public List<String> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List<String> idiomas) {
		this.idiomas = idiomas;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + ", genero=" + genero
				+ ", conocimientos=" + conocimientos + ", idiomas=" + idiomas + ", comentario=" + comentario + "]";
	}

}
