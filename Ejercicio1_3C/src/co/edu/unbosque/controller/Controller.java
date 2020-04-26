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
		vp.getPi().getPa().getRegresarBtn().addActionListener(listener);
		vp.getPi().getPa().getAgregarBtn().addActionListener(listener);
		vp.getPi().getPe().getRegresarBtn().addActionListener(listener);
		vp.getPi().getPe().getEliminarBtn().addActionListener(listener);
		vp.getPi().getPb().getRegresarBtn().addActionListener(listener);
		vp.getPi().getPb().getBuscarBtn().addActionListener(listener);

	}

	public void actionPerformed(ActionEvent event) {

		// Oprimir boton agregar de la ventana principal
		if (vp.getPi().getAgregarBtn() == event.getSource()) {

			vp.getPi().getAgregarBtn().setVisible(false);
			vp.getPi().getEliminarBtn().setVisible(false);
			vp.getPi().getBuscarBtn().setVisible(false);
			vp.getPi().getPa().setVisible(true);

			// Oprimir eel boton regresar en el panel agregar (vehiculo)
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
				if (vehiculo.agregarVehiculo(vp.getPi().getPa().getMarcaTxt().getText(),
						Integer.parseInt(vp.getPi().getPa().getModeloTxt().getText()),
						(vp.getPi().getPa().getPlacaTxt().getText()),
						Integer.parseInt(vp.getPi().getPa().getPuertasTxt().getText()),
						Integer.parseInt(vp.getPi().getPa().getCapacidadTxt().getText()),
						vp.getPi().getPa().getTipoTxt().getText(), vehiculos, file)) {

					vp.mostrarMensaje("Vehiculo agregado", "INFORMACION");

				} else {
					vp.mostrarMensaje("Esta placa ya existe", "ERROR");
				}
			}

		}

		// Oprimir boton eliminar

		if (vp.getPi().getEliminarBtn() == event.getSource()) {

			vp.getPi().getAgregarBtn().setVisible(false);
			vp.getPi().getEliminarBtn().setVisible(false);
			vp.getPi().getBuscarBtn().setVisible(false);
			vp.getPi().getPe().setVisible(true);
			System.out.println(vehiculos.get(0).getPlaca());

			// oprimir el boton regresar en el panel eliminar
		}

		if (vp.getPi().getPe().getEliminarBtn() == event.getSource()) {
			String placa = vp.getPi().getPe().getPlacaTxt().getText();
			System.out.println(placa);
			if (vehiculo.buscarVehiculo(placa, vehiculos) != null) {
				if (vehiculo.eliminarVehiculo(placa, vehiculos, file)) {
					vp.mostrarMensaje("Se ha eliminado el vehiculo", "INFORMACION");
				} else {
					vp.mostrarMensaje("No se ha eliminado el vehiculo", "INFORMACION");
				}
			} else {
				vp.mostrarMensaje("El vehiculo con placa " + placa + " NO existe en el sistema", "ERROR");
			}
		}

		if (vp.getPi().getPe().getRegresarBtn() == event.getSource()) {

			vp.getPi().getPe().setVisible(false);
			vp.getPi().setVisible(true);
			vp.getPi().getAgregarBtn().setVisible(true);
			vp.getPi().getEliminarBtn().setVisible(true);
			vp.getPi().getBuscarBtn().setVisible(true);

		}
		// Oprimir boton buscar
		if (vp.getPi().getBuscarBtn() == event.getSource()) {

			vp.getPi().getAgregarBtn().setVisible(false);
			vp.getPi().getEliminarBtn().setVisible(false);
			vp.getPi().getBuscarBtn().setVisible(false);
			vp.getPi().getPb().setVisible(true);
			// vp.getPi().activarPanelBuscar("<html>"+"<br>"+"</html>");

		}

		if (vp.getPi().getPb().getBuscarBtn() == event.getSource()) {
			
			if (vehiculos.isEmpty()) {
				vp.mostrarMensaje("No Hay vehiculos registrados en la base de datos", "INFORMACION");
			}
			String placa = vp.getPi().getPb().getPlacaTxt().getText();
			if (!vehiculos.isEmpty()) {
				for (int i = 0; i <= vehiculos.size() - 1; i++) {
					if (placa.equals(vehiculos.get(i).getPlaca())) {
						vp.getPi().getPb().getInfoLbl()
								.setText("<html>" + vehiculos.get(i).getMarca() + "<br>" + vehiculos.get(i).getModelo()
										+ "<br>" + vehiculos.get(i).getTipo() + "<br>" + vehiculos.get(i).getPuertas()
										+ "<br>" + vehiculos.get(i).getCapacidad() + "</html>");
					}
				}
				if (vp.getPi().getPb().getInfoLbl().getText().isEmpty()) {
					vp.mostrarMensaje("La placa digitada no existe o no ha digitado ninguna placa", "ERROR");

				}
			}
		}

		if (vp.getPi().getPb().getRegresarBtn() == event.getSource()) {

			vp.getPi().getPb().setVisible(false);
			vp.getPi().setVisible(true);
			vp.getPi().getAgregarBtn().setVisible(true);
			vp.getPi().getEliminarBtn().setVisible(true);
			vp.getPi().getBuscarBtn().setVisible(true);

		}

		// if (vp.getPo().getMarcaRad() == event.getSource()) {
		// int num = 1;
		// vp.getPo().desactivarPanel();

	}

}
