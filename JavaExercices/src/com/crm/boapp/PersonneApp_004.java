package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Personne;
// class vector
public class PersonneApp_004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char reponse = ' ';
		
		int cpt_tab_pers = 0;
		int cpt_max_tab_pers = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez le nombre de personne dans le groupe à créer : ");
		cpt_max_tab_pers = Integer.parseInt(sc.nextLine());
		//cpt_max_tab_pers = 100;
		
		
		Personne[] tab_pers = new Personne[cpt_max_tab_pers];
		
		/*Personne pers = new Personne();
		pers.surnom = "Kawaroro";
		pers.setNom("Schoenmaeker");
		pers.setPrenom("Benjamin");
		pers.afficherDetails();
		tab_pers[0] = pers;
		
		cpt_tab_pers++;
		
		Personne pers = new Personne("Roro", "Benjamin", "Schoenmaeker");
		cpt_tab_pers++;*/
		
		//public Personne(String surnom, String prenom, String nom) {
		//------------------//
		
		String pseudo = new String();
		String prenom = new String();
		String nom = new String();
		String flag = new String();
		
		
		do{
			//pers = new Personne();
			Personne pers = new Personne();
			
			System.out.println("Donnez une référence de langue : choix:fr/en/de/es/it ");
			flag = sc.nextLine();
			
			System.out.println("Donnez un pseudo : ");
			pseudo = sc.nextLine();
			
			System.out.println("Donnez un prénom : ");
			prenom = sc.nextLine();
			
			System.out.println("Donnez un nom : ");
			nom = sc.nextLine();
			
			pers.surnom = pseudo;
			pers.setPrenom(prenom);
			pers.setNom(nom);
			pers.compteur(cpt_tab_pers);
			
			pers.afficherInfoPersonne(flag);
			
			tab_pers[cpt_tab_pers] = pers;
			
			cpt_tab_pers++;
			
				        
		}while (cpt_tab_pers < cpt_max_tab_pers);
		
		sc.close();
		
		System.out.println("Récapitulatif--------------------------------------------------");
		System.out.println("Votre groupe est composé de :");
		for(int i=0; i < cpt_tab_pers ; i++) {
			//System.out.println("cpt_tab_pers->"+cpt_tab_pers);
			tab_pers[i].afficherInfoPersonne(tab_pers[i].getDom());
		}
		
	}

}
