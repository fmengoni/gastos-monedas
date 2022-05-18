package com.fam.gastos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "monedas")
public class Moneda {
	@Column(name="id_moneda")
	private Integer idMoneda;
	private String descripcion;
	
	public Moneda() {
		super();
	}
	public Moneda(Integer idMoneda, String descripcion) {
		super();
		this.idMoneda = idMoneda;
		this.descripcion = descripcion;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdMoneda() {
		return idMoneda;
	}
	public void setIdMoneda(Integer idMoneda) {
		this.idMoneda = idMoneda;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
