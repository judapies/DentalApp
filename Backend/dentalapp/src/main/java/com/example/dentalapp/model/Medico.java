package com.example.dentalapp.model;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Medico {
	private Long id;
	private String nombre;
	private String documento;
	private String telefono;
	private String consultorio;
	
	public Medico(Long id, String nombre, String documento, String telefono,String consultorio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.documento = documento;
		this.telefono = telefono;
		this.consultorio= consultorio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	public String getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(documento, id, nombre, telefono,consultorio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		return Objects.equals(documento, other.documento) && id == other.id && Objects.equals(nombre, other.nombre)
				&& Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "Medico [id=" + id + ", nombre=" + nombre + ", documento=" + documento + ", telefono=" + telefono + "]";
	}
	
	
}
