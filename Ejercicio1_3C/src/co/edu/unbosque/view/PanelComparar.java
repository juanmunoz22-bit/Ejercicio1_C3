package co.edu.unbosque.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelComparar extends JPanel {

	private JTextField comp1Txt, comp2Txt;
	private JLabel mensajeLbl, comp1Lbl, comp2Lbl;
	private JButton compararBtn, regresarBtn;
	
	public PanelComparar() {
		
		setLayout(null);
		setBackground(Color.white);
		setVisible(false);
		setBounds(0, 30, 460, 250);
		activarPanel();
	}

	public void activarPanel() {
	
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
		compararBtn.setBounds(270,200, 100, 30);
		this.add(compararBtn);

		regresarBtn = new JButton("Regresar");
		regresarBtn.setBounds(80,200, 100, 30);
		this.add(regresarBtn);
		
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

	public JLabel getMensajeLbl() {
		return mensajeLbl;
	}

	public void setMensajeLbl(JLabel mensajeLbl) {
		this.mensajeLbl = mensajeLbl;
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

	public JButton getCompararBtn() {
		return compararBtn;
	}

	public void setCompararBtn(JButton compararBtn) {
		this.compararBtn = compararBtn;
	}

	public JButton getRegresarBtn() {
		return regresarBtn;
	}

	public void setRegresarBtn(JButton regresarBtn) {
		this.regresarBtn = regresarBtn;
	}
	
}