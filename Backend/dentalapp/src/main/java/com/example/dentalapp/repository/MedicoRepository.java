package com.example.dentalapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.dentalapp.model.Medico;

@Repository
public interface MedicoRepository extends MongoRepository<Medico, Long>{

}
