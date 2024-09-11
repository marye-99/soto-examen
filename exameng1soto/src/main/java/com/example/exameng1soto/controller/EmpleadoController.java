package com.example.exameng1soto.controller;

import java.util.List;
import java.util.Optional;

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

import com.example.exameng1soto.entity.Empleado;
import com.example.exameng1soto.service.EmpleadoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
	@Autowired
	private EmpleadoService service;
	
	@GetMapping
	public ResponseEntity<List<Empleado>> readAll() {
		try {
			List<Empleado> empleados = service.readAll();
			if (empleados.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(empleados, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Empleado> crear(@Valid @RequestBody Empleado em) {
		try {
			Empleado e = service.create(em);
			return new ResponseEntity<>(e, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Empleado> getPacienteId(@PathVariable Long id) {
		try {
			Empleado e = service.read(id).get();
			return new ResponseEntity<>(e, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Empleado> delPaciente(@PathVariable Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Empleado> updatePaciente(@PathVariable Long id, @Valid @RequestBody Empleado em) {
		Optional<Empleado> e = service.read(id);
		if (e.isEmpty()) {
			return new ResponseEntity<>(service.update(em), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		}
}
