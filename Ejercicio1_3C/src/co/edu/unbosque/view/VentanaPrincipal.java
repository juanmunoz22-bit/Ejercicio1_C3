package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


	public class VentanaPrincipal extends JFrame {
		
		private static final long serialVersionUID = 6117540591733912503L;
		
		private JLabel titulo;
		private JLabel aLbl,bLbl,cLbl;
		private JTextField aTxt,bTxt,cTxt;
		private JButton agregarBtn,buscarBtn,eliminarBtn;	
		
		
		public VentanaPrincipal() {
			super();
			configurarVista();
			inicializarVista();
			organizarVista();
			agregarVista();
			
		}
		
		public void configurarVista() {
			
			setTitle("Ventana Principal");
			setSize(480, 400);
			setLocationRelativeTo(null);
			setLayout(null);
			setResizable(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
		}

		public void inicializarVista() {

			titulo = new JLabel("BIENVENIDO");
			aLbl = new JLabel("aLbl");
			bLbl = new JLabel("bLbl");
			cLbl = new JLabel("cLbl");
			aTxt = new JTextField("aTxt");
			bTxt = new JTextField("b");
			cTxt = new JTextField("cTxt");
			agregarBtn = new JButton("Agregar");
			buscarBtn = new JButton("Buscar");
			eliminarBtn = new JButton("Eliminar");
		
			aLbl.setName("aLbl");
			bLbl.setName("bLbl");
			cLbl.setName("cLbl");
			aTxt.setName("aTxt");
			bTxt.setName("bTxt");
			cTxt.setName("cTxt");
			agregarBtn.setName("Agregar");
			buscarBtn.setName("Buscar");
			eliminarBtn.setName("Eliminar");
		
		}

		public void organizarVista() {

			titulo.setBounds(50, 10, 100, 20);
			aLbl.setBounds(50, 40, 100, 20);
			bLbl.setBounds(220, 40, 100, 20);
			cLbl.setBounds(50, 70, 100, 20);
			aTxt.setBounds(220, 70, 100, 20);
			bTxt.setBounds(220, 100, 100, 20);
			cTxt.setBounds(220, 100, 100, 20);	
		
		}
		public void agregarVista() {
			
			this.add(titulo);
			this.add(aLbl);
			this.add(bLbl);
			this.add(cLbl);
			this.add(aTxt);
			this.add(bTxt);
			this.add(cTxt);
			this.add(agregarBtn);
			this.add(buscarBtn);
			this.add(eliminarBtn);
			
		}
		
	
	public void mostrarMensaje(String mensaje, String titulo) {
		if(titulo.equals("ERROR")) {
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
}