package com.librerias.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "inventario")
public class Inventario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_inventario_libro")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name="native",strategy="native")
	private Long idInventarioLibro;

	@Column(name="nombre_libro")
	private String nombreLibro;
	
	@Column(name="descripcion_libro")
	private String descripcionLibro;
	
	@Column(name="existencia")
	private Integer existencia;

	public Long getIdInventarioLibro() {
		return idInventarioLibro;
	}

	public void setIdInventarioLibro(Long idInventarioLibro) {
		this.idInventarioLibro = idInventarioLibro;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getDescripcionLibro() {
		return descripcionLibro;
	}

	public void setDescripcionLibro(String descripcionLibro) {
		this.descripcionLibro = descripcionLibro;
	}

	public Integer getExistencia() {
		return existencia;
	}

	public void setExistencia(Integer existencia) {
		this.existencia = existencia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
