package hilos;

import java.util.ArrayList;

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
			for (int i = 0; i < 65; i++) {
				players.add(new Player("s", 2, "colombia", 2, 2, null, null));
			//	gra.getPanelThree().getPlayers().setListData();
				gra.viewListPlayers1(players.toArray(new Player[i]));
				gra.repaint();
			
				Thread.sleep(444);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
