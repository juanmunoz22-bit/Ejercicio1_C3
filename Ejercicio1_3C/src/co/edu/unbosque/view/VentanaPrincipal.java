package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 6117540591733912503L;
	private PanelUno pi = new PanelUno();
	private PanelDos po = new PanelDos();
	public VentanaPrincipal() {

		setTitle("Ventana Principal");
		setSize(480, 600);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(true);
		add(pi);
		add(po);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	
	public PanelUno getPi() {
		return pi;
	}

	public PanelDos getPo() {
		return po;
	}

	public void mostrarMensaje(String mensaje, String titulo) {
		if (titulo.equals("ERROR")) {
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
		}

	}

}