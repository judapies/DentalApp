package com.example.dentalapp.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dentalapp.model.Paciente;


@Repository
public interface PacienteRepository extends MongoRepository<Paciente, Long>{
	
	@Query("{nombre:'?0'}")
	public Optional<Paciente> findPacienteByNombre(String nombre);
	
	@Query("{documento:'?0'}")
	public Optional<Paciente> findPacienteByDocumento(String documento);
	
	@Query("{documento:'?0'}")
	public Optional<Paciente> deleteByDocumento(String documento);
	
	@Query("{correo:'?0'}")
	public Optional<Paciente> findPacienteByCorreo(String correo);
	
	@Query("{usuario:'?0',clave:'?1'}")
	public Optional<Paciente> login(String usuario,String clave);
}
