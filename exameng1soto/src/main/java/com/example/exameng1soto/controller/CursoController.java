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

import com.example.exameng1soto.entity.Curso;
import com.example.exameng1soto.service.CursoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
	@Autowired
	private CursoService service;
	
	@GetMapping
	public ResponseEntity<List<Curso>> readAll() {
		try {
			List<Curso> cursos = service.readAll();
			if (cursos.isEmpty()) {
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(cursos, HttpStatus.OK);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Curso> crear(@Valid @RequestBody Curso cu) {
		try {
			Curso c = service.create(cu);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Curso> getPacienteId(@PathVariable Long id) {
		try {
			Curso p = service.read(id).get();
			return new ResponseEntity<>(p, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Curso> delPaciente(@PathVariable Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Curso> updatePaciente(@PathVariable Long id, @Valid @RequestBody Curso cu) {
		Optional<Curso> c = service.read(id);
		if (c.isEmpty()) {
			return new ResponseEntity<>(service.update(cu), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		}
}
