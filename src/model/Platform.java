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
		if(players.containsKey(platform)){
			Player last= lastPlayerPlatform(platform);
			Player newP= new Player(nickName, pin, geoLocation, ability, platform, null, last);
			last.setSig(newP);
		}else{			
			players.put(platform, new Player(nickName, pin, geoLocation, ability, platform, null, null));
		}
	}
	
	public Player lastPlayerPlatform(Integer key){
		Player actual= players.get(key);
		while(actual.getSig()!=null){
			actual= actual.getSig();
		}
		return actual;
	}
	
	public HashMap<Integer, Player> getPlayers() {
		return players;
	}
	
	public ArrayList<Player> convertListPlayers() {
		ArrayList<Player> listPlayer=new ArrayList<Player>();
		
		Iterator<Integer> iterator= players.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key=iterator.next();
			Player actual= players.get(key);
			
			while(actual.getSig()!=null){
				listPlayer.add(actual);
				actual= actual.getSig();
			}
			listPlayer.add(actual);
			
			
		}
		return listPlayer;
	}
	

	public void searchPlayerForShoot(String nickName) throws Exception {
		Iterator<Integer> iterator=players.keySet().iterator();
		
		boolean f=false;
		while(iterator.hasNext()&&!f) {
			Integer key=iterator.next();
			Player actual= players.get(key);
			
			if(actual.getNickName().equalsIgnoreCase(nickName)) {
				actual.shootPlayer();
				f=true;
			}else{
					while(actual!=null){
					if(actual.getNickName().equalsIgnoreCase(nickName)) {
						actual.shootPlayer();
						f=true;
					}
					actual= actual.getSig();
				}
			}
		}
	}
	
	
	public void deletePlayer(String nickName) {
		Iterator<Integer> iterator=players.keySet().iterator();
		boolean f=false;
		while(iterator.hasNext()&&!f) {
			Integer key=iterator.next();
			Player actual= players.get(key);
			
			if(actual.getNickName().equalsIgnoreCase(nickName)) {
				if(actual.getSig()==null){
					players.remove(key, actual);
				}else{
					players.put(key, actual.getSig());
					actual.getSig().setAnt(null);
					actual.setSig(null);			
				}
				f=true;
			}else{
					while(actual!=null){
					if(actual.getNickName().equalsIgnoreCase(nickName)) {
						if(actual.getSig()!=null){							
							actual.getAnt().setSig(actual.getSig());
							actual.getSig().setAnt(actual.getAnt());
							actual.setSig(null);			
						}else{
							actual.getAnt().setSig(null);
							actual.setSig(null);
						}
						f=true;
					}
					actual= actual.getSig();
				}
			}
		}
		
	}
	
	
	public ArrayList<Player> clasifyPlataform(){
		ArrayList<Player> array= new ArrayList<>();
		Iterator<Integer> iterator=players.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key=iterator.next();
			array.add(players.get(key));
		}		
		
		return array;
	}
	
	

	
}