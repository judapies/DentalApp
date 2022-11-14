package com.example.dentalapp.model;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Paciente {
	private Long id;
	private String nombre;
	private String documento;
	private String telefono;
	private String direccion;
	private String centroMedico;
	
	public Paciente(Long id, String nombre, String documento, String telefono, String direccion, String centroMedico) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.documento = documento;
		this.telefono = telefono;
		this.direccion = direccion;
		this.centroMedico = centroMedico;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCentroMedico() {
		return centroMedico;
	}

	public void setCentroMedico(String centroMedico) {
		this.centroMedico = centroMedico;
	}

	@Override
	public int hashCode() {
		return Objects.hash(centroMedico, direccion, documento, id, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(centroMedico, other.centroMedico) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(documento, other.documento) && id == other.id && Objects.equals(nombre, other.nombre)
				&& Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", documento=" + documento + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", centroMedico=" + centroMedico + "]";
	}
	
	
}
