package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Platform;
import model.Player;

public class PlataformTest {
	
	private Platform main;
	
	public void setUpEscenari1(){
		main= new Platform();

		main.addPlayer("Juan", 1, "brasil", 1, 1);
		main.addPlayer("Pablo", 1, "brasil", 1, 1);
		main.addPlayer();

		
	}
	

	@Test
	public void addPlayer() {
		main= new Platform();
		int size= main.getPlayers().size();
		
		main.addPlayer("Mabe", 1, "1", 1, 1);
		
		assertTrue(size!=(main.getPlayers().size()));
	}
	
	@Test
	public void lastPlayer() {
		setUpEscenari1();
		
		assertEquals(main.lastPlayerPlatform(1),  );
	}
	

}
