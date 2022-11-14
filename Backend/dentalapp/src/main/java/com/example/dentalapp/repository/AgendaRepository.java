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
	
	@Query("{id:?0}")
	public Optional<Agenda> consultarAgendaByIdMedico(Long id);
	
	@Query("{documento:'?0'}")
	public Optional<Agenda> consultarAgendaByDocumentoMedico(String documento);
	
	@Query("{documento:'?0'}")
	public Optional<Agenda> consultarAgendaByDocumentoPaciente(String documento);
	
	@Query("{nombre:'?0'}")
	public Optional<Agenda> consultarAgendaByNombrePaciente(String nombre);
	
	@Query("{nombre:'?0'}")
	public Optional<Agenda> consultarAgendaByNombreMedico(String nombre);
	
	@Query("{documento:'?0'}")
	public Optional<Agenda> eliminarAgendaByDocumentoPaciente(String documento);
}
