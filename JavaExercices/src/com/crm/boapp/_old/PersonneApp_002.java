package com.crm.boapp._old;

import java.util.Scanner;

import com.crm.bo.Personne;

public class PersonneApp_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne pers = new Personne();
		pers.surnom = "Kawaroro";
		pers.setNom("Schoenmaeker");
		pers.setPrenom("Benjamin");
		
		pers.afficherDetails();
		
		//------------------//
		
		String pseudo = new String();
		String prenom = new String();
		String nom = new String();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez un pseudo : ");
		pseudo = sc.nextLine();
		
		System.out.println("Donnez un prénom : ");
		prenom = sc.nextLine();
		
		System.out.println("Donnez un nom : ");
		nom = sc.nextLine();
		
		pers.surnom = pseudo;
		pers.setPrenom(prenom);
		pers.setNom(nom);
		
		pers.afficherDetails();
		
		/*System.out.println(pers.surnom);
		System.out.println(pers.getPrenom());
		System.out.println(pers.getNom());*/
	}

}
