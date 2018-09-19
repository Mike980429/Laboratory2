package model;

import java.util.HashMap;

import javax.swing.ImageIcon;

public class Platform {

	
	private HashMap<String, Player> players;
	//private HashMap<String,players> playersOne;
	
	
	public Platform() {
		// TODO Auto-generated constructor stub
		players=new HashMap<String,Player>();
		
		
	}
	public void addPlayer(String nickName,double pin, String geoLocation, int ability,int platform,ImageIcon image) {
		Player aux=new Player(nickName,pin,geoLocation,ability,platform,image);
		players.put(aux.getAbility(), aux);
	}
	
	public HashMap<String, Player> getPlayers() {
		return players;
	}
		
	
	
}
