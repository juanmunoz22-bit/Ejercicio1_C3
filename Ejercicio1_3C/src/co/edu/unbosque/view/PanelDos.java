package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

	public class PanelDos extends JPanel {

	private static final long serialVersionUID = 791345044256043003L;
	
	private JLabel mensajeLbl, comp1Lbl, comp2Lbl;
	private JRadioButton modeloRad,marcaRad,placaRad,capacRad,puertaRad,tipoRad;
	private JTextField comp1Txt, comp2Txt;
	private ButtonGroup buttonG;
	private JButton compararBtn, venderBtn;
	
		public PanelDos() {
		
		TitledBorder border = new TitledBorder("ACCIONES");
		border.setTitleFont(new Font("arial", Font.BOLD, 16));
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(0, 260, 460, 270);
		setBorder(border);
		activarPanelDos();
	}
		public void activarPanelDos() {
			
		//Creamos los objetos
		mensajeLbl = new JLabel("Escoja una de las opciónes para poder comparar:");	
		modeloRad = new JRadioButton("Modelo o año");	
		marcaRad = new JRadioButton("Marca");	
		placaRad = new JRadioButton("Placa");	
		capacRad = new JRadioButton("Capacidad");	
		puertaRad = new JRadioButton("Puerta");	
		tipoRad = new JRadioButton("Tipo");	
		buttonG = new ButtonGroup();
		compararBtn = new JButton("Comparar");
		venderBtn = new JButton("Vender");
		
		
		//ponemos nombre al Jlabel
		mensajeLbl.setName("mensaje");	
		
		//Configuramos la vista
		mensajeLbl.setBounds(10, 20, 290, 20);
		modeloRad.setBounds(250, 50, 200, 30);
		marcaRad.setBounds(250, 80, 200, 30);
		placaRad.setBounds(250, 110, 200, 30);
		capacRad.setBounds(250, 140, 200, 30);
		puertaRad.setBounds(250, 170, 200, 30);
		tipoRad.setBounds(250, 200, 200, 30);
		compararBtn.setBounds(230, 50, 210, 180);
		venderBtn.setBounds(10, 50, 210, 180);
		
		
		//configuramos el texto del botón
		compararBtn.setFont(new Font("arial", Font.BOLD, 18));
		venderBtn.setFont(new Font("arial", Font.BOLD, 18));
		
		//Agregamos los botones al panel
		this.add(mensajeLbl);
		this.add(modeloRad);
		buttonG.add(modeloRad);
		this.add(marcaRad);
		buttonG.add(marcaRad);	
		this.add(placaRad);
		buttonG.add(placaRad);
		this.add(capacRad);
		buttonG.add(capacRad);
		this.add(puertaRad);
		buttonG.add(puertaRad);
		this.add(tipoRad);
		buttonG.add(tipoRad);
		//this.add(compararBtn);
		this.add(venderBtn);
		
		}
		
		public void activarComparar() {
			
			comp1Lbl = new JLabel("Placa 1");
			comp1Lbl.setBounds(100, 45, 150, 20);
			this.add(comp1Lbl);
			
			comp1Txt = new JTextField();
			comp1Txt.setBounds(50, 70, 150, 20);
			this.add(comp1Txt);
			
			comp2Lbl = new JLabel("Placa 2");
			comp2Lbl.setBounds(300, 45, 150, 20);
			this.add(comp2Lbl);
			
			comp2Txt = new JTextField();
			comp2Txt.setBounds(250, 70, 150, 20);
			this.add(comp2Txt);
			
			compararBtn = new JButton("Comparar");
			compararBtn.setBounds(0, 0, 100, 100);
			this.add(compararBtn);
			
		}
		
		public void desactivarPanel() {
			mensajeLbl.setVisible(false);
			capacRad.setVisible(false);
			marcaRad.setVisible(false);
			modeloRad.setVisible(false);
			placaRad.setVisible(false);
			puertaRad.setVisible(false);
			tipoRad.setVisible(false);
			compararBtn.setVisible(false);
			mensajeLbl.setVisible(false);
			venderBtn.setVisible(false);
			
		}
		
		public JLabel getMensajeLbl() {
			return mensajeLbl;
		}
		public void setMensajeLbl(JLabel mensajeLbl) {
			this.mensajeLbl = mensajeLbl;
		}
		public JRadioButton getModeloRad() {
			return modeloRad;
		}
		public void setModeloRad(JRadioButton modeloRad) {
			this.modeloRad = modeloRad;
		}
		public JRadioButton getMarcaRad() {
			return marcaRad;
		}
		public void setMarcaRad(JRadioButton marcaRad) {
			this.marcaRad = marcaRad;
		}
		public JRadioButton getPlacaRad() {
			return placaRad;
		}
		public void setPlacaRad(JRadioButton placaRad) {
			this.placaRad = placaRad;
		}
		public JRadioButton getCapacRad() {
			return capacRad;
		}
		public void setCapacRad(JRadioButton capacRad) {
			this.capacRad = capacRad;
		}
		public JRadioButton getPuertaRad() {
			return puertaRad;
		}
		public void setPuertaRad(JRadioButton puertaRad) {
			this.puertaRad = puertaRad;
		}
		public JRadioButton getTipoRad() {
			return tipoRad;
		}
		public void setTipoRad(JRadioButton tipoRad) {
			this.tipoRad = tipoRad;
		}
		public ButtonGroup getButtonG() {
			return buttonG;
		}
		public void setButtonG(ButtonGroup buttonG) {
			this.buttonG = buttonG;
		}
		public JButton getCompararBtn() {
			return compararBtn;
		}
		public void setCompararBtn(JButton compararBtn) {
			this.compararBtn = compararBtn;
		}
		public JLabel getComp1Lbl() {
			return comp1Lbl;
		}
		public void setComp1Lbl(JLabel comp1Lbl) {
			this.comp1Lbl = comp1Lbl;
		}
		public JLabel getComp2Lbl() {
			return comp2Lbl;
		}
		public void setComp2Lbl(JLabel comp2Lbl) {
			this.comp2Lbl = comp2Lbl;
		}
		public JTextField getComp1Txt() {
			return comp1Txt;
		}
		public void setComp1Txt(JTextField comp1Txt) {
			this.comp1Txt = comp1Txt;
		}
		public JTextField getComp2Txt() {
			return comp2Txt;
		}
		public void setComp2Txt(JTextField comp2Txt) {
			this.comp2Txt = comp2Txt;
		}
		public JButton getVenderBtn() {
			return venderBtn;
		}
		public void setVenderBtn(JButton venderBtn) {
			this.venderBtn = venderBtn;
		}
	}

