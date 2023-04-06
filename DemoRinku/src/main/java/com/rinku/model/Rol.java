package com.rinku.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rol {
	public Rol() {}
	public Rol(String nombre, int sueldoBase, int bonoHora, int retencionISR, int valeDespensa) {
		super();
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.bonoHora = bonoHora;
		this.retencionISR = retencionISR;
		this.valeDespensa = valeDespensa;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idRol;
	private String nombre;
	private int sueldoBase;
	private int bonoHora;
	private int retencionISR;
	private int valeDespensa;
	
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getBonoHora() {
		return bonoHora;
	}
	public void setBonoHora(int bonoHora) {
		this.bonoHora = bonoHora;
	}
	public int getRetencionISR() {
		return retencionISR;
	}
	public void setRetencionISR(int retencionISR) {
		this.retencionISR = retencionISR;
	}
	public int getValeDespensa() {
		return valeDespensa;
	}
	public void setValeDespensa(int valeDespensa) {
		this.valeDespensa = valeDespensa;
	}
}
