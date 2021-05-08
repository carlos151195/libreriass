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
@Table(name = "clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_cliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name="native",strategy="native")
	private Long idCliente;

	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido_paterno")
	private String apellidoPaterno;
	
	@Column(name="apellido_materno")
	private String apellidoMaterno;
	
	@Column(name="direccion_facturacion")
	private String direccionFacturacion;
	
	@Column(name="RFC")
	private String RFC;

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDireccionFacturacion() {
		return direccionFacturacion;
	}

	public void setDireccionFacturacion(String direccionFacturacion) {
		this.direccionFacturacion = direccionFacturacion;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
