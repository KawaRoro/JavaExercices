package com.crm.formation;

import java.util.Scanner;

//import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class Devinnette {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choixNbr = 0;
		int nombreAleatoire = (int)(Math.random() * ((100) + 1));
		char reponse = ' ';
		int cptEssai = 1;
		
		// Debug
		//System.out.println("nombreAleatoire --> "+ nombreAleatoire);
		
		do{
			System.out.println("Entrez un nombre compris entre 0 et 100 :");
			
			choixNbr = sc.nextInt();
			
			if(nombreAleatoire == choixNbr) {
				if(cptEssai == 1) {
					System.out.println("Gagné ! Vous avez trouvé du premier coup !" );
				} else {
					System.out.println("Gagné ! Vous l'avez trouvé en "+ cptEssai +" coups !" );
				}
			}else {
				System.out.println("Vous avez saisi : " + choixNbr);
				if(nombreAleatoire > choixNbr) {
					System.out.println("C'est plus ! ");
				} else {
					System.out.println("C'est moins ! ");
				}
				cptEssai++;
			}
			
		} while (nombreAleatoire != choixNbr);
		
		sc.close();
		
		//------------------//
		
	}	

}
