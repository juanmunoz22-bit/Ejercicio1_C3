package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelAgregar extends JPanel {

	private JLabel marcaLbl;
	private JLabel modeloLbl;
	private JLabel placaLbl;
	private JLabel puertasLbl;
	private JLabel capacidadLbl;
	private JLabel tipoLbl;
	private JButton regresarBtn;
	private JButton agregarBtn;
	private JTextField marcaTxt, modeloTxt, placaTxt, puertasTxt, capacidadTxt, tipoTxt;

	public PanelAgregar() {
		TitledBorder border = new TitledBorder("VEHICULOS");

		border.setTitleFont(new Font("arial", Font.BOLD, 16));
		setLayout(null);
		setBackground(Color.white);
		setVisible(false);
		setBounds(0, 0, 460, 250);
		setBorder(border);
		activarPanel();

	}

	public void activarPanel() {
		marcaLbl = new JLabel("Marca");
		marcaLbl.setBounds(10, 50, 100, 20);
		this.add(marcaLbl);
		
		marcaTxt = new JTextField();
		marcaTxt.setBounds(80, 50, 100, 20);
		this.add(marcaTxt);

		modeloLbl = new JLabel("Modelo");
		modeloLbl.setBounds(10, 80, 100, 20);
		this.add(modeloLbl);
		
		modeloTxt = new JTextField();
		modeloTxt.setBounds(80, 80, 100, 20);
		this.add(modeloTxt);

		placaLbl = new JLabel("Placa");
		placaLbl.setBounds(10, 110, 100, 20);
		this.add(placaLbl);
		
		placaTxt = new JTextField();
		placaTxt.setBounds(80, 110, 100, 20);
		this.add(placaTxt);

		puertasLbl = new JLabel("# Puertas");
		puertasLbl.setBounds(10, 140, 100, 20);
		this.add(puertasLbl);
		
		puertasTxt = new JTextField();
		puertasTxt.setBounds(80, 140, 100, 20);
		this.add(puertasTxt);

		capacidadLbl = new JLabel("Capacidad");
		capacidadLbl.setBounds(10, 170, 100, 20);
		this.add(capacidadLbl);
		
		capacidadTxt = new JTextField();
		capacidadTxt.setBounds(80, 170, 100, 20);
		this.add(capacidadTxt);
		
		tipoLbl = new JLabel("Tipo");
		tipoLbl.setBounds(10, 200, 100, 20);
		this.add(tipoLbl);
		
		tipoTxt = new JTextField();
		tipoTxt.setBounds(80, 200, 100, 20);
		this.add(tipoTxt);

		agregarBtn = new JButton("Agregar");
		agregarBtn.setBounds(230, 20, 150, 100);
		this.add(agregarBtn);
		
		regresarBtn = new JButton("Regresar");
		regresarBtn.setBounds(230, 130, 150, 100);
		this.add(regresarBtn);

	}

	public JButton getAgregarBtn() {
		return agregarBtn;
	}

	public JLabel getMarcaLbl() {
		return marcaLbl;
	}

	public JLabel getModeloLbl() {
		return modeloLbl;
	}

	public JLabel getPlacaLbl() {
		return placaLbl;
	}

	public JLabel getPuertasLbl() {
		return puertasLbl;
	}

	public JLabel getCapacidadLbl() {
		return capacidadLbl;
	}

	public JLabel getTipoLbl() {
		return tipoLbl;
	}

	public JButton getRegresarBtn() {
		return regresarBtn;
	}

	public JTextField getMarcaTxt() {
		return marcaTxt;
	}

	public JTextField getModeloTxt() {
		return modeloTxt;
	}

	public JTextField getPlacaTxt() {
		return placaTxt;
	}

	public JTextField getPuertasTxt() {
		return puertasTxt;
	}

	public JTextField getCapacidadTxt() {
		return capacidadTxt;
	}

	public JTextField getTipoTxt() {
		return tipoTxt;
	}

	

}
