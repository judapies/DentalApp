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

import com.example.dentalapp.model.Medico;
import com.example.dentalapp.service.MedicoService;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

	@Autowired
	private MedicoService servicio;
	
	@GetMapping
	public ResponseEntity<?> consultarMedicos(){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarMedico());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> consultarMedicosPorId(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.consultarMedicoPorId(id));
	}
	
	@PostMapping
	public ResponseEntity<?> crearMedico(@RequestBody Medico medico){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.crearMedico(medico));
	}
	
	@PutMapping
	public ResponseEntity<?> actualizarMedico(@RequestBody Medico medico){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.actualizarMedico(medico));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarMedico(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(servicio.eliminarMedico(id));
	}
}
