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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	public void convertListPlayers() {
	//	players.keySet()
=======
	public ArrayList<Player> convertListPlayers() {
		ArrayList<Player> listPlayer=new ArrayList<Player>();
		
		Iterator<String> iterator=players.keySet().iterator();
		while(iterator.hasNext()) {
			String key=iterator.next();
		}
		return listPlayer;
>>>>>>> parent of 302fcce... Progressing x3
=======
=======
>>>>>>> 62a770e77e010180420b469582f7924b21b9f22d
=======
>>>>>>> 62a770e77e010180420b469582f7924b21b9f22d
	
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
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 62a770e77e010180420b469582f7924b21b9f22d
=======
>>>>>>> 62a770e77e010180420b469582f7924b21b9f22d
=======
>>>>>>> 62a770e77e010180420b469582f7924b21b9f22d
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