package com.crm.bo;

public class Voiture {
	private String marque = "Titine";
	private String couleur = "Rouge";
	private int nb_portes = 5;
	private int limite_vitesse = 50;
	private int vitesse = 0;
	private float prix = 0;
	private boolean boite_auto = false;
	private boolean demarrage = false;
	private boolean klaxonner = false;
	
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public int getNb_portes() {
		return nb_portes;
	}
	public void setNb_portes(int nb_portes) {
		this.nb_portes = nb_portes;
	}
	
	public int getLimite_vitesse() {
		return limite_vitesse;
	}
	public void setLimite_vitesse(int limite_vitesse) {
		this.limite_vitesse = limite_vitesse;
	}
	
	public int getVitesse() {
		return vitesse;
	}
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	public boolean isBoite_auto() {
		return boite_auto;
	}
	public void setBoite_auto(boolean boite_auto) {
		this.boite_auto = boite_auto;
	}
	
	public boolean isDemarrage() {
		return demarrage;
	}
	public void setDemarrage(boolean demarrage) {
		this.demarrage = demarrage;
	}
	
	public boolean isKlaxonner() {
		return klaxonner;
	}
	public void setKlaxonner(boolean klaxonner) {
		this.klaxonner = klaxonner;
	}
	
	
}
