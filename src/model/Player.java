package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;

import javax.swing.ImageIcon;

public class Player implements Serializable {
	
	//Constantes:
	public final static String NOOB="Novato"; 
	public final static String INTERMEDIATE="Intermedio";
	public final static String ADVANCED="Avanzado";
	
	public final static String XBOX="XBOX";
	public final static String PC="PC";
	public final static String PS4="PS4";
	
	//Relaciones:
	private Stack<Weapon> weapons;
	
	//Variables:
	private String nickName;
	private double pin;
	private String geoLocation;
	private String ability;
	private String platform;
	private Player sig;
	private Player ant;
	private ImageIcon skin;

	
	public Player(String nickName,double pin, String geoLocation, int ability,int platform,Player sig,Player ant) {
		// TODO Auto-generated constructor stub
		this.nickName=nickName;
		this.pin=pin;
		this.geoLocation=geoLocation;
		this.sig= sig;
		this.ant= ant;
		assingPlatform(platform);
		assingAbility(ability);
	
		weapons=new Stack<Weapon>();
		weapons.push(new Weapon());
	}

	public void setSig(Player sig) {
		this.sig = sig;
	}

	public void setAnt(Player ant) {
		this.ant = ant;
	}

	public Player getSig() {
		return sig;
	}

	public Player getAnt() {
		return ant;
	}

	public String getPlatform() {
		return platform;
	}

	public void addWeapon(String type,int numBullets) {
		if(numBullets!=0) {
			weapons.push(new Weapon(type,numBullets));
		}	
	}
	
	public boolean deleteWeaponAutomatic() {
		boolean status=false;
		if(weapons.lastElement().isAx()==false) {
			if(weapons.lastElement().getNumBullets()==0) {
				weapons.pop();
				status=true;
			}
		}
			return status;
	}
	public void shootPlayer() throws Exception{
		weapons.lastElement().shoot();
		if(deleteWeaponAutomatic()) {
			throw new Exception(" ");
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
	
	public ArrayList convertListWeapon() {
		ArrayList<Weapon> listWeapon=new ArrayList<Weapon>();
		ListIterator<Weapon> weapon=weapons.listIterator();
		while (weapon.hasNext()) {
		listWeapon.add(weapon.next());
			
		}
		return listWeapon;
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
	public int AssingAbility() {
		int aux=0;
		if(this.ability.equals(NOOB)) {
			aux=1;
		}else if(this.ability.equals(INTERMEDIATE)) {
			aux=2;
		}else if(this.ability.equals(ADVANCED)) {
			aux=3;
		}
		return aux;
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

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String mensaje=this.nickName+" / "+this.ability+" / "+this.platform+" / # Ping: "+this.pin+" / "+this.geoLocation;
		return mensaje;
	}
}
