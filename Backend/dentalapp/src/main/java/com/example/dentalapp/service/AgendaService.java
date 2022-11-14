package com.example.dentalapp.service;

import java.util.List;
import java.util.Optional;

import com.example.dentalapp.model.Agenda;
import com.example.dentalapp.model.Paciente;


public interface AgendaService {
	public List<Agenda> consultarAgenda();		
	public Optional<Agenda> consultarAgendaPorId(Long id);
	public List<Optional<Agenda>> consultarAgendaPorDocumentoPaciente(String documento);
	public List<Optional<Agenda>> consultarAgendaPorNombrePaciente(String nombre);
	public List<Optional<Agenda>> consultarAgendaPorDocumentoMedico(String documento);
	public List<Optional<Agenda>> consultarAgendaPorNombreMedico(String nombre);
	public Agenda crearAgenda(Agenda agenda);
	public String eliminarAgendaPorId(Long id);
	public String eliminarAgendaPorDocumentoPaciente(String documento);
	public Agenda actualizarAgenda(Agenda agenda);
}
