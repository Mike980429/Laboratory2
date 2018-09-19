package graphics;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTwo extends JPanel implements ActionListener {

	
	public final static String ADD="añadir";
	public final static String DELETE="eliminar";
	public final static String ADDPLATFORM="añadiPlataforma";
	
	private Graphic main;
	
	private JButton addPlayer;
	private JButton deletePlayer;
	private JButton addPlatform;
	
	private JPanel auxOne;
	private JPanel auxTwo;
	private JPanel join;
	
	private JLabel nickName;
	private JLabel ability;
	private JLabel pin;
	private JLabel geoLocation;
	private JLabel platform;
	

	public PanelTwo(Graphic main) {
		// TODO Auto-generated constructor stub
		this.main=main;
		
		
		auxOne=new JPanel(new GridLayout(5,1));
		auxTwo=new JPanel(new GridLayout(1,3));
		join=new JPanel(new GridLayout(2,1));
		
		addPlayer=new JButton("Agregar");
		addPlayer.setActionCommand(ADD);
		addPlayer.addActionListener(this);
		
		deletePlayer=new JButton("Eliminar");
		deletePlayer.setActionCommand(DELETE);
		deletePlayer.addActionListener(this);
		
		addPlatform=new JButton("Añadir a plataforma");
		addPlatform.setActionCommand(ADDPLATFORM);
		addPlatform.addActionListener(this);
		
		nickName=new JLabel("Nombre:");
		ability=new JLabel("Tipo de habilidad:");
		pin=new JLabel("Numero Ping:");
		geoLocation=new JLabel("Localizacion:");
		platform=new JLabel("Plataforma:");
		
		addPanels();
		add(join);
		
	}
	
	public void addPanels() {
		
		auxOne.add(nickName);
		auxOne.add(platform);
		auxOne.add(ability);
		auxOne.add(pin);
		auxOne.add(geoLocation);
		
		join.add(auxOne);
		
		auxTwo.add(addPlayer);
		auxTwo.add(deletePlayer);
		auxTwo.add(addPlatform);
		join.add(auxTwo);
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(ADD)) {
			
		}else if(e.getActionCommand().equals(DELETE)) {
			
		}else if(e.getActionCommand().equals(ADDPLATFORM)) {
			main.enterPlatform();
			System.out.println("ddd");
		}
		
	}

}
