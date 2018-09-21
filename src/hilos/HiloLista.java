package hilos;

import java.util.ArrayList;
import java.util.Iterator;

import graphics.Graphic;
import model.Player;

public class HiloLista extends Thread {
	
	private Graphic gra;
	
	public HiloLista(Graphic gra) {
		// TODO Auto-generated constructor stub
		this.gra=gra;
	}
	public void run() {
		ArrayList<Player> players=new ArrayList<Player>(); 
		try {
				int i=0;
				Player a=gra.getPanelOne().getActual();
				players.add(a);
				
				Iterator<Integer> iterator=gra.getPlatform().getPlayers().keySet().iterator();
				boolean f=false;
				
				while(iterator.hasNext()&&!f) {
					
					Integer key=iterator.next();
					Player actual= players.get(key);
					
					if(actual.getAbility().equalsIgnoreCase(a.getAbility())&&actual.getPlatform().equalsIgnoreCase(a.getPlatform())) {
						players.add(actual);
						f=true;
					}else{
							while(actual!=null){
							if(actual.getAbility().equalsIgnoreCase(a.getAbility())&&actual.getPlatform().equalsIgnoreCase(a.getPlatform())) {
								players.add(actual);
								f=true;
							}
							actual= actual.getSig();
						}

					}
					gra.viewListPlayers1(players.toArray(new Player[i]));
					i++;
					gra.repaint();
				
					Thread.sleep(444);	
				

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
