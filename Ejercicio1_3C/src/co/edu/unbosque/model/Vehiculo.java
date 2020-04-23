package co.edu.unbosque.model;

import java.io.Serializable;

public class Vehiculo implements Serializable {

	private static final long serialVersionUID = -4168350744565922022L;
	private String marca;
	private int modelo;
	private String placa;
	private int puertas;
	private int capacidad;
	private String tipo;

	public Vehiculo(String marca, int modelo, String placa, int puertas, int capacidad, String tipo) {
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

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
