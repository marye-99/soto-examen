package com.example.exameng1soto.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exameng1soto.dao.AlumnoDao;
import com.example.exameng1soto.entity.Alumno;
import com.example.exameng1soto.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired AlumnoDao dao;

	@Override
	public Alumno create(Alumno a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Alumno update(Alumno a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
}
