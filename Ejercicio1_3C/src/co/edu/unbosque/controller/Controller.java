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
		vp.getRegresarBtn().addActionListener(listener);
		

	}

	public void actionPerformed(ActionEvent event) {

		// Oprimir boton agregar de la ventana principal
		if (vp.getPi().getAgregarBtn() == event.getSource()) {

			vp.getPi().getAgregarBtn().setVisible(false);
			vp.getPi().getEliminarBtn().setVisible(false);
			vp.getPi().getBuscarBtn().setVisible(false);
			vp.getPi().activarAgregar();

		}

		// Oprimir boton eliminar

		if (vp.getPi().getEliminarBtn() == event.getSource()) {

			vp.getPi().getAgregarBtn().setVisible(false);
			vp.getPi().getEliminarBtn().setVisible(false);
			vp.getPi().getBuscarBtn().setVisible(false);

			// oprimir el boton regresar en el panel eliminar
		}

		// if (vp.getPi().getRegDosBtn() == event.getSource()) {

		// vp.getPi().getPlacaLbl().setVisible(false);
		// vp.getPi().getPlacaTxt().setVisible(false);
		// vp.getPi().activarPanel();

		// }

		// Oprimir boton buscar
		/*if (vp.getPi().getBuscarBtn() == event.getSource()) {

			vp.getPi().getAgregarBtn().setVisible(false);
			vp.getPi().getEliminarBtn().setVisible(false);
			vp.getPi().getBuscarBtn().setVisible(false);
			vp.getPi().activarPanelBuscar("<html>"+"<br>"+"</html>");

		}*/

		if (vp.getPo().getMarcaRad() == event.getSource()) {
			int num=1;
			vp.getPo().desactivarPanel();
			vp.getPo().activarComparar();
			
		}
		
		if (vp.getPo().getCompararBtn()== event.getSource()) {
			System.out.println("Hola");
		}
		
		
		
		

	}

}
