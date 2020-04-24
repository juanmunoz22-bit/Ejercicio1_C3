package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelInicial extends JPanel {
	
	
	private static final long serialVersionUID = -8961290724383069814L;
	
	private JLabel titulo;
	private JLabel aLbl, bLbl, cLbl;
	private JTextField aTxt, bTxt, cTxt;
	private JButton agregarBtn, buscarBtn, eliminarBtn;

	

	public PanelInicial() {
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(0, 0, 600, 600);
		
		TitledBorder border = new TitledBorder("");
		border.setTitleFont(new Font("arial", Font.BOLD, 16));
		
		setBorder(border);
		activarPanel();
	}
	
	public void activarPanel() {

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
		

		titulo.setBounds(50, 10, 100, 20);
		aLbl.setBounds(50, 40, 100, 20);
		bLbl.setBounds(50, 70, 100, 20);
		cLbl.setBounds(50, 100, 100, 20);
		aTxt.setBounds(220, 40, 100, 20);
		bTxt.setBounds(220, 70, 100, 20);
		cTxt.setBounds(220, 100, 100, 20);
		agregarBtn.setBounds(50, 130, 100, 20);
		

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

}
