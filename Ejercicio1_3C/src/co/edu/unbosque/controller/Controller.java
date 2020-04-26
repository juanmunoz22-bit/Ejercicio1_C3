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

		// Botones de la ventana principal panel Uno
		vp.getPi().getAgregarBtn().addActionListener(listener);
		vp.getPi().getEliminarBtn().addActionListener(listener);
		vp.getPi().getBuscarBtn().addActionListener(listener);
		vp.getPo().getCompararBtn().addActionListener(listener);
		vp.getPo().getTipoRad().addActionListener(listener);
		vp.getPo().getMarcaRad().addActionListener(listener);
		vp.getPo().getCompararBtn().addActionListener(listener);
		vp.getPi().getPa().getRegresarBtn().addActionListener(listener);
	}

	public void actionPerformed(ActionEvent event) {

		// Oprimir boton agregar de la ventana principal
		if (vp.getPi().getAgregarBtn() == event.getSource()) {

			
			vp.getPi().getAgregarBtn().setVisible(false);
			vp.getPi().getEliminarBtn().setVisible(false);
			vp.getPi().getBuscarBtn().setVisible(false);
			vp.getPi().getPa().setVisible(true);

			
		}
		if (vp.getPi().getPa().getRegresarBtn() == event.getSource()) {
		
			vp.getPi().getPa().setVisible(false);
			vp.getPi().setVisible(true);
			vp.getPi().getAgregarBtn().setVisible(true);
			vp.getPi().getEliminarBtn().setVisible(true);
			vp.getPi().getBuscarBtn().setVisible(true);
				
		}
		if (vp.getPi().getPa().getAgregarBtn() == event.getSource()) {

			if (vp.getPi().getPa().getCapacidadTxt().getText().isEmpty()
					|| vp.getPi().getPa().getTipoTxt().getText().isEmpty()
					|| vp.getPi().getPa().getMarcaTxt().getText().isEmpty()
					|| vp.getPi().getPa().getModeloTxt().getText().isEmpty()
					|| vp.getPi().getPa().getPlacaTxt().getText().isEmpty()
					|| vp.getPi().getPa().getPuertasTxt().getText().isEmpty()) {
				
				vp.mostrarMensaje("Todos Los campos son obligatorios", "ERROR");
				
			} else {
				
			}

		}

		// Oprimir boton eliminar

		if (vp.getPi().getEliminarBtn() == event.getSource()) {

			vp.getPi().getAgregarBtn().setVisible(false);
			vp.getPi().getEliminarBtn().setVisible(false);
			vp.getPi().getBuscarBtn().setVisible(false);
			vp.getPi().getPe().setVisible(true);

			// oprimir el boton regresar en el panel eliminar
		}

		// Oprimir boton buscar
		if (vp.getPi().getBuscarBtn() == event.getSource()) {

			vp.getPi().getAgregarBtn().setVisible(false);
			vp.getPi().getEliminarBtn().setVisible(false);
			vp.getPi().getBuscarBtn().setVisible(false);
			vp.getPi().getPb().setVisible(true);
			// vp.getPi().activarPanelBuscar("<html>"+"<br>"+"</html>");

		}

		if (vp.getPo().getMarcaRad() == event.getSource()) {
			int num = 1;
			vp.getPo().desactivarPanel();
			vp.getPo().activarComparar();

		}

	}

}
