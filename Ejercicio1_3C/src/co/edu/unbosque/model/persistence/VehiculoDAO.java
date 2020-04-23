package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Vehiculo;

public class VehiculoDAO {

	private Archivo archivo;

	public VehiculoDAO(Archivo archivo) {
		this.archivo = archivo;
		verificarInvariante();
	}

	// CRUD
	public String verEmpleados(ArrayList<Vehiculo> vehiculos) {
		String texto = "";
		for (int i = 0; i < vehiculos.size(); i++) {
			texto = texto.concat(vehiculos.get(i).toString() + "\n");
		}
		return texto;
	}

	public Vehiculo buscarEmpleado(String placa, ArrayList<Vehiculo> vehiculos) {
		Vehiculo encontrado = null;
		if (!vehiculos.isEmpty()) {
			for (int i = 0; i < vehiculos.size(); i++) {
				if (vehiculos.get(i).getPlaca().equals(placa)) {
					encontrado = vehiculos.get(i);
				}
			}
		}

		return encontrado;
	}

	public boolean agregarEmpleado(String marca, int modelo, String placa, int puertas, int capacidad, String tipo,
			ArrayList<Vehiculo> vehiculos, File file) {

		Vehiculo nuevo = new Vehiculo(marca, modelo, placa, puertas, capacidad, tipo);

		if (buscarEmpleado(placa, vehiculos) == null) {
			vehiculos.add(nuevo);

			archivo.escribirEnArchivo(vehiculos, file);
			return true;
		} else {
			return false;
		}

	}

	public boolean eliminarEmpleado(String placa, ArrayList<Vehiculo> vehiculos, File file) {
		boolean resp = false;
		try {
			Vehiculo e = buscarEmpleado(placa, vehiculos);
			if (e != null) {
				vehiculos.remove(e);
				file.delete();
				file.createNewFile();
				archivo.escribirEnArchivo(vehiculos, file);
				resp = true;
			}
			return resp;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		}
		return resp;

	}

	private void verificarInvariante() {
		assert archivo != null : "El archivo con el que se va a trabajar no puede ser null";
	}

}