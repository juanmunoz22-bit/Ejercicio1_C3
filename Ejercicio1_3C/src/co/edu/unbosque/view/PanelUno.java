package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelUno extends JPanel {

	private static final long serialVersionUID = -8961290724383069814L;

	private PanelAgregar pa = new PanelAgregar();

	private PanelEliminar pe = new PanelEliminar();

	private PanelBuscar pb = new PanelBuscar();

	private JButton agregarBtn, buscarBtn, eliminarBtn;

	public PanelUno() {

		TitledBorder border = new TitledBorder("VEHICULOS");

		border.setTitleFont(new Font("arial", Font.BOLD, 16));
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(0, 10, 460, 250);
		setBorder(border);
		add(pa);
		add(pe);
		add(pb);
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

		agregarBtn.setBounds(20, 40, 130, 180);
		buscarBtn.setBounds(165, 40, 130, 180);
		eliminarBtn.setBounds(310, 40, 130, 180);

		// Agregamos los botones al panel

		this.add(agregarBtn);
		this.add(buscarBtn);
		this.add(eliminarBtn);

	}

	public JButton getEliminarBtn() {
		return eliminarBtn;
	}

	public JButton getAgregarBtn() {
		return agregarBtn;
	}

	public JButton getBuscarBtn() {
		return buscarBtn;
	}

	public PanelAgregar getPa() {
		return pa;
	}

	public void setPa(PanelAgregar pa) {
		this.pa = pa;
	}

	public PanelEliminar getPe() {
		return pe;
	}

	public void setPe(PanelEliminar pe) {
		this.pe = pe;
	}

	public PanelBuscar getPb() {
		return pb;
	}

	public void setPb(PanelBuscar pb) {
		this.pb = pb;
	}

}
