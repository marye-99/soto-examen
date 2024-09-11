package com.example.exameng1soto.dao;

import java.util.List;
import java.util.Optional;

import com.example.exameng1soto.entity.Curso;


public interface CursoDao {
	Curso create (Curso c);
	Curso update (Curso c);
	void delete (Long id);
	Optional<Curso> read(Long id);
	List<Curso> readAll();
}

