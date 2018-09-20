package model;

import java.io.Serializable;

public class Weapon implements Serializable{

	private String type;
	private int numBullets;
	private boolean isAx;
	
	public Weapon(String type,int numBullets) {
		// TODO Auto-generated constructor stub
		this.type=type;
		this.numBullets=numBullets;
		this.isAx=false;
	}
	public Weapon() {
		this.type="Hacha";
		this.numBullets=0;
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

	public boolean isAx() {
		return isAx;
	}
	public void setAx(boolean isAx) {
		this.isAx = isAx;
	}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	String message=this.type+"  "+this.numBullets+"  "+this.isAx;
	return message;
}

}
