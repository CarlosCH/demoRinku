package com.rinku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rinku.model.Empleado;
import com.rinku.repo.IEmpleadoRepo;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	@Autowired
	IEmpleadoRepo repo;
	@Override
	public List<Empleado> findAll() {
	List<Empleado> empleados=(List<Empleado>) repo.findAll();
	
	empleados.forEach(f->f.setTotalEntregas(Math.multiplyExact(f.getNumEntregas(),5)));
	empleados.forEach(f -> f.setTotalBonos(Math.multiplyExact(f.getRol().getBonoHora(),f.getHoras())));
	empleados.forEach(f->f.setVales(f.getTotalEntregas() * (.04)));
	empleados.forEach(
			f->f.setRetenciones(((5760 + f.getTotalEntregas() + f.getTotalBonos())>10000?((5760 + f.getTotalEntregas() + f.getTotalBonos()) * .12):((5760 + f.getTotalEntregas() + f.getTotalBonos()) * .09))));
	empleados.forEach(f->f.setTotal((5760 + f.getTotalEntregas() + f.getTotalBonos()) - f.getRetenciones()));
	return empleados;
	}

	@Override
	public Empleado save(Empleado empleado) {
		return (Empleado) repo.save(empleado);
	}

	@Override
	public void deleteById(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public Empleado findById(Integer id) {
		return repo.findById(id).orElse(null);
	}
}
