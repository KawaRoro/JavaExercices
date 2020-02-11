/**
 * 
 */
package com.crm.bo;

//import java.util.Date;

/**
 * @author CRM
 *
 */
public class Repere {

	// Atrributs
	private int x;
	private int y;
	//private int distance;

	// Méthodes
	public int getX() { // CoorX
		return x;
	}
	
	public void setX(int n) {
		this.x = n;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int n) {
		this.y = n;
	}
	
	public void afficherDetails() {
		System.out.println("Le repere a pour coordonnée x: "+ x + " et y: " + y + " ");
	}
	
	
}
