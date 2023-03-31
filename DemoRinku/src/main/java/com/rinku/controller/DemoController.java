package com.rinku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rinku.model.Empleado;
import com.rinku.repo.IEmpleadoRepo;

@Controller
public class DemoController{
	@Autowired
	private IEmpleadoRepo empleadoRepo;
	
	@GetMapping("/empleado")
	public String greeting(@RequestParam(name="name",required=false,defaultValue="world") String name,Model model){
		//logica
		Empleado emp = new Empleado();
		emp.setIdRole(0);
		emp.setMes(0);
		emp.setNombre("CArlos Test");
		emp.setNumEntregas(0);
		
		empleadoRepo.save(emp);
		model.addAttribute("name", name);
		return "empleado";		
	}
	
	@GetMapping("/listar")
	public String empleado(Model model) {
		//logica
		model.addAttribute("empleados", empleadoRepo.findAll());
		return "empleado";
	}
}
