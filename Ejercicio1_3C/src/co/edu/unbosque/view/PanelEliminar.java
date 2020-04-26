package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEliminar extends JPanel {

	private JLabel placaLbl;
	private JTextField placaTxt;
	private JButton eliminarBtn, regresarBtn;
	

	public PanelEliminar() {
		
		setLayout(null);
		setBackground(Color.white);
		setVisible(false);
		setBounds(0, 30, 460, 250);
		activarPanel();
	}

	public void activarPanel() {
	
		placaLbl = new JLabel("Placa");
		placaLbl.setBounds(120, 50, 100, 20);
		this.add(placaLbl);
		
		placaTxt = new JTextField();
		placaTxt.setBounds(220, 50, 100, 20);
		this.add(placaTxt);
		
		eliminarBtn = new JButton("Eliminar");
		eliminarBtn.setBounds(100, 130, 100, 20);
		this.add(eliminarBtn);
		
		regresarBtn = new JButton("Regresar");
		regresarBtn.setBounds(250, 130, 100, 20);
		this.add(regresarBtn);
	
	}

	public JLabel getPlacaLbl() {
		return placaLbl;
	}

	public void setPlacaLbl(JLabel placaLbl) {
		this.placaLbl = placaLbl;
	}

	public JTextField getPlacaTxt() {
		return placaTxt;
	}

	public void setPlacaTxt(JTextField placaTxt) {
		this.placaTxt = placaTxt;
	}

	public JButton getEliminarBtn() {
		return eliminarBtn;
	}

	public void setEliminarBtn(JButton eliminarBtn) {
		this.eliminarBtn = eliminarBtn;
	}

	public JButton getRegresarBtn() {
		return regresarBtn;
	}

	public void setRegresarBtn(JButton regresarBtn) {
		this.regresarBtn = regresarBtn;
	}
	

}
