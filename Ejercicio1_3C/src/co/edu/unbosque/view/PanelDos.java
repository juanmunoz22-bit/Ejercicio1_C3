package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

	public class PanelDos extends JPanel {

	private JLabel mensajeLbl;
	private JRadioButton opcionRad;
		public PanelDos() {
		
		TitledBorder border = new TitledBorder("Comparar");
		border.setTitleFont(new Font("arial", Font.BOLD, 16));
		setLayout(null);
		setBackground(Color.white);
		setVisible(true);
		setBounds(0, 260, 460, 280);
		setBorder(border);
		setLayout(new GridLayout(1,1,15,8));
		activarPanelDos();
	}
		public void activarPanelDos() {
			
			
			
			
		}
	}

