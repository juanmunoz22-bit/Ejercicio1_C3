package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelUno extends JPanel {

	private static final long serialVersionUID = -8961290724383069814L;

	private JButton agregarBtn, buscarBtn, eliminarBtn, registraBtn, regresarBtn;

	public JButton getRegistraBtn() {
		return registraBtn;
	}

	public JButton getRegresarBtn() {
		return regresarBtn;
	}

	private JLabel marcaLbl, modeloLbl, placaLbl, puertasLbl, capacidadLbl, tipoLbl, infoLbl;

	private JTextField marcaTxt, modeloTxt, placaTxt, puertasTxt, capacidadTxt, tipoTxt;

	public PanelUno() {

		TitledBorder border = new TitledBorder("VEHICULOS");

		border.setTitleFont(new Font("arial", Font.BOLD, 16));
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(0, 10, 460, 250);
		setBorder(border);
		activarPanel();

	}

	public void activarPanel() {

		// Creamos los Botones
		agregarBtn = new JButton("Agregar");
		buscarBtn = new JButton("Buscar");
		eliminarBtn = new JButton("Eliminar");

		// Pones Nombre a los Botones
		agregarBtn.setName("Agregar");
		buscarBtn.setName("Buscar");
		eliminarBtn.setName("Eliminar");

		// configuramos el texto de los botones
		agregarBtn.setFont(new Font("arial", Font.BOLD, 18));
		buscarBtn.setFont(new Font("arial", Font.BOLD, 18));
		eliminarBtn.setFont(new Font("arial", Font.BOLD, 18));
		// Configuramos la vista

		agregarBtn.setBounds(20, 40, 130, 130);
		buscarBtn.setBounds(165, 40, 130, 130);
		eliminarBtn.setBounds(310, 40, 130, 130);

		// Agregamos los botones al panel

		this.add(agregarBtn);
		this.add(buscarBtn);
		this.add(eliminarBtn);

	}
	
	public void activarAgregar() {
		marcaLbl = new JLabel("Marca");
		marcaLbl.setBounds(10, 20, 100, 20);
		this.add(marcaLbl);
		
		modeloLbl = new JLabel("Modelo");
		modeloLbl.setBounds(10, 50, 100, 20);
		this.add(modeloLbl);
		
		placaLbl = new JLabel("Placa");
		placaLbl.setBounds(10, 80, 100, 20);
		this.add(placaLbl);
		
		puertasLbl = new JLabel("# Puertas");
		puertasLbl.setBounds(10, 110, 100, 20);
		this.add(puertasLbl);
		
		capacidadLbl = new JLabel("Capacidad");
		capacidadLbl.setBounds(10, 140, 100, 20);
		this.add(capacidadLbl);
		
		regresarBtn = new JButton("Regresar");
		regresarBtn.setBounds(10, 170, 100, 20);
		this.add(regresarBtn);
		
		
		
	}

	

	public JButton getEliminarBtn() {
		return eliminarBtn;
	}

	
	public JLabel getMarcaLbl() {
		return marcaLbl;
	}

	public void setMarcaLbl(JLabel marcaLbl) {
		this.marcaLbl = marcaLbl;
	}

	public JLabel getModeloLbl() {
		return modeloLbl;
	}

	public void setModeloLbl(JLabel modeloLbl) {
		this.modeloLbl = modeloLbl;
	}

	public JLabel getPlacaLbl() {
		return placaLbl;
	}

	public void setPlacaLbl(JLabel placaLbl) {
		this.placaLbl = placaLbl;
	}

	public JLabel getPuertasLbl() {
		return puertasLbl;
	}

	public void setPuertasLbl(JLabel puertasLbl) {
		this.puertasLbl = puertasLbl;
	}

	public JLabel getCapacidadLbl() {
		return capacidadLbl;
	}

	public void setCapacidadLbl(JLabel capacidadLbl) {
		this.capacidadLbl = capacidadLbl;
	}

	public JLabel getTipoLbl() {
		return tipoLbl;
	}

	public void setTipoLbl(JLabel tipoLbl) {
		this.tipoLbl = tipoLbl;
	}

	public JTextField getMarcaTxt() {
		return marcaTxt;
	}

	public void setMarcaTxt(JTextField marcaTxt) {
		this.marcaTxt = marcaTxt;
	}

	public JTextField getModeloTxt() {
		return modeloTxt;
	}

	public void setModeloTxt(JTextField modeloTxt) {
		this.modeloTxt = modeloTxt;
	}

	public JTextField getPlacaTxt() {
		return placaTxt;
	}

	public void setPlacaTxt(JTextField placaTxt) {
		this.placaTxt = placaTxt;
	}

	public JTextField getPuertasTxt() {
		return puertasTxt;
	}

	public void setPuertasTxt(JTextField puertasTxt) {
		this.puertasTxt = puertasTxt;
	}

	public JTextField getCapacidadTxt() {
		return capacidadTxt;
	}

	public void setCapacidadTxt(JTextField capacidadTxt) {
		this.capacidadTxt = capacidadTxt;
	}

	public JTextField getTipoTxt() {
		return tipoTxt;
	}

	public void setTipoTxt(JTextField tipoTxt) {
		this.tipoTxt = tipoTxt;
	}

	public JButton getAgregarBtn() {
		return agregarBtn;
	}

	public JButton getBuscarBtn() {
		return buscarBtn;
	}


}
