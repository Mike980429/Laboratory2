package model;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.ImageIcon;


public class Platform {

	private ArrayList<String> names;
	private ArrayList<String> countries;
	
	private HashMap<String, Player> players;
	//private HashMap<String,players> playersOne;
	
	
	public Platform() {
		// TODO Auto-generated constructor stub
		players=new HashMap<String,Player>();
		names= new ArrayList<>();
		countries= new ArrayList<>();
		
	}
	
	public void readFile(File file, ArrayList<String> array){
	    File f= file;
		if(file.exists()== true){
			try {
				FileInputStream fileIn= new FileInputStream(file);
				ObjectInputStream reader= new ObjectInputStream(fileIn); 
				
				array = (ArrayList<String>) reader.readObject();
			} catch (FileNotFoundException e) {
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
	}
	
	public void createRandomPlayers(){
		
		// Random names
		ArrayList<String> aux= new ArrayList<>();
		Random rand= new Random();
		
		for(int i=0;i<100;i++){
			aux.add(names.get(rand.nextInt(50)+1));
		}
		names= aux;	
		
		
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
		System.out.println(listPlayer.get(0).getAbility());
		return listPlayer;
	}
	
	
	
}