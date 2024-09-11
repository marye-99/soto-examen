package com.example.exameng1soto.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.exameng1soto.dao.CursoDao;
import com.example.exameng1soto.entity.Curso;
import com.example.exameng1soto.repository.CursoRepository;

@Component
public class CursoDaoImpl implements CursoDao{
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public Curso create(Curso c) {
		// TODO Auto-generated method stub
		return cursoRepository.save(c);
	}

	@Override
	public Curso update(Curso c) {
		// TODO Auto-generated method stub
		return cursoRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cursoRepository.deleteById(id);
		
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return cursoRepository.findById(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return cursoRepository.findAll();
	}

}
