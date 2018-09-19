package model;

import java.util.Stack;

import javax.swing.ImageIcon;

public class Player {
	
	//Constantes:
	public final static String NOOB="noob"; 
	public final static String INTERMEDIATE="intermediate";
	public final static String ADVANCED="advanced";
	
	public final static String XBOX="advanced";
	public final static String PC="pc";
	public final static String PS4="ps4";
	
	//Relaciones:
	private Stack<Weapon> weapons;
	
	//Variables:
	private String nickName;
	private double pin;
	private String geoLocation;
	private String ability;
	private String platform;
	private ImageIcon skin;

	
	public Player(String nickName,double pin, String geoLocation, int ability,int platform,ImageIcon skin) {
		// TODO Auto-generated constructor stub
		this.nickName=nickName;
		this.pin=pin;
		this.geoLocation=geoLocation;
		assingPlatform(platform);
		assingAbility(ability);
		this.skin=skin;
		weapons=new Stack<Weapon>();
		weapons.push(new Weapon());
	}

	public void addWeapon(String type,int numBullets) {
		if(numBullets!=0) {
			weapons.push(new Weapon(type,numBullets));
		}	
	}
	
	public void deleteWeaponAutomatic() {
		if(weapons.firstElement().isAx()==false) {
			if(weapons.firstElement().getNumBullets()==0) {
				weapons.pop();
			}
		}
	}
	
	public Stack<Weapon> getWeapons() {
		return weapons;
	}
	
	public void assingPlatform(int platform) {
		if(platform==1) {
			this.platform=XBOX;
		}else if(platform==2) {
			this.platform=PC;
		}else if(platform==3) {
			this.platform=PS4;
		}
	}
	
	public void assingAbility(int ability) {
		if(ability==1) {
			this.ability=NOOB;
		}else if(ability==2) {
			this.ability=INTERMEDIATE;
		}else if(ability==3) {
			this.platform=ADVANCED;
		}
	}
	
	public String getNickName() {
		return nickName;
	}
	

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public double getPin() {
		return pin;
	}


	public void setPin(double pin) {
		this.pin = pin;
	}


	public String getGeoLocation() {
		return geoLocation;
	}


	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}


	public String getAbility() {
		return ability;
	}


	public void setAbility(String ability) {
		this.ability = ability;
	}

}
