package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	private static final long serialVersionUID = 6117540591733912503L;

	public VentanaPrincipal() {
		setTitle("Banco");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
}
