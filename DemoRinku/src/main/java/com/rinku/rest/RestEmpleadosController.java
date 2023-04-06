package com.rinku.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rinku.model.Empleado;
import com.rinku.service.EmpleadoServiceImpl;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("empleados")
public class RestEmpleadosController {
	@Autowired
	private EmpleadoServiceImpl repo;
	
	@GetMapping
	public List<Empleado> listar(){
		return repo.findAll();
	}
	
	@PostMapping	
	public Empleado insertar(@RequestBody Empleado emp) {
		System.out.println("Entra insert");
		return repo.save(emp);
	}
	
	@PutMapping
	public void modificar(@RequestBody Empleado emp) {
		repo.save(emp);
	}
	
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Boolean> eliminarEmpleado(@PathVariable ("id") Integer id){
		System.out.println("Entra delete");
		repo.deleteById(id);
		return ResponseEntity.ok(repo.findById(id)==null);
	}
}
