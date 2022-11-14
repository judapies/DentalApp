package com.example.dentalapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dentalapp.model.Agenda;

@Repository
public interface AgendaRepository extends MongoRepository<Agenda, Long>{
	
	@Query("{fecha:'?0',hora'?1'}")
	public List<Agenda> findByFechaAndHora(String fecha,String hora);
	
	@Query("{medicoId:?0}")
	public List<Optional<Agenda>> consultarAgendaByIdMedico(Long id);
	
	@Query("{id:?0}")
	public List<Optional<Agenda>> consultarAgendaByIdPaciente(Long id);
	
	@Query("{documento:'?0'}")
	public List<Optional<Agenda>> consultarAgendaByDocumentoMedico(String documento);
	
	@Query("{documentoPaciente:'?0'}")
	public List<Optional<Agenda>> consultarAgendaByDocumentoPaciente(String documentoPaciente);
	
	@Query("{nombre:'?0'}")
	public List<Optional<Agenda>> consultarAgendaByNombrePaciente(String nombre);
	
	@Query("{nombre:'?0'}")
	public List<Optional<Agenda>> consultarAgendaByNombreMedico(String nombre);
	
	@Query("{documento:'?0'}")
	public Optional<Agenda> eliminarAgendaByDocumentoPaciente(String documento);
}
