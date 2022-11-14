package com.example.dentalapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dentalapp.model.Paciente;
import com.example.dentalapp.repository.PacienteRepository;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepository repositorio;
	
	@Override
	public List<Paciente> consultarTodos() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Paciente> consultarPacientePorId(Long id) {
		if(id==null)
			return null;
		return repositorio.findById(id);
	}

	@Override
	public Optional<Paciente> consultarPacientePorDocumento(String documento) {
		if(documento==null)
			return null;
		if(!isNumeric(documento))
			return null;
		
		return repositorio.findPacienteByDocumento(documento);
	}

	@Override
	public Paciente crearPaciente(Paciente paciente) {
		if(paciente==null)
			return null;
		return repositorio.insert(paciente);
	}

	@Override
	public String eliminarPacientePorDocumento(String documento) {
		if(!isNumeric(documento))
			return "Documento no valido";
		repositorio.deleteByDocumento(documento);
		return "Paciente eliminado";
	}

	@Override
	public String eliminarPacientePorId(Long id) {
		if(id==null)
			return "Id no valido";
		if(repositorio.existsById(id)) {
			repositorio.deleteById(id);
			return "Paciente eliminado correctamente";
		}else {
			return "Paciente no encontrado";
		}
	}

	@Override
	public Paciente actualizarPaciente(Paciente paciente) {
		if(paciente==null)
			return null;
		return repositorio.save(paciente);
	}

	public boolean isNumeric(String s)
    {
        if (s == null || s.equals("")) {
            return false;
        }
 
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
