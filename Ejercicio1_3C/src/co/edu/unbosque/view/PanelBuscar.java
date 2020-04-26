package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelBuscar extends JPanel {

	private JLabel placaLbl, infoLbl;
	private JTextField placaTxt;
	private JButton buscarBtn;
	private JButton regresarBtn;
	private String texto;

	public PanelBuscar() {

		setLayout(null);
		setBackground(Color.white);
		setVisible(false);
		setBounds(0, 30, 460, 250);
		activarPanel();

	}

	public void activarPanel() {

		placaLbl = new JLabel("Placa");
		placaLbl.setBounds(50, 10, 100, 20);
		this.add(placaLbl);

		placaTxt = new JTextField();
		placaTxt.setBounds(100, 10, 100, 20);
		this.add(placaTxt);
		
		infoLbl = new JLabel();
		infoLbl.setBounds(50, -70, 300, 300);
		infoLbl.setVisible(true);
		this.add(infoLbl);
		
		buscarBtn = new JButton("Buscar");
		buscarBtn.setBounds(270, 10, 120, 80);
		this.add(buscarBtn);
		
		regresarBtn = new JButton("Regresar");
		regresarBtn.setBounds(270, 100, 120, 80);
		this.add(regresarBtn);
	}

	public JLabel getPlacaLbl() {
		return placaLbl;
	}

	public void setPlacaLbl(JLabel placaLbl) {
		this.placaLbl = placaLbl;
	}

	public JLabel getInfoLbl() {
		return infoLbl;
	}

	public void setInfoLbl(String texto) {
		this.texto = texto;
	}

	public JButton getBuscarBtn() {
		return buscarBtn;
	}

	public void setBuscarBtn(JButton buscarBtn) {
		this.buscarBtn = buscarBtn;
	}

	public JTextField getPlacaTxt() {
		return placaTxt;
	}

	public void setPlacaTxt(JTextField placaTxt) {
		this.placaTxt = placaTxt;
	}

	public JButton getAgregarBtn() {
		return buscarBtn;
	}

	public void setAgregarBtn(JButton agregarBtn) {
		this.buscarBtn = agregarBtn;
	}

	public JButton getRegresarBtn() {
		return regresarBtn;
	}

	public void setRegresarBtn(JButton regresarBtn) {
		this.regresarBtn = regresarBtn;
	}
	
}
