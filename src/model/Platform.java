package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.ImageIcon;


public class Platform {

	
	private HashMap<Integer, Player> players;
	//private HashMap<String,players> playersOne;
	
	
	public Platform() {
		// TODO Auto-generated constructor stub
		players=new HashMap<Integer,Player>();
		
		
	}
	public void addPlayer(String nickName,double pin, String geoLocation, int ability,int platform) {
		Player aux=new Player(nickName,pin,geoLocation,ability,platform);
		players.put(aux.getStatus(), aux);
	}
	
	public HashMap<Integer, Player> getPlayers() {
		return players;
	}
	
	public ArrayList<Player> convertListPlayers() {
		ArrayList<Player> listPlayer=new ArrayList<Player>();
		
		Iterator<Integer> iterator=players.keySet().iterator();
		while(iterator.hasNext()) {
			int key=iterator.next();
			if(true) {
				
			}
			listPlayer.add(players.get(key));
		}
		return listPlayer;
	}
	
	public int searchPlayer(String nickName) {
		int pos=0;
		Iterator<Integer> iterator=players.keySet().iterator();
		boolean f=false;
		while(iterator.hasNext()&&!f) {
			int key=iterator.next();
			if(players.get(key).getNickName().equalsIgnoreCase(nickName)) {
				pos=key;
				f=true;
			}
		}
		return pos;
	}
	
	public void deletePlayer(String nickName) {
		Iterator<Integer> iterator=players.keySet().iterator();
		boolean f=false;
		while(iterator.hasNext()&&!f) {
			int key=iterator.next();
			
			if(players.get(key).getNickName().equalsIgnoreCase(nickName)) {
				players.remove(key, players.get(key));
			
				f=true;
			}
		}
		
	}
	
	
}