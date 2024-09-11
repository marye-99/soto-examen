package com.example.exameng1soto.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.exameng1soto.dao.AlumnoDao;
import com.example.exameng1soto.entity.Alumno;
import com.example.exameng1soto.repository.AlumnoRepository;

@Component
public class AlumnoDaoImpl implements AlumnoDao  {
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public Alumno create(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(a);
	}

	@Override
	public Alumno update(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		alumnoRepository.deleteById(id);
		
	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

}
