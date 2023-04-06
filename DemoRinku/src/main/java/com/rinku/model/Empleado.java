package com.rinku.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

@Entity
public class Empleado {
	public Empleado() {}
	public Empleado(int numeroEmpleado,String nombre, Rol rol, int mes, int numEntregas,
			int horas,int totalEntregas,int totalBonos,Double retenciones,Double vales,Double total) {
		super();
		this.numeroEmpleado = numeroEmpleado;
		this.nombre = nombre;
		this.setRol(rol);
		this.mes = mes;
		this.numEntregas = numEntregas;
		this.horas = horas;
		this.totalEntregas = totalEntregas;
		this.totalBonos = totalBonos;
		this.retenciones = retenciones;
		this.vales = vales;
		this.total = total;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEmpleado;
	private int numeroEmpleado;
	private String nombre;
	@ManyToOne
	@JoinColumn(name="idRol")
	private Rol rol;
	private int mes;
	private int numEntregas;
	private int horas;
	@Transient
	private int totalEntregas;
	@Transient
	private int totalBonos;
	@Transient
	private Double retenciones;
	@Transient
	private Double vales;
	@Transient
	private Double total;
	
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
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getTotalEntregas() {
		return totalEntregas;
	}
	public void setTotalEntregas(int i) {
		this.totalEntregas = i;
	}
	public int getTotalBonos() {
		return totalBonos;
	}
	public void setTotalBonos(int i) {
		this.totalBonos = i;
	}
	public Double getRetenciones() {
		return retenciones;
	}
	public void setRetenciones(Double retenciones) {
		this.retenciones = retenciones;
	}
	public Double getVales() {
		return vales;
	}
	public void setVales(Double vales) {
		this.vales = vales;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double d) {
		this.total = d;
	}
}
