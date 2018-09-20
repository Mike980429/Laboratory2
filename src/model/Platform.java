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
	public void addPlayer(String nickName,double pin, String geoLocation, int ability,int platform) {
		Player aux=new Player(nickName,pin,geoLocation,ability,platform);
		players.put(aux.getAbility(), aux);
	}
	
	public HashMap<String, Player> getPlayers() {
		return players;
	}
<<<<<<< HEAD

	

	
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
=======
	public void convertListPlayers() {
	//	players.keySet()
	}
	
>>>>>>> parent of 8019983... pulling
	
	
}