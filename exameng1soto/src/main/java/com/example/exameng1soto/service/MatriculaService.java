package com.example.exameng1soto.service;

import java.util.List;
import java.util.Optional;

import com.example.exameng1soto.entity.Matricula;


public interface MatriculaService {
	Matricula create(Matricula m);
	Matricula update(Matricula m);
	void delete(Long id);
	Optional<Matricula> read(Long id);
	List<Matricula> readAll();
}
