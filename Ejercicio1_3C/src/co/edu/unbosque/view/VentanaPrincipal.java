package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 6117540591733912503L;
	
	private PanelInicial pi = new PanelInicial();

	private JLabel titulo;
	private JLabel aLbl, bLbl, cLbl;
	private JTextField aTxt, bTxt, cTxt;
	private JButton agregarBtn, buscarBtn, eliminarBtn;

	public VentanaPrincipal() {

		setTitle("Ventana Principal");
		setSize(480, 400);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(true);
		add(pi);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void mostrarMensaje(String mensaje, String titulo) {
		if (titulo.equals("ERROR")) {
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
		}

	}

}