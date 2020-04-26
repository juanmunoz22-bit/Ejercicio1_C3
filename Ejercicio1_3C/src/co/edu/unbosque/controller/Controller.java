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
	private int num;

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
		vp.getPo().getModeloRad().addActionListener(listener);
		vp.getPo().getPuertaRad().addActionListener(listener);
		vp.getPo().getMarcaRad().addActionListener(listener);
		vp.getPo().getTipoRad().addActionListener(listener);
		vp.getPo().getCapacRad().addActionListener(listener);
		vp.getPo().getPc().getCompararBtn().addActionListener(listener);
		vp.getPo().getPc().getRegresarBtn().addActionListener(listener);

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
						vp.getPi().getPa().getModeloTxt().getText(), vp.getPi().getPa().getPlacaTxt().getText(),
						vp.getPi().getPa().getPuertasTxt().getText(), vp.getPi().getPa().getCapacidadTxt().getText(),
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
					vp.mostrarMensaje("La placa digitada no existe", "ERROR");

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

		if (vp.getPo().getModeloRad() == event.getSource()) {

			vp.getPo().getVenderBtn().setVisible(false);
			vp.getPo().getCapacRad().setVisible(false);
			vp.getPo().getMarcaRad().setVisible(false);
			vp.getPo().getModeloRad().setVisible(false);
			vp.getPo().getPlacaRad().setVisible(false);
			vp.getPo().getPuertaRad().setVisible(false);
			vp.getPo().getTipoRad().setVisible(false);
			vp.getPo().getMensajeLbl().setVisible(false);
			vp.getPo().getPc().setVisible(true);
			num = 2;

		}

		if (vp.getPo().getMarcaRad() == event.getSource()) {

			vp.getPo().getVenderBtn().setVisible(false);
			vp.getPo().getCapacRad().setVisible(false);
			vp.getPo().getMarcaRad().setVisible(false);
			vp.getPo().getModeloRad().setVisible(false);
			vp.getPo().getPlacaRad().setVisible(false);
			vp.getPo().getPuertaRad().setVisible(false);
			vp.getPo().getTipoRad().setVisible(false);
			vp.getPo().getMensajeLbl().setVisible(false);
			vp.getPo().getPc().setVisible(true);
			num = 1;

		}

		if (vp.getPo().getCapacRad() == event.getSource()) {

			vp.getPo().getVenderBtn().setVisible(false);
			vp.getPo().getCapacRad().setVisible(false);
			vp.getPo().getMarcaRad().setVisible(false);
			vp.getPo().getModeloRad().setVisible(false);
			vp.getPo().getPlacaRad().setVisible(false);
			vp.getPo().getPuertaRad().setVisible(false);
			vp.getPo().getTipoRad().setVisible(false);
			vp.getPo().getMensajeLbl().setVisible(false);
			vp.getPo().getPc().setVisible(true);
			num = 4;

		}

		if (vp.getPo().getTipoRad() == event.getSource()) {

			vp.getPo().getVenderBtn().setVisible(false);
			vp.getPo().getCapacRad().setVisible(false);
			vp.getPo().getMarcaRad().setVisible(false);
			vp.getPo().getModeloRad().setVisible(false);
			vp.getPo().getPlacaRad().setVisible(false);
			vp.getPo().getPuertaRad().setVisible(false);
			vp.getPo().getTipoRad().setVisible(false);
			vp.getPo().getMensajeLbl().setVisible(false);
			vp.getPo().getPc().setVisible(true);
			num = 5;

		}

		if (vp.getPo().getPuertaRad() == event.getSource()) {

			vp.getPo().getVenderBtn().setVisible(false);
			vp.getPo().getCapacRad().setVisible(false);
			vp.getPo().getMarcaRad().setVisible(false);
			vp.getPo().getModeloRad().setVisible(false);
			vp.getPo().getPlacaRad().setVisible(false);
			vp.getPo().getPuertaRad().setVisible(false);
			vp.getPo().getTipoRad().setVisible(false);
			vp.getPo().getMensajeLbl().setVisible(false);
			vp.getPo().getPc().setVisible(true);
			num = 3;

		}

		if (vp.getPo().getPc().getCompararBtn() == event.getSource()) {
			try {
				if (vp.getPo().getPc().getComp1Txt().getText().isEmpty()
						|| vp.getPo().getPc().getComp2Txt().getText().isEmpty()) {
					vp.mostrarMensaje("Todos los campos son requeridos", "ERROR");
				}

				String v1 = vp.getPo().getPc().getComp1Txt().getText();
				String v2 = vp.getPo().getPc().getComp2Txt().getText();
				// MARCA
				if (num == 1) {
					for (int i = 0; i <= vehiculos.size() - 1; i++) {
						if (v1.equals(vehiculos.get(i).getPlaca())) {
							vp.getPo().getPc().getInfoLbl1().setText(vehiculos.get(i).getMarca());
						}
					}
					for (int j = 0; j <= vehiculos.size() - 1; j++) {
						if (v2.equals(vehiculos.get(j).getPlaca())) {
							vp.getPo().getPc().getInfoLbl2().setText(vehiculos.get(j).getMarca());
						}
					}
					if (vehiculo.comparar(num, v1, v2) == 1) {
						vp.mostrarMensaje("Los vehiculos son de la misma marca", "INFORMACION");
					} else {
						vp.mostrarMensaje("Los vehiculos tienen diferente marca", "INFORMACION");
					}

				}
				// MODELO
				if (num == 2) {
					for (int i = 0; i <= vehiculos.size() - 1; i++) {
						if (v1.equals(vehiculos.get(i).getPlaca())) {
							vp.getPo().getPc().getInfoLbl1().setText(vehiculos.get(i).getModelo());
						}
					}
					for (int j = 0; j <= vehiculos.size() - 1; j++) {
						if (v2.equals(vehiculos.get(j).getPlaca())) {
							vp.getPo().getPc().getInfoLbl2().setText(vehiculos.get(j).getModelo());
						}
					}
					if (vehiculo.comparar(num, v1, v2) == 1) {
						vp.mostrarMensaje("Los vehiculos son del mismo año", "INFORMACION");
					}
					if (vehiculo.comparar(num, v1, v2)==0) {
						vp.mostrarMensaje("El vehiculo con placa " + v1 + " es mas nuevo", "INFORMACION");
					}
					if (vehiculo.comparar(num, v1, v2)==-1) {
						vp.mostrarMensaje("El vehiculo con placa "+ v1 + " es mas antiguo", "INFORMACION");
					}

				}
				// PUERTAS
				if (num == 3) {
					for (int i = 0; i <= vehiculos.size() - 1; i++) {
						if (v1.equals(vehiculos.get(i).getPlaca())) {
							vp.getPo().getPc().getInfoLbl1().setText(vehiculos.get(i).getPuertas());
						}
					}
					for (int j = 0; j <= vehiculos.size() - 1; j++) {
						if (v2.equals(vehiculos.get(j).getPlaca())) {
							vp.getPo().getPc().getInfoLbl2().setText(vehiculos.get(j).getPuertas());
						}
					}
					if (vehiculo.comparar(num, v1, v2) == 1) {
						vp.mostrarMensaje("Los vehiculos tienen las mismas puertas", "INFORMACION");
					}
					if (vehiculo.comparar(num, v1, v2)==0) {
						vp.mostrarMensaje("El vehiculo con placa " + v1 + " tiene mas puertas", "INFORMACION");
					}
					if (vehiculo.comparar(num, v1, v2)==-1) {
						vp.mostrarMensaje("El vehiculo con placa "+ v1 + " tiene menos puertas", "INFORMACION");
					}
				}
				//CAPACIDAD
				if (num == 4) {
					for (int i = 0; i <= vehiculos.size() - 1; i++) {
						if (v1.equals(vehiculos.get(i).getPlaca())) {
							vp.getPo().getPc().getInfoLbl1().setText(vehiculos.get(i).getCapacidad());
						}
					}
					for (int j = 0; j <= vehiculos.size() - 1; j++) {
						if (v2.equals(vehiculos.get(j).getPlaca())) {
							vp.getPo().getPc().getInfoLbl2().setText(vehiculos.get(j).getCapacidad());
						}
					}
					if (vehiculo.comparar(num, v1, v2) == 1) {
						vp.mostrarMensaje("Los vehiculos tienen la misma capacidad", "INFORMACION");
					}
					if (vehiculo.comparar(num, v1, v2)==-1) {
						vp.mostrarMensaje("El vehiculo con placa " + v1 + " tiene mas capacidad", "INFORMACION");
					}
					if (vehiculo.comparar(num, v1, v2)==-0) {
						vp.mostrarMensaje("El vehiculo con placa "+ v1 + " tiene menos capacidad", "INFORMACION");
					}
				}
				//TIPO
				if (num == 5) {
					for (int i = 0; i <= vehiculos.size() - 1; i++) {
						if (v1.equals(vehiculos.get(i).getPlaca())) {
							vp.getPo().getPc().getInfoLbl1().setText(vehiculos.get(i).getTipo());
						}
					}
					for (int j = 0; j <= vehiculos.size() - 1; j++) {
						if (v2.equals(vehiculos.get(j).getPlaca())) {
							vp.getPo().getPc().getInfoLbl2().setText(vehiculos.get(j).getTipo());
						}
					}
					if (vehiculo.comparar(num, v1, v2) == 1) {
						vp.mostrarMensaje("Los vehiculos son del mismo tipo", "INFORMACION");
					}
					if (vehiculo.comparar(num, v1, v2)==0) {
						vp.mostrarMensaje("Los vehiculos son de diferente tipo", "INFORMACION");
					}
				}
			} catch (NumberFormatException n) {
				if (vp.getPo().getPc().getComp1Txt().getText().isEmpty()
						|| vp.getPo().getPc().getComp2Txt().getText().isEmpty()) {
					vp.mostrarMensaje("Todos los campos son requeridos", "ERROR");
				}
			}
		}

		if (vp.getPo().getPc().getRegresarBtn() == event.getSource()) {

			vp.getPo().getVenderBtn().setVisible(true);
			vp.getPo().getCapacRad().setVisible(true);
			vp.getPo().getMarcaRad().setVisible(true);
			vp.getPo().getModeloRad().setVisible(true);
			vp.getPo().getPlacaRad().setVisible(true);
			vp.getPo().getPuertaRad().setVisible(true);
			vp.getPo().getTipoRad().setVisible(true);
			vp.getPo().getMensajeLbl().setVisible(true);
			vp.getPo().getPc().setVisible(false);

		}

	}

}
