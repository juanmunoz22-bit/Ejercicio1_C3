package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelUno extends JPanel {

	private static final long serialVersionUID = -8961290724383069814L;

	private JButton agregarBtn, buscarBtn, eliminarBtn, regUnoBtn,agUnoBtn,regDosBtn,elDosBtn;
	private JLabel marcaLbl, modeloLbl, placaLbl, puertasLbl, capacidadLbl, tipoLbl;
	private JTextField marcaTxt, modeloTxt, placaTxt, puertasTxt, capacidadTxt, tipoTxt; 
	
	public PanelUno() {

		TitledBorder border = new TitledBorder("BOTONES");

		border.setTitleFont(new Font("arial", Font.BOLD, 16));
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(0, 10, 460, 250);
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

		//configuramos el texto de los botones
		agregarBtn.setFont(new Font("arial", Font.BOLD, 18));
		buscarBtn.setFont(new Font("arial", Font.BOLD, 18));
		eliminarBtn.setFont(new Font("arial", Font.BOLD, 18));
		//Configuramos la vista
	
		agregarBtn.setBounds(50, 40, 100, 20);
		buscarBtn.setBounds(220, 40, 100, 20);
		eliminarBtn.setBounds(50, 70, 100, 20);

		// Agregamos los botones al panel

		this.add(agregarBtn);
		this.add(buscarBtn);
		this.add(eliminarBtn);

	}
		public void activarPanelAgregar() {
		
		TitledBorder border = new TitledBorder("AGREGAR");

		border.setTitleFont(new Font("arial", Font.BOLD, 16));
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(0, 30, 460, 250);
		setBorder(border);
	
		
		// Creamos los objetos de texto
		
		marcaLbl = new JLabel("Marca");
		modeloLbl  = new JLabel("Modelo"); 
		placaLbl  = new JLabel("Placa");
		puertasLbl = new JLabel("Puertas"); 
		capacidadLbl = new JLabel("Capacidad");
		tipoLbl = new JLabel("Tipo");
		
		// creamos las cajas de texto
		marcaTxt = new JTextField("");
		modeloTxt = new JTextField("");
		placaTxt = new JTextField("");
		puertasTxt = new JTextField("");
		capacidadTxt = new JTextField("");
		tipoTxt  = new JTextField("");

		// Pones Nombre a los Botones
		agregarBtn.setName("Agregar");
		buscarBtn.setName("Buscar");
		eliminarBtn.setName("Eliminar");

		//configuramos el texto de los botones
		agregarBtn.setFont(new Font("arial", Font.BOLD, 18));
		buscarBtn.setFont(new Font("arial", Font.BOLD, 18));
		eliminarBtn.setFont(new Font("arial", Font.BOLD, 18));
		
		//Configuramos la vista
		
		
		marcaLbl.setBounds(10, 20, 100, 20);
		modeloLbl.setBounds(10, 50, 100, 20); 
		placaLbl.setBounds(10, 80, 100, 20);
		puertasLbl.setBounds(10, 110, 100, 20);
		capacidadLbl.setBounds(10, 140, 100, 20);
		tipoLbl.setBounds(10, 170, 100, 20);
		
		marcaTxt.setBounds(130, 20, 100, 20);
		modeloTxt.setBounds(130, 50, 100, 20); 
		placaTxt.setBounds(130, 80, 100, 20);
		puertasTxt.setBounds(130, 110, 100, 20);
		capacidadTxt.setBounds(130, 140, 100, 20);
		tipoTxt.setBounds(130, 170, 100, 20); 

		// Agregamos los botones al panel
		this.add(marcaLbl);
		this.add(modeloLbl);
		this.add(placaLbl);	
		this.add(puertasLbl);	
		this.add(capacidadLbl);
		this.add(tipoLbl);
		this.add(marcaTxt);
		this.add(modeloTxt);
		this.add(placaTxt);
		this.add(puertasTxt);
		this.add(capacidadTxt);
		this.add(tipoTxt);
		
	}
		public void activarPanelEliminar() {
		
		TitledBorder border = new TitledBorder("ELIMINAR VEHICULO");

		border.setTitleFont(new Font("arial", Font.BOLD, 16));
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(0, 30, 460, 250);
		setBorder(border);
			
		//Creamos los obejetos de la vista
		
		placaLbl  = new JLabel("Placa");
		placaTxt = new JTextField("");
		regDosBtn = new JButton("Regresar");
		elDosBtn = new JButton("Eliminar");
		
		//Configuramos el texto
		placaLbl.setFont(new Font("arial", Font.BOLD, 16));
		regDosBtn.setFont(new Font("arial", Font.BOLD, 16));
		elDosBtn.setFont(new Font("arial", Font.BOLD, 16));
		
		//Configuramos la vista
		placaLbl.setBounds(10, 50, 100, 20);
		placaTxt.setBounds(150, 50, 100, 20);
		regDosBtn.setBounds(10, 180, 150, 50);
		elDosBtn.setBounds(200, 180, 150, 50);
		
		//Agregamos los objetos a la vista
		this.add(placaLbl);
		this.add(placaTxt);
		this.add(elDosBtn);
		this.add(regDosBtn);
		
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

		public JButton getRegUnoBtn() {
			return regUnoBtn;
		}

		public void setRegUnoBtn(JButton regUnoBtn) {
			this.regUnoBtn = regUnoBtn;
		}

		public JButton getAgUnoBtn() {
			return agUnoBtn;
		}

		public void setAgUnoBtn(JButton agUnoBtn) {
			this.agUnoBtn = agUnoBtn;
		}

		public JButton getRegDosBtn() {
			return regDosBtn;
		}

		public void setRegDosBtn(JButton regDosBtn) {
			this.regDosBtn = regDosBtn;
		}

		public JButton getElDosBtn() {
			return elDosBtn;
		}

		public void setElDosBtn(JButton elDosBtn) {
			this.elDosBtn = elDosBtn;
		}

		public JLabel getMarcaLbl() {
			return marcaLbl;
		}

		public void setMarcaLbl(JLabel marcaLbl) {
			this.marcaLbl = marcaLbl;
		}

		public JLabel getModeloLbl() {
			return modeloLbl;
		}

		public void setModeloLbl(JLabel modeloLbl) {
			this.modeloLbl = modeloLbl;
		}

		public JLabel getPlacaLbl() {
			return placaLbl;
		}

		public void setPlacaLbl(JLabel placaLbl) {
			this.placaLbl = placaLbl;
		}

		public JLabel getPuertasLbl() {
			return puertasLbl;
		}

		public void setPuertasLbl(JLabel puertasLbl) {
			this.puertasLbl = puertasLbl;
		}

		public JLabel getCapacidadLbl() {
			return capacidadLbl;
		}

		public void setCapacidadLbl(JLabel capacidadLbl) {
			this.capacidadLbl = capacidadLbl;
		}

		public JLabel getTipoLbl() {
			return tipoLbl;
		}

		public void setTipoLbl(JLabel tipoLbl) {
			this.tipoLbl = tipoLbl;
		}

		public JTextField getMarcaTxt() {
			return marcaTxt;
		}

		public void setMarcaTxt(JTextField marcaTxt) {
			this.marcaTxt = marcaTxt;
		}

		public JTextField getModeloTxt() {
			return modeloTxt;
		}

		public void setModeloTxt(JTextField modeloTxt) {
			this.modeloTxt = modeloTxt;
		}

		public JTextField getPlacaTxt() {
			return placaTxt;
		}

		public void setPlacaTxt(JTextField placaTxt) {
			this.placaTxt = placaTxt;
		}

		public JTextField getPuertasTxt() {
			return puertasTxt;
		}

		public void setPuertasTxt(JTextField puertasTxt) {
			this.puertasTxt = puertasTxt;
		}

		public JTextField getCapacidadTxt() {
			return capacidadTxt;
		}

		public void setCapacidadTxt(JTextField capacidadTxt) {
			this.capacidadTxt = capacidadTxt;
		}

		public JTextField getTipoTxt() {
			return tipoTxt;
		}

		public void setTipoTxt(JTextField tipoTxt) {
			this.tipoTxt = tipoTxt;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		

		
}
