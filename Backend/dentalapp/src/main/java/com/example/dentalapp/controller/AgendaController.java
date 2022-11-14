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

import com.example.dentalapp.model.Agenda;
import com.example.dentalapp.service.AgendaService;

@RestController
@RequestMapping("/api/agendas")
public class AgendaController {
	
	@Autowired
	private AgendaService servicio;
	
	@GetMapping
	public ResponseEntity<?> consultarTodas(){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarAgenda());
	}

	@GetMapping("{id}")
	public ResponseEntity<?> consultarPorId(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarAgendaPorId(id));
	}
	
	@GetMapping("/documento/paciente/{documento}")
	public ResponseEntity<?> consultarPorDocumentoPaciente(@PathVariable String documento){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarAgendaPorDocumentoPaciente(documento));
	}
	
	@GetMapping("/documento/medico/{documento}")
	public ResponseEntity<?> consultarPorDocumentoMedico(@PathVariable String documento){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarAgendaPorDocumentoMedico(documento));
	}
	
	@GetMapping("/nombre/medico/{nombre}")
	public ResponseEntity<?> consultarPorNombreMedico(@PathVariable String nombre){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarAgendaPorNombreMedico(nombre));
	}
	
	@GetMapping("/nombre/paciente/{nombre}")
	public ResponseEntity<?> consultarPorNombrePaciente(@PathVariable String nombre){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarAgendaPorNombrePaciente(nombre));
	}
	
	@PostMapping
	public ResponseEntity<?> crearAgenda(@RequestBody Agenda agenda){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(servicio.crearAgenda(agenda));
	}
	
	@PutMapping
	public ResponseEntity<?> actualizarAgenda(@RequestBody Agenda agenda){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(servicio.actualizarAgenda(agenda));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> eliminarPorId(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.eliminarAgendaPorId(id));
	}
	
	@DeleteMapping("/documento/paciente/{documento}")
	public ResponseEntity<?> eliminarPorDocumentoPaciente(@PathVariable String documento){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.eliminarAgendaPorDocumentoPaciente(documento));
	}
	
	
}
