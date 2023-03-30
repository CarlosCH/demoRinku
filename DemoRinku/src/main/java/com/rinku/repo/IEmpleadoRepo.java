package com.rinku.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rinku.model.Empleado;

public interface IEmpleadoRepo extends JpaRepository<Empleado, Integer>{

}
