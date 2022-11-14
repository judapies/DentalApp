package com.example.dentalapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dentalapp.model.Medico;

@Repository
public interface MedicoRepository extends MongoRepository<Medico, Long>{

	@Query("{documento:'?0'}")
	public Optional<Medico> findMedicoByDocumento(String documento);
	
	@Query("{nombre:'?0'}")
	public Optional<Medico> findMedicoByNombre(String nombre);
}
