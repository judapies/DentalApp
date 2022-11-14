package com.example.dentalapp.service;

import java.util.List;
import java.util.Optional;

import com.example.dentalapp.model.Medico;

public interface MedicoService {
	public List<Medico> consultarMedico();
	public Optional<Medico> consultarMedicoPorId(Long id);
	public Medico crearMedico(Medico medico);
	public String eliminarMedico(Long id);
	public Medico actualizarMedico(Medico medico);
}
