package com.nkauthentication.app.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuario", schema = "seguridad")
public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "codigouser")
	@org.hibernate.annotations.Type(type = "pg-uuid")
	private UUID codigouser;

	@Column(name = "nombrecompleto")
	private String nombrecompleto;
	
	@Column(name = "nombreusuario")
	private String nombreusuario;
	
	@Column(name = "password")
	private String password;
	private String imagen;
	private String email;
	private boolean emailconfirmado;
	private String telefono;
	private boolean telefonoconfirmado;
	private String ocupacion;

	@Column(name = "creadoel")
	@Temporal(TemporalType.DATE)
	private Date creadoel;

	@Column(name = "actualizadoel", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date actualizadoel;
	
	private boolean activo;
	
	private boolean borrado;
	
	private boolean valido;
	
	private boolean esadministrador;
	
	@Column(name = "vencepassword", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date vencepassword;
	
	private String accesotoken;
	
	private String actualizartoken;
	
	private Long empresaid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getCodigouser() {
		return codigouser;
	}

	public void setCodigouser(UUID codigouser) {
		this.codigouser = codigouser;
	}

	public String getNombrecompleto() {
		return nombrecompleto;
	}

	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEmailconfirmado() {
		return emailconfirmado;
	}

	public void setEmailconfirmado(boolean emailconfirmado) {
		this.emailconfirmado = emailconfirmado;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isTelefonoconfirmado() {
		return telefonoconfirmado;
	}

	public void setTelefonoconfirmado(boolean telefonoconfirmado) {
		this.telefonoconfirmado = telefonoconfirmado;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
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

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public Date getVencepassword() {
		return vencepassword;
	}

	public void setVencepassword(Date vencepassword) {
		this.vencepassword = vencepassword;
	}

	public String getAccesotoken() {
		return accesotoken;
	}

	public void setAccesotoken(String accesotoken) {
		this.accesotoken = accesotoken;
	}

	public String getActualizartoken() {
		return actualizartoken;
	}

	public void setActualizartoken(String actualizartoken) {
		this.actualizartoken = actualizartoken;
	}

	public Long getEmpresaid() {
		return empresaid;
	}

	public void setEmpresaid(Long empresaid) {
		this.empresaid = empresaid;
	}

	public boolean isEsadministrador() {
		return esadministrador;
	}

	public void setEsadministrador(boolean esadministrador) {
		this.esadministrador = esadministrador;
	}

	
	
}
