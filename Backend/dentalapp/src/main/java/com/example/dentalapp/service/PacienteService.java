package com.example.dentalapp.service;

import java.util.List;
import java.util.Optional;

import com.example.dentalapp.model.Paciente;


public interface PacienteService {
	public List<Paciente> consultarTodos();
	public Optional<Paciente> consultarPacientePorId(Long id);
	public Optional<Paciente> consultarPacientePorDocumento(String documento);
	public Optional<Paciente> consultarPacientePorCorreo(String correo);
	public Optional<Paciente> consultarPacientePorCorreoClave(String correo,String clave);
	public Paciente crearPaciente(Paciente paciente);
	public String eliminarPacientePorDocumento(String documento);
	public String eliminarPacientePorId(Long id);
	public Paciente actualizarPaciente(Paciente paciente);
	public String autenticacion(Paciente paciente);
}
