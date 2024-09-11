package com.example.exameng1soto.dao;

import java.util.List;
import java.util.Optional;

import com.example.exameng1soto.entity.Grado;

public interface GradoDao {
	Grado create (Grado g);
	Grado update (Grado g);
	void delete (Long id);
	Optional<Grado> read(Long id);
	List<Grado > readAll();
}
