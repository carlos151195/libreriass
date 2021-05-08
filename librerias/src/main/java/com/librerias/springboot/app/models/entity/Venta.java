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
@Table(name = "venta")
public class Venta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_venta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name="native",strategy="native")
	private Long idVenta;

	@Column(name="id_inventario_libro")
	private Long idInventarioLibro;
	
	@Column(name="id_cliente")
	private Long idCliente;
	
	@Column(name="cantidad")
	private Integer cantidad;

	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public Long getIdInventarioLibro() {
		return idInventarioLibro;
	}

	public void setIdInventarioLibro(Long idInventarioLibro) {
		this.idInventarioLibro = idInventarioLibro;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
