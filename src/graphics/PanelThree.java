package graphics;

import java.awt.GridLayout;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Player;

public class PanelThree extends JOptionPane{

	private JList<Player> players;
	private Graphic main;
	
	private JPanel aux;
	
	public PanelThree(Graphic main) {
		// TODO Auto-generated constructor stub
		this.main=main;
		aux=new JPanel(new GridLayout(2,1));
		
		
	}

}
