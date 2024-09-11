package com.example.exameng1soto.service;

import java.util.List;
import java.util.Optional;

import com.example.exameng1soto.entity.Empleado;

public interface EmpleadoService {
	Empleado create(Empleado e);
	Empleado update(Empleado e);
	void delete(Long id);
	Optional<Empleado> read(Long id);
	List<Empleado> readAll();
}
