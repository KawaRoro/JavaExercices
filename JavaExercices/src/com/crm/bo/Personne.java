/**
 * 
 */
package com.crm.bo;

//import java.util.Date;

/**
 * @author CRM
 *
 */
public class Personne {

	// Atrributs
	public String surnom;
	private String nom;
	private String prenom;
	private String dom;
	private int compteur;
	// protected Date dateNaissance;
	
	// Constructeurs
	public Personne() {
		surnom = "";
		nom = "";
		prenom = "";
		System.out.println("Construction d'un objet Personne (sans param)");
	}
	
	public Personne(String surnom, String prenom, String nom) {
		this.surnom = surnom;
		this.nom = nom;
		this.prenom = prenom;
		System.out.println("Construction d'un objet Personne (avec param)");
	}

	// Méthodes
	public String getNom() {
		return nom;
	}
	
	public void setNom(String n) {
		nom = n;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String n) {
		prenom = n;
	}
	
	public String getDom() {
		return dom;
	}
	
	public void setDom(String n) {
		dom = n;
	}
	
	public void afficherDetails() {
		System.out.println("Vous êtes "+ prenom + " " + nom + " (" + surnom + ")");
	}
	
	public void afficherInfoPersonne() {
		System.out.println("Identifiant: "+ prenom + " " + nom + " (" + surnom + ")");
	}
	
	public void compteur(int cpt) {
		this.compteur = cpt;
		this.compteur = this.compteur + 1;
		System.out.println("Compteur : " + compteur);
	}
	
	
	public void afficherInfoPersonne(String Pays) {
		this.dom = Pays; // Save de la langue
		if(Pays.equals("fr")) {
			System.out.println("Identifiant: prénom : "+ prenom + ", nom : " + nom + " ( surnom : " + surnom + ")");
		}else if(Pays.equals("en")) {
			System.out.println("Login: first name : " + prenom + ", name : " + nom + " ( nickname : " + surnom + ")");
		}else if(Pays.equals("de")) {
			System.out.println("Einloggen: vorname "+ prenom + ", name : " + nom + " ( spitzname " + surnom + ")");
		}else if(Pays.equals("es")) {
			System.out.println("Conectarse: nombre : "+ prenom + ", apellido : " + nom + " ( apodo : " + surnom + ")");
		}else if(Pays.equals("it")) {
			System.out.println("Accedi: conome : "+ prenom + ", nome : " + nom + " ( soprannome : " + surnom + ")");
		}else {
			System.out.println("Identifiant: prénom : "+ prenom + ", nom : " + nom + " ( surnom : " + surnom + ")");
		}
	}
	
	
	public String[] retourTableau() {
		//System.out.println("Vous êtes "+ prenom + " " + nom + "(" + surnom + ")");
		String[] tab_infos = new String[2];
		tab_infos[0] = prenom;
		tab_infos[1] = nom;
		tab_infos[2] = surnom;
		return tab_infos;
	}
}
