package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.ImageIcon;


public class Platform {

	
	private HashMap<String, Player> players;
	//private HashMap<String,players> playersOne;
	
	
	public Platform() {
		// TODO Auto-generated constructor stub
		players=new HashMap<String,Player>();
		
		
	}
	public void addPlayer(String nickName,double pin, String geoLocation, int ability,int platform) {
		Player aux=new Player(nickName,pin,geoLocation,ability,platform);
		players.put(aux.getAbility(), aux);
	}
	
	public HashMap<String, Player> getPlayers() {
		return players;
	}
	
	public ArrayList<Player> convertListPlayers() {
		ArrayList<Player> listPlayer=new ArrayList<Player>();
		
		Iterator<String> iterator=players.keySet().iterator();
		while(iterator.hasNext()) {
			String key=iterator.next();
			listPlayer.add(players.get(key));
		}
		return listPlayer;
	}
	
	
	
	public void deletePlayer(String nickName) {
		Iterator<String> iterator=players.keySet().iterator();
		boolean f=false;
		while(iterator.hasNext()&&!f) {
			String key=iterator.next();
			System.out.println("entro");
			if(players.get(key).getNickName().equalsIgnoreCase(nickName)) {
				players.remove(key, players.get(key));
				System.out.println("entro2");
				f=true;
			}
		}
		
	}
	
	
}