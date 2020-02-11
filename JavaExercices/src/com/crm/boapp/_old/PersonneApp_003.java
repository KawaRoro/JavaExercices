package com.crm.boapp._old;

import java.util.Scanner;

import com.crm.bo.Personne;
// class vector
public class PersonneApp_003 {

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
		
		cpt_tab_pers++;*/
		
		//------------------//
		
		String pseudo = new String();
		String prenom = new String();
		String nom = new String();
		
		
		do{
			//pers = new Personne();
			Personne pers = new Personne();
			
			System.out.println("Donnez un pseudo : ");
			pseudo = sc.nextLine();
			
			System.out.println("Donnez un prénom : ");
			prenom = sc.nextLine();
			
			System.out.println("Donnez un nom : ");
			nom = sc.nextLine();
			
			pers.surnom = pseudo;
			pers.setPrenom(prenom);
			pers.setNom(nom);
			
			pers.afficherInfoPersonne();
			
			tab_pers[cpt_tab_pers] = pers;
			
			cpt_tab_pers++;
			
			/* do{
				    System.out.println("Voulez-vous réessayer ? (O/N)");
				    reponse = sc.nextLine().charAt(0);
				    
			}while(reponse != 'O' && reponse != 'N' && reponse != 'o' && reponse != 'n');*/
				        
		}while (cpt_tab_pers < cpt_max_tab_pers);
		
		sc.close();
		
		for(int i=0; i < cpt_tab_pers ; i++) {
			//System.out.println("cpt_tab_pers->"+cpt_tab_pers);
			tab_pers[i].afficherInfoPersonne();
		}
		
	}

}
