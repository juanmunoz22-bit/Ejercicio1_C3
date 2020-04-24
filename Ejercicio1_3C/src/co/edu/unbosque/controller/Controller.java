package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.Vehiculo;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.VehiculoDAO;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private ArrayList<Vehiculo> vehiculos;
	private VentanaPrincipal vp;
	private Archivo archivo;
	private VehiculoDAO vehiculo;
	private File file = new File("data/basedatos.dat");

	public Controller() {

		vp = new VentanaPrincipal();
		actionListener(this);
		vehiculos = new ArrayList<Vehiculo>();
		archivo = new Archivo(file);
		vehiculo = new VehiculoDAO(archivo);
		vehiculos = archivo.leerArchivo(file);

	}

	public void actionListener(ActionListener listener) {
		
		vp.getPi().getAgregarBtn().addActionListener(listener);

	}

	public void actionPerformed(ActionEvent event) {
		
		//Oprimir boton agregar
		if(vp.getPi().getAgregarBtn()==event.getSource()) {
			
			vp.getPi().getAgregarBtn().setVisible(false);
			vp.getPi().getEliminarBtn().setVisible(false);
			vp.getPi().getBuscarBtn().setVisible(false);
			
		}
		

	}

}
