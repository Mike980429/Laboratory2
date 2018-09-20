package graphics;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		ima=new ImageIcon("./sources/fortnite.jpg");
		Icon c=new ImageIcon(ima.getImage());
		image.setIcon(c);
		this.repaint();
		
		panelOne=new PanelOne(this);
		panelTwo=new PanelTwo(this);
		
		
		platform= new Platform(); 
		panelAux=new JPanel(new BorderLayout());
		
		panelAux.add(panelOne,BorderLayout.WEST);
		panelAux.add(image,BorderLayout.NORTH);
		panelAux.add(panelTwo,BorderLayout.EAST);
		//panelAux.add(panelThree,BorderLayout.SOUTH);
		add(panelAux);
		setVisible(true);
		//pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}

	public void enterPlatform(){
		panelThree=new PanelThree(this);
		panelThree.setVisible(true);
	
		
	}
	
	public void addPlayer(String nickName,double pin, String geoLocation, int ability,int platform){
		this.platform.addPlayer(nickName, pin, geoLocation, ability, platform);
<<<<<<< HEAD
		viewListPlayers();

	}
	public void viewListPlayers() {
		Player[] s=platform.convertListPlayers().toArray(new Player[platform.convertListPlayers().size()]);
		panelOne.getPlayers().setListData(s);
	}
	
<<<<<<< HEAD
=======
	
>>>>>>> ab71e396407ad98089d97f99093947d849d9f6c8
	public void deletePlayer(String nickName) {
		platform.deletePlayer(nickName);
		viewListPlayers();

	}
		
	
	
=======
	}
	
>>>>>>> parent of 8019983... pulling
	public void addArm(){
		
		
	}
	

	
	public static void main(String []ventana) {
		Graphic graphics=new Graphic();
		
	}

}
