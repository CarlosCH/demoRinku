package com.rinku.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rinku.model.Rol;
import com.rinku.repo.IRolRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("roles")
public class RestRolesController {
	@Autowired
	private IRolRepo repo;
	
    @GetMapping
	public List<Rol> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Rol rol) {
		repo.save(rol);
	}
	
	@PutMapping
	public void modificar(@RequestBody Rol rol) {
		repo.save(rol);
	}
}
