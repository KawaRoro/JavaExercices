/**
 * 
 */
package com.crm.bo;

/**
 * @author CRM
 *
 */
public class Film {

	// Atrributs
	private String titre;
	private String classif;
	private String category;
	// protected Date dateNaissance;
	
	// Méthodes
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String n) {
		titre = n;
	}
	
	public String getClassification() {
		return classif;
	}
	
	public void setClassification(String cl) {
		classif = cl;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String cat) {
		category = cat;
	}
	
	public void afficherDetails() {
		System.out.println("Le titre du film est : " + titre + "de la catégorie " + category + " et classé dans : " + classif);
	}
}
