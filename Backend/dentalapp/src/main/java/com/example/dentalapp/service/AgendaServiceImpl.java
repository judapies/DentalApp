package com.example.dentalapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dentalapp.model.Agenda;
import com.example.dentalapp.repository.AgendaRepository;
import com.example.dentalapp.repository.MedicoRepository;
import com.example.dentalapp.repository.PacienteRepository;

@Service
public class AgendaServiceImpl implements AgendaService {

	@Autowired
	private AgendaRepository repositorio;
	@Autowired
	private PacienteRepository repoPaciente;
	@Autowired
	private MedicoRepository repoMedico;
	
	@Override
	public List<Agenda> consultarAgenda() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Agenda> consultarAgendaPorId(Long id) {
		if(id==null)
			return null;
		return repositorio.findById(id);
	}

	@Override
	public Optional<Agenda> consultarAgendaPorDocumentoPaciente(String documento) {
		if(documento==null)
			return null;
		return repositorio.consultarAgendaByDocumentoPaciente(documento);
	}

	@Override
	public Optional<Agenda> consultarAgendaPorNombrePaciente(String nombre) {
		if(nombre==null)
			return null;
		return repositorio.consultarAgendaByNombrePaciente(nombre);
	}

	@Override
	public Optional<Agenda> consultarAgendaPorDocumentoMedico(String documento) {
		if(documento==null)
			return null;
		return repositorio.consultarAgendaByDocumentoMedico(documento);
	}

	@Override
	public Optional<Agenda> consultarAgendaPorNombreMedico(String nombre) {
		if(nombre==null)
			return null;
		return repositorio.consultarAgendaByNombreMedico(nombre);
	}

	@Override
	public Agenda crearAgenda(Agenda agenda) {
		if(agenda==null)
			return null;
		return repositorio.insert(agenda);
	}

	@Override
	public String eliminarAgendaPorId(Long id) {
		if(id==null)
			return null;
		if(repositorio.existsById(id)) {
			repositorio.deleteById(id);
			return "Cita odontologica eliminada correctamente de la agenda";
		}else {
			return "Cita no encontrada en la agenda";
		}
	}

	@Override
	public String eliminarAgendaPorDocumentoPaciente(String documento) {
		if(!isNumeric(documento)) {
			return "Documento no valido";
		}else {
			repositorio.eliminarAgendaByDocumentoPaciente(documento);
			return "Cita odontologica eliminada correctamente de la agenda";
		}
	}

	@Override
	public Agenda actualizarAgenda(Agenda agenda) {
		if(agenda==null)
			return null;
		return repositorio.save(agenda);
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
