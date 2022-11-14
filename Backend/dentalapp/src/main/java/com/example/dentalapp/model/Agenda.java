package com.example.dentalapp.model;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Agenda {
	private Long id;
	private String fecha;
	private String hora;
	private Long medicoId;
	private String documentoPaciente;
	
	public Agenda(Long id, String fecha, String hora, Long medicoId, String documentoPaciente) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.medicoId = medicoId;
		this.documentoPaciente = documentoPaciente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Long getMedicoId() {
		return medicoId;
	}

	public void setMedicoId(Long medicoId) {
		this.medicoId = medicoId;
	}

	public String getDocumentoPaciente() {
		return documentoPaciente;
	}

	public void setDocumentoPaciente(String documentoPaciente) {
		this.documentoPaciente = documentoPaciente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(documentoPaciente, fecha, hora, id, medicoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(documentoPaciente, other.documentoPaciente) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(hora, other.hora) && Objects.equals(id, other.id)
				&& Objects.equals(medicoId, other.medicoId);
	}

	@Override
	public String toString() {
		return "Agenda [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", medicoId=" + medicoId
				+ ", documentoPaciente=" + documentoPaciente + "]";
	}	
	
	
}
