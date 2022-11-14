package com.example.dentalapp.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dentalapp.model.Paciente;


@Repository
public interface PacienteRepository extends MongoRepository<Paciente, Long>{
	
	@Query("{documento:'?0'}")
	public Optional<Paciente> findPacienteByDocumento(String documento);
	
	@Query("{documento:'?0'}")
	public Optional<Paciente> deleteByDocumento(String documento);
}
