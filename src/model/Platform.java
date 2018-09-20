package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		readPlayersSerializable();
		
		
	}
	
	public void savePlayerSerializable(String nickName,double pin, String geoLocation, int ability,int platform){
		addPlayer(nickName, pin, geoLocation, ability, platform);
		try{
			FileOutputStream fileOutputStream = new FileOutputStream(new File("./sources/players.txt"));
			ObjectOutputStream objectOutput= new ObjectOutputStream(fileOutputStream);
			
			objectOutput.writeObject(players);
			objectOutput.close();
		}catch (FileNotFoundException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void readPlayersSerializable(){
		try{
			FileInputStream fileInput= new FileInputStream(new File("./sources/players.txt"));
			ObjectInputStream objectInput= new ObjectInputStream(fileInput);
			
			players= (HashMap<Integer, Player>) objectInput.readObject();
			objectInput.close();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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