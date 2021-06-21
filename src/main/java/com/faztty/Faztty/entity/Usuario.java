package com.faztty.Faztty.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuario")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String username;
	private String email;
	private String password;
	private String tipo;
	private String imagen;
	//Negocio
	private String nombre;
	private String direccion;
	private TipoNegocio tipoNegocio;
	private String RUC;
	private Long puntuacion;
	//Comprador
	private String dni;
	private String firstName;
	private String lastName;
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getRUC() {
		return RUC;
	}
	public void setRUC(String rUC) {
		RUC = rUC;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public TipoNegocio getTipoNegocio() {
		return tipoNegocio;
	}
	public void setTipoNegocio(TipoNegocio tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public long getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(long puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	
	
	
}
