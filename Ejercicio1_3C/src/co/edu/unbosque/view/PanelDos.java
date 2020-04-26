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

	PanelComparar pc = new PanelComparar();
	
	private JRadioButton modeloRad,marcaRad,placaRad,capacRad,puertaRad,tipoRad;
	private ButtonGroup buttonG;
	private JButton venderBtn;
	private JLabel mensajeLbl;
	
		public PanelDos() {
		
		TitledBorder border = new TitledBorder("ACCIONES");
		border.setTitleFont(new Font("arial", Font.BOLD, 16));
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(0, 260, 460, 270);
		setBorder(border);
		add(pc);
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
		
		venderBtn = new JButton("Vender");
		
		
		//ponemos nombre al Jlabel
		mensajeLbl.setName("mensaje");	
		
		//Configuramos la vista
		mensajeLbl.setBounds(10, 20, 290, 20);
		modeloRad.setBounds(250, 60, 200, 30);
		marcaRad.setBounds(250, 90, 200, 30);
		placaRad.setBounds(250, 120, 200, 30);
		capacRad.setBounds(250, 120, 200, 30);
		puertaRad.setBounds(250, 150, 200, 30);
		tipoRad.setBounds(250, 180, 200, 30);
	
		venderBtn.setBounds(10, 50, 210, 180);
		
		
		//configuramos el texto del botón

		venderBtn.setFont(new Font("arial", Font.BOLD, 18));
		
		//Agregamos los botones al panel
		this.add(mensajeLbl);
		this.add(modeloRad);
		buttonG.add(modeloRad);
		this.add(marcaRad);
		buttonG.add(marcaRad);	
		//this.add(placaRad);
		//buttonG.add(placaRad);
		this.add(capacRad);
		buttonG.add(capacRad);
		this.add(puertaRad);
		buttonG.add(puertaRad);
		this.add(tipoRad);
		buttonG.add(tipoRad);
		//this.add(compararBtn);
		this.add(venderBtn);
		
		}
		
		public void desactivarPanel() {
			
			mensajeLbl.setVisible(false);
			capacRad.setVisible(false);
			marcaRad.setVisible(false);
			modeloRad.setVisible(false);
			placaRad.setVisible(false);
			puertaRad.setVisible(false);
			tipoRad.setVisible(false);
			mensajeLbl.setVisible(false);
			venderBtn.setVisible(false);
			
		}
		public PanelComparar getPc() {
			return pc;
		}
		public void setPc(PanelComparar pc) {
			this.pc = pc;
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
		public JButton getVenderBtn() {
			return venderBtn;
		}
		public void setVenderBtn(JButton venderBtn) {
			this.venderBtn = venderBtn;
		}
		public JLabel getMensajeLbl() {
			return mensajeLbl;
		}
		public void setMensajeLbl(JLabel mensajeLbl) {
			this.mensajeLbl = mensajeLbl;
		}
		

		
	}

