package com.rinku.model;


@Entity
public class Empleado {
	private int idEmpleado;
	private String nombre;
	private int idRole;
	private int mes;
	private int numEntregas;
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getNumEntregas() {
		return numEntregas;
	}
	public void setNumEntregas(int numEntregas) {
		this.numEntregas = numEntregas;
	}
}
