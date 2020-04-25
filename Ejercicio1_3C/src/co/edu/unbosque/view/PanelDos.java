package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

	public class PanelDos extends JPanel {

	private JLabel mensajeLbl;
	private JRadioButton modeloRad,marcaRad,placaRad,capacRad,puertaRad,tipoRad;
	private ButtonGroup buttonG;
	private JButton compararBtn;
	
		public PanelDos() {
		
		TitledBorder border = new TitledBorder("COMPARAR");
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
		
		//ponemos nombre al Jlabel
		mensajeLbl.setName("mensaje");	
		
		//Configuramos la vista
		mensajeLbl.setBounds(10, 20, 290, 20);
		modeloRad.setBounds(10, 50, 200, 30);
		marcaRad.setBounds(10, 80, 200, 30);
		placaRad.setBounds(10, 110, 200, 30);
		capacRad.setBounds(10, 140, 200, 30);
		puertaRad.setBounds(10, 170, 200, 30);
		tipoRad.setBounds(10, 200, 200, 30);
		compararBtn.setBounds(230, 50, 210, 180);
		
		
		//configuramos el texto del botón
		compararBtn.setFont(new Font("arial", Font.BOLD, 18));
		
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
		this.add(compararBtn);
		
		}
	}

