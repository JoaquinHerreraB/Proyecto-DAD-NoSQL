package com.faztty.Faztty.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "producto")
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String nombre;
	private String marca;
	private List<String> infoad;
	private Float precio;
	private String imagen;
	private Long puntuacion;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public List<String> getInfoad() {
		return infoad;
	}
	public void setInfoad(List<String> infoad) {
		this.infoad = infoad;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Long getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(Long puntuacion) {
		this.puntuacion = puntuacion;
	}   
}