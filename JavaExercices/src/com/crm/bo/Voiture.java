package com.crm.bo;

public class Voiture {
	private String marque = "Renault";
	private String modele = "";
	private String couleur = "blanc";
	private int id = 0;
	private int nb_portes = 5;
	private int puissance = 6;
	private double km = 0;
	private double limite_vitesse = 50;
	private double vitesse_max = 180;
	private double vitesse = 0;
	private float prix = 0;
	private boolean boite_auto = false;
	private boolean demarrage = false;
	private boolean klaxonner = false;
	
	public static int count = 0;
	
	public Voiture() {
		this.id = ++count;
	}
	
	public Voiture(String marque, double vitesse_max, int puissance) {
		this.id = ++count;
		this.marque = marque;
		this.vitesse_max = vitesse_max;
		this.puissance = puissance;
	}
	
	public Voiture(String marque, String modele, String couleur, int nb_portes, int prix, boolean boite_auto, double vitesse_max, int puissance) {
		this.id = ++count;
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.nb_portes = nb_portes;
		this.prix = prix;
		this.boite_auto = boite_auto;
		this.vitesse_max = vitesse_max;
		this.puissance = puissance;
	}
	
	public String attributs() {
		return "id=" + id + ", marque=" + marque + ", vitesse=" + vitesse + ", km=" + km;
	}
	public void attributs_choix() {
		System.out.println("[" + id + "]");
		System.out.println("Marque : " + marque);
		System.out.println("Modele : " + modele );
		System.out.println("Couleur : " + couleur );
		System.out.println("Vitesse maximum : " + vitesse_max );
		System.out.println("Nombre de portes : " + nb_portes );
		System.out.println("Prix : " + prix );
		System.out.println("Boite automatique : " + boite_auto );
		System.out.println("Puissance : " + puissance );
		
		//return "[" + id + "] -> marque=" + marque + ", model=" + model + ", couleur=" + couleur + ", vitesse_max=" + vitesse_max + ", nb_portes=" + nb_portes + ", prix=" + prix + ", boite_auto=" + boite_auto + ", puissance=" + puissance;
		System.out.println("                ");
	}
	public String attributs_complet() {
		return "[" + id + "] -> marque=" + marque + ", modele=" + modele + ", couleur=" + couleur + ", vitesse_max=" + vitesse_max + ", nb_portes=" + nb_portes + ", prix=" + prix + ", boite_auto=" + boite_auto + ", puissance=" + puissance;
	}
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public String getModele() {
		return modele;
	}
	public void setModel(String modele) {
		this.modele = modele;
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
	
	public double getLimite_vitesse() {
		return limite_vitesse;
	}
	public void setLimite_vitesse(int limite_vitesse) {
		this.limite_vitesse = limite_vitesse;
	}
	
	public double getVitesse() {
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
