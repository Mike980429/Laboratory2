package model;

public class Weapon {

	private String type;
	private int numBullets;
	private int numCartridge;
	private boolean isAx;
	
	public Weapon(String type,int numBullets,int numCartridge) {
		// TODO Auto-generated constructor stub
		this.type=type;
		this.numBullets=numBullets;
		this.numCartridge=numCartridge;
		this.isAx=false;
	}
	public Weapon() {
		this.type="Hacha";
		this.isAx=true;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumBullets() {
		return numBullets;
	}
	public void setNumBullets(int numBullets) {
		this.numBullets = numBullets;
	}
	public int getNumCartridge() {
		return numCartridge;
	}
	public void setNumCartridge(int numCartridge) {
		this.numCartridge = numCartridge;
	}
	public boolean isAx() {
		return isAx;
	}
	public void setAx(boolean isAx) {
		this.isAx = isAx;
	}

}
