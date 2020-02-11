package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Rectangle;
// class vector
public class RectangleApp_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char reponse = ' ';
		
		int cpt_tab_rect = 0;
		int cpt_max_tab_rect = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez le nombre de rectangle à traiter : ");
		cpt_max_tab_rect = Integer.parseInt(sc.nextLine());
		//cpt_max_tab_rect = 100;
		
		
		Rectangle[] tab_rect = new Rectangle[cpt_max_tab_rect];
		
		/*Rectangle rect = new Rectangle();
		rect.setLongeur(20);
		rect.setLargeur(20);
		rect.afficherDetails();
		tab_rect[0] = rect;
		
		cpt_tab_rect++;*/
		
		//------------------//
		
		
		do{
			//rect = new Rectangle();
			Rectangle rect = new Rectangle();
			
			System.out.println("Donnez une longeur : ");
			rect.setLongeur(Integer.parseInt(sc.nextLine()));
			
			System.out.println("Donnez une largeur : ");
			rect.setLargeur(Integer.parseInt(sc.nextLine()));
			
			rect.afficherDetails();
			
			int perimetre = rect.calculPerimetre();
			//System.out.println("Le rectangle a un périmétre de : " + perimetre);
			rect.afficherInfoPerimetre("m²");
			
			int surface = rect.calculSurface();
			rect.afficherInfoSurface("m²");
			
			System.out.println("---------------------------------------------------------------");
			
			tab_rect[cpt_tab_rect] = rect;
			
			cpt_tab_rect++;
			
			/* do{
				    System.out.println("Voulez-vous réessayer ? (O/N)");
				    reponse = sc.nextLine().charAt(0);
				    
			}while(reponse != 'O' && reponse != 'N' && reponse != 'o' && reponse != 'n');*/
				        
		}while (cpt_tab_rect < cpt_max_tab_rect);
		
		sc.close();
		System.out.println("-----------------------Récapitulatif---------------------------");
		
		
		int somme_longeur = 0;
		int moyenne_longeur = 0;
		for(int i=0; i < cpt_tab_rect ; i++) {
			somme_longeur += tab_rect[i].getLongeur();
		}
		moyenne_longeur = somme_longeur/cpt_tab_rect;
		
		int somme_largeur = 0;
		int moyenne_largeur = 0;
		for(int i=0; i < cpt_tab_rect ; i++) {
			somme_largeur += tab_rect[i].getLargeur();
		}
		moyenne_largeur = somme_largeur/cpt_tab_rect;
		
		for(int i=0; i < cpt_tab_rect ; i++) {
			//tab_rect[i].afficherDetails();
			tab_rect[i].afficherComparaisonDetails(i, moyenne_longeur , moyenne_largeur);
		}
		
	}

}
