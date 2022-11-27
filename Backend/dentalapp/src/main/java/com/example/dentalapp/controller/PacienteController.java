package com.example.dentalapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dentalapp.model.Paciente;
import com.example.dentalapp.service.PacienteService;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {
	@Autowired
	private PacienteService servicio;
	
	
	@GetMapping
	public ResponseEntity<?> consultarTodos(){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> consultarPacientePorId(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarPacientePorId(id));
	}
	
	@GetMapping("/documento/{documento}")
	public ResponseEntity<?> consultarPacientePorDocumento(@PathVariable String documento){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarPacientePorDocumento(documento));
	}
	
	@GetMapping("/clave/{correo}/{clave}")
	public ResponseEntity<?> consultarPacientePorCorreo(@PathVariable String correo,@PathVariable String clave){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarPacientePorCorreoClave(correo,clave));
	}
	
	@PostMapping
	public ResponseEntity<?> crearPaciente(@RequestBody Paciente paciente){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.crearPaciente(paciente));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarPacientePorId(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(servicio.eliminarPacientePorId(id));
	}

	@DeleteMapping(("/documento/{documento}"))
	public ResponseEntity<?> eliminarPacientePorDocumento(@PathVariable String documento){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(servicio.eliminarPacientePorDocumento(documento));
	}
	
	@PutMapping
	public ResponseEntity<?> actualizarPaciente(@RequestBody Paciente paciente){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.actualizarPaciente(paciente));
	}
}
