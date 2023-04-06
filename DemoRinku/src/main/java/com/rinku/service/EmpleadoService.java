package com.rinku.service;

import java.util.List;

import com.rinku.model.Empleado;

public interface EmpleadoService{
	public List<Empleado> findAll();
	public Empleado save(Empleado empleado);
	public void deleteById(Integer id);
	public Empleado findById(Integer id);
}
