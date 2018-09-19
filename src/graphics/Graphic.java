package graphics;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Platform;

public class Graphic extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Platform platform;
	private PanelOne panelOne;
	private PanelTwo panelTwo;
	private PanelThree panelThree;
	private JLabel image;
	private ImageIcon ima;
	
	private JPanel panelAux;
	
	public Graphic() {
		// TODO Auto-generated constructor stub
		image=new JLabel();
		ima=new ImageIcon("/resource/fot.jpg");
		Icon c=new ImageIcon(ima.getImage());
		image.setIcon(c);
		this.repaint();
		
		panelOne=new PanelOne(this);
		panelTwo=new PanelTwo(this);
		panelThree=new PanelThree(this);
		
		platform= new Platform(); 
		panelAux=new JPanel(new BorderLayout());
		
		panelAux.add(panelOne,BorderLayout.WEST);
		panelAux.add(image,BorderLayout.NORTH);
		panelAux.add(panelTwo,BorderLayout.EAST);
		
		add(panelAux);
		setVisible(true);
		//pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String []buñuelo) {
		Graphic graphics=new Graphic();
		
	}


