package graphics;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import model.Player;

public class PanelTwo extends JPanel implements ActionListener {

	
	public final static String ADD="adir";
	public final static String DELETE="eliminar";
	public final static String ADDPLATFORM="adir Plataforma";
	
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

	private JTextField nickName1;
	private JTextField ability1;
	private JTextField pin1;
	private JTextField geoLocation1;
	private JTextField platform1;

	public PanelTwo(Graphic main) {
		// TODO Auto-generated constructor stub
		this.main=main;
		
		
		auxOne=new JPanel(new GridLayout(5,2));
		auxTwo=new JPanel(new GridLayout(1,3));
		join=new JPanel(new GridLayout(2,1));
		
		addPlayer=new JButton("add Jugador");
		addPlayer.setActionCommand(ADD);
		addPlayer.addActionListener(this);
		
		deletePlayer=new JButton("Delete player");
		deletePlayer.setActionCommand(DELETE);
		deletePlayer.addActionListener(this);
		deletePlayer.setSize(new Dimension(33,60));
		
		addPlatform=new JButton("add platform");
		addPlatform.setActionCommand(ADDPLATFORM);
		addPlatform.addActionListener(this);
		
		nickName=new JLabel("Nombre:");
		ability=new JLabel("Tipo de habilidad:");
		pin=new JLabel("Numero Ping:");
		geoLocation=new JLabel("Localizacion:");
		platform=new JLabel("Plataforma:");
		
		nickName1=new JTextField();
		nickName1.setEnabled(false);

		ability1=new JTextField("Dijite 1.NOVATO 2.INTERMEDIO 3.AVANZADO");
		ability1.setEnabled(false);
		
		pin1=new JTextField();
		pin1.setEnabled(false);
		
		geoLocation1=new JTextField();
		geoLocation1.setEnabled(false);
		
		platform1=new JTextField("Dijite 1.XBOX 2.PC 3.PS4");
		platform1.setEnabled(false);
		
		setBorder(new TitledBorder("Datos Jugador"));
		
		addPanels();
		add(join);
		
	}
	
	public void addPanels() {
		
		auxOne.add(nickName);
		auxOne.add(nickName1);
		auxOne.add(platform);
		auxOne.add(platform1);
		auxOne.add(ability);
		auxOne.add(ability1);
		auxOne.add(pin);
		auxOne.add(pin1);
		auxOne.add(geoLocation);
		auxOne.add(geoLocation1);
		
		join.add(auxOne);
		
		auxTwo.add(addPlayer);
		auxTwo.add(deletePlayer);
		auxTwo.add(addPlatform);
		auxTwo.setBorder(new TitledBorder("Controlador"));
		join.add(auxTwo);
		
	}
	public void statusPlayer(String nickName,double pin, String geoLocation, String ability,String platform) {
		
		
		this.nickName1.setText(nickName);
		this.ability1.setText(ability);
		this.pin1.setText(pin+"");
		this.geoLocation1.setText(geoLocation);
		this.platform1.setText(platform);
		
	}
	
	public void statusEntry(boolean status) {

		nickName1.setEnabled(status);	
		ability1.setEnabled(status);
		pin1.setEnabled(status);
		geoLocation1.setEnabled(status);
		platform1.setEnabled(status);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(ADD)) {
			
			try {
				if(nickName1.isEnabled()==false) {
					this.statusEntry(true);
				}else {
					main.addPlayer(nickName1.getText(),Double.parseDouble(pin1.getText()), geoLocation1.getText(),Integer.parseInt(ability1.getText()),Integer.parseInt(platform1.getText()));
					this.statusEntry(false);
					
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}	
		}else if(e.getActionCommand().equals(DELETE)) {
			String nick=JOptionPane.showInputDialog("Dijite el nickname del jugador a eliminar");
			main.deletePlayer(nick);
		}else if(e.getActionCommand().equals(ADDPLATFORM)) {
			try {
				if(main.getPanelOne().getActual()!=null) {
					main.enterPlatform();		
					main.activeThread();
				}

			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Antes de ingresar a la plataforma seleccione el Jugador");
			}

		}
		
	}
	
	public Graphic getMain() {
		return main;
	}

	public void setMain(Graphic main) {
		this.main = main;
	}

	public JButton getAddPlayer() {
		return addPlayer;
	}

	public void setAddPlayer(JButton addPlayer) {
		this.addPlayer = addPlayer;
	}

	public JButton getDeletePlayer() {
		return deletePlayer;
	}

	public void setDeletePlayer(JButton deletePlayer) {
		this.deletePlayer = deletePlayer;
	}

	public JButton getAddPlatform() {
		return addPlatform;
	}

	public void setAddPlatform(JButton addPlatform) {
		this.addPlatform = addPlatform;
	}

	public JPanel getAuxOne() {
		return auxOne;
	}

	public void setAuxOne(JPanel auxOne) {
		this.auxOne = auxOne;
	}

	public JPanel getAuxTwo() {
		return auxTwo;
	}

	public void setAuxTwo(JPanel auxTwo) {
		this.auxTwo = auxTwo;
	}

	public JPanel getJoin() {
		return join;
	}

	public void setJoin(JPanel join) {
		this.join = join;
	}

	public JLabel getNickName() {
		return nickName;
	}

	public void setNickName(JLabel nickName) {
		this.nickName = nickName;
	}

	public JLabel getAbility() {
		return ability;
	}

	public void setAbility(JLabel ability) {
		this.ability = ability;
	}

	public JLabel getPin() {
		return pin;
	}

	public void setPin(JLabel pin) {
		this.pin = pin;
	}

	public JLabel getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(JLabel geoLocation) {
		this.geoLocation = geoLocation;
	}

	public JLabel getPlatform() {
		return platform;
	}

	public void setPlatform(JLabel platform) {
		this.platform = platform;
	}

	public JTextField getNickName1() {
		return nickName1;
	}

	public void setNickName1(JTextField nickName1) {
		this.nickName1 = nickName1;
	}

	public JTextField getAbility1() {
		return ability1;
	}

	public void setAbility1(JTextField ability1) {
		this.ability1 = ability1;
	}

	public JTextField getPin1() {
		return pin1;
	}

	public void setPin1(JTextField pin1) {
		this.pin1 = pin1;
	}

	public JTextField getGeoLocation1() {
		return geoLocation1;
	}

	public void setGeoLocation1(JTextField geoLocation1) {
		this.geoLocation1 = geoLocation1;
	}

	public JTextField getPlatform1() {
		return platform1;
	}

	public void setPlatform1(JTextField platform1) {
		this.platform1 = platform1;
	}

}
