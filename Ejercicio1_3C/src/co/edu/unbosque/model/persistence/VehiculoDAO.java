package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Compara;
import co.edu.unbosque.model.Vehiculo;

public class VehiculoDAO implements Compara {

	private Archivo archivo;

	public VehiculoDAO(Archivo archivo) {
		this.archivo = archivo;
		verificarInvariante();
	}

	// CRUD
	public String buscarVehiculo(ArrayList<Vehiculo> vehiculos) {
		String texto = "";
		for (int i = 0; i < vehiculos.size(); i++) {
			texto = texto.concat(vehiculos.get(i).toString() + "\n");
		}
		return texto;
	}

	public Vehiculo buscarVehiculo(String placa, ArrayList<Vehiculo> vehiculos) {
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

	public boolean agregarVehiculo(String marca, int modelo, String placa, int puertas, int capacidad, String tipo,
			ArrayList<Vehiculo> vehiculos, File file) {

		Vehiculo nuevo = new Vehiculo(marca, modelo, placa, puertas, capacidad, tipo);

		if (buscarVehiculo(placa, vehiculos) == null) {
			vehiculos.add(nuevo);

			archivo.escribirEnArchivo(vehiculos, file);
			return true;
		} else {
			return false;
		}

	}

	public boolean eliminarVehiculo(String placa, ArrayList<Vehiculo> vehiculos, File file) {
		boolean resp = false;
		try {
			Vehiculo e = buscarVehiculo(placa, vehiculos);
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

	@Override
	public int comparar(int num, String v1, String v2) {
		int a = 0;
		switch (num) {
		// marca
		case 1:
			if (v1 == v2) {
				a = 1;
			} else {
				a = 0;
			}

			break;

		// modelo
		case 2:
			if (v1 == v2) {
				a = 1;
			}
			if (Integer.parseInt(v1) < Integer.parseInt(v2)) {
				a = 0;
			}
			if (Integer.parseInt(v1) > Integer.parseInt(v2)) {
				a = -1;
			}

			break;

		// puertas
		case 3:
			if (v1 == v2) {
				a = 1;
			}
			if (Integer.parseInt(v1) < Integer.parseInt(v2)) {
				a = 0;
			}
			if (Integer.parseInt(v1) > Integer.parseInt(v2)) {
				a = -1;
			}

			break;

		// capacidad
		case 4:
			if (v1 == v2) {
				a = 1;
			}
			if (Integer.parseInt(v1) < Integer.parseInt(v2)) {
				a = 0;
			}
			if (Integer.parseInt(v1) > Integer.parseInt(v2)) {
				a = -1;
			}

			break;

		// tipo
		case 5:

			if (v1 == v2) {
				a = 1;
			} else {
				a = 0;
			}

			break;

		default:
			a = 1;
			break;
		}

		return a;

	}

}
