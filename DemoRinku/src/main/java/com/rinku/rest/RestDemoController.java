package com.rinku.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rinku.model.Empleado;
import com.rinku.repo.IEmpleadoRepo;

@RestController
@RequestMapping("empleados")
public class RestDemoController {
	@Autowired
	private IEmpleadoRepo repo;
	
	@GetMapping
	public List<Empleado> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Empleado emp) {
		repo.save(emp);
	}
	
	@PutMapping
	public void modificar(@RequestBody Empleado emp) {
		repo.save(emp);
	}
}
