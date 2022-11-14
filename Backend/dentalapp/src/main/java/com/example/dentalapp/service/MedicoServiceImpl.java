package com.example.dentalapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dentalapp.model.Medico;
import com.example.dentalapp.repository.MedicoRepository;

@Service
public class MedicoServiceImpl implements MedicoService {

	@Autowired
	private MedicoRepository repositorio;
	
	@Override
	public List<Medico> consultarMedico() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Medico> consultarMedicoPorId(Long id) {
		if(id==null)
			return null;
		return repositorio.findById(id);
	}

	@Override
	public Medico crearMedico(Medico medico) {
		if(medico==null)
			return null;
		return repositorio.insert(medico);
	}

	@Override
	public String eliminarMedico(Long id) {
		if(id==null)
			return "ID no valido";
		if(repositorio.existsById(id)) {
			repositorio.deleteById(id);
			return "Medico eliminado correctamente";
		}else {
			return "Medico no encontrado";
		}
	}

	@Override
	public Medico actualizarMedico(Medico medico) {
		if(medico==null)
			return null;
		return repositorio.save(medico);
	}

}
