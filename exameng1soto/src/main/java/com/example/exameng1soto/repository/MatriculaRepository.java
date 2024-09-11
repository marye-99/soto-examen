package com.example.exameng1soto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.exameng1soto.entity.Matricula;


@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

}
