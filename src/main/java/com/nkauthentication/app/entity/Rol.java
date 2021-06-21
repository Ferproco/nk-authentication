package com.nkauthentication.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "rol", schema = "seguridad")
public class Rol implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8727663018707198005L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;

	@Column(name = "creadoel")
	@Temporal(TemporalType.DATE)
	private Date creadoel;

	@Column(name = "actualizadoel", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date actualizadoel;

	private boolean activo;

	@Column(name = "borrado", nullable = true)
	private boolean borrado;
	
	private String descripcion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getCreadoel() {
		return creadoel;
	}

	public void setCreadoel(Date creadoel) {
		this.creadoel = creadoel;
	}

	public Date getActualizadoel() {
		return actualizadoel;
	}

	public void setActualizadoel(Date actualizadoel) {
		this.actualizadoel = actualizadoel;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public boolean isBorrado() {
		return borrado;
	}

	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		descripcion = descripcion;
	}
	
	

}
