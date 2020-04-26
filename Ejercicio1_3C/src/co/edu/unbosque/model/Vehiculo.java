package co.edu.unbosque.model;

import java.io.Serializable;

public class Vehiculo implements Serializable {

	private static final long serialVersionUID = -4168350744565922022L;
	
	private String placa;
	private String marca;
	private String tipo;
	private String modelo;
	private String puertas;
	private String capacidad;
	

	public Vehiculo(String marca, String modelo, String placa, String puertas, String capacidad, String tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.puertas = puertas;
		this.capacidad = capacidad;
		this.tipo = tipo;
	}

	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPuertas() {
		return puertas;
	}

	public void setPuertas(String puertas) {
		this.puertas = puertas;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
