package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame {
	
	private static final long serialVersionUID = 6117540591733912503L;

	public VentanaPrincipal() {
		setTitle("Concesionario");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void mostrarMensaje(String mensaje, String titulo) {
		if(titulo.equals("ERROR")) {
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
}
