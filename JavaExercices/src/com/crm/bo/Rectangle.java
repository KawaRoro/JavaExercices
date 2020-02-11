/**
 * 
 */
package com.crm.bo;

//import java.util.Date;

/**
 * @author CRM
 *
 */
public class Rectangle {

	// Atrributs
	private int largeur;
	private int longeur;
	private int perimetre;
	private int surface;
	private String mesure;
	// protected Date dateNaissance;

	// Méthodes
	public int getLargeur() {
		return largeur;
	}
	
	public void setLargeur(int n) {
		largeur = n;
	}
	
	public int getLongeur() {
		return longeur;
	}
	
	public void setLongeur(int n) {
		longeur = n;
	}
	
	public void afficherDetails() {
		System.out.println("Le rectangle fait "+ largeur + " de large et " + longeur+ " de longeur.");
	}
	
	public void afficherComparaisonDetails(int id, int som_longeur, int som_largeur) {
		System.out.println("Le rectangle "+id+" fait "+ largeur + " de large et " + longeur+ " de longeur.");
		if(largeur < som_longeur && longeur < som_largeur ) {
			System.out.println("Le rectangle "+id+" est plus petit que la moyenne des rectangles saisis");
		}else {
			System.out.println("Le rectangle "+id+" est plus grand que la moyenne des rectangles saisis");
		}
	}
	
	public int calculPerimetre() {
		perimetre = (longeur + largeur)* 2;
		return perimetre;
	}
	
	public void afficherInfoPerimetre() {
		perimetre = (longeur + largeur)* 2;
		System.out.println("Le périmétre du rectangle fait "+ perimetre );
	}
	
	public void afficherInfoPerimetre(String mesure) {
		perimetre = (longeur + largeur)* 2;
		System.out.println("Le périmétre du rectangle fait "+ perimetre + " " + mesure);
	}
	
	public int calculSurface() {
		surface = (longeur * largeur);
		return surface;
	}
	
	public void afficherInfoSurface() {
		surface = (longeur * largeur);
		System.out.println("La surface du rectangle fait "+ surface);
	}
	
	public void afficherInfoSurface(String mesure) {
		surface = (longeur * largeur);
		System.out.println("La surface du rectangle fait "+ surface + " " + mesure);
	}
	
}
