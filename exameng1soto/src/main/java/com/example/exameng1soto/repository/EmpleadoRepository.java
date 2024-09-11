package com.example.exameng1soto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.exameng1soto.entity.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
