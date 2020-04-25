package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 6117540591733912503L;
	private PanelUno pi = new PanelUno();
	private PanelDos po = new PanelDos();
	private JButton regresarBtn;
	public VentanaPrincipal() {

		setTitle("Ventana Principal");
		setSize(480, 600);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(true);
		regresarBtn = new JButton("Regresar");
		regresarBtn.setBounds(100, 280, 100, 20);
		this.add(regresarBtn);
		add(pi);
		add(po);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	
	public JButton getRegresarBtn() {
		return regresarBtn;
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