package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelUno extends JPanel {

	private static final long serialVersionUID = -8961290724383069814L;

	private JButton agregarBtn, buscarBtn, eliminarBtn;

	private JLabel marcaLbl, modeloLbl, placaLbl, puertasLbl, capacidadLbl, tipoLbl;

	private JTextField marcaTxt, modeloTxt, placaTxt, puertasTxt, capacidadTxt, tipoTxt; 

	public PanelUno() {

		TitledBorder border = new TitledBorder("Botones");
		border.setTitleFont(new Font("arial", Font.BOLD, 16));
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(0, 30, 460, 200);
		setBorder(border);
		setLayout(new GridLayout(1, 1, 15, 8));
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

		// Configuramos la vista

		agregarBtn.setBounds(50, 40, 100, 20);
		buscarBtn.setBounds(220, 40, 100, 20);
		eliminarBtn.setBounds(50, 70, 100, 20);

		// Agregamos los botones al panel

		this.add(agregarBtn);
		this.add(buscarBtn);
		this.add(eliminarBtn);

	}
	
	

	public JButton getAgregarBtn() {
		return agregarBtn;
	}

	public void setAgregarBtn(JButton agregarBtn) {
		this.agregarBtn = agregarBtn;
	}

	public JButton getBuscarBtn() {
		return buscarBtn;
	}

	public void setBuscarBtn(JButton buscarBtn) {
		this.buscarBtn = buscarBtn;
	}

	public JButton getEliminarBtn() {
		return eliminarBtn;
	}

	public void setEliminarBtn(JButton eliminarBtn) {
		this.eliminarBtn = eliminarBtn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
