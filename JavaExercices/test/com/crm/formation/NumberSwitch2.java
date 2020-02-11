package com.crm.formation;

import java.util.Scanner;

//import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class NumberSwitch2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String choixNbr = "";
		char reponse = ' ';
		
		do{
			System.out.println("Choisissez une formation qualifiante parmi les propositions suivantes :"); // (C) : CDA
			System.out.println("(C) : CDA");
			System.out.println("(D) : DWWM");
			System.out.println("(R) : Réorientation");
			System.out.println("(E) : En cours de réflexion");
			
			choixNbr = sc.nextLine();
			
			System.out.println("Vous avez saisi : " + choixNbr);
			
			
			switch(choixNbr) {
				case "C":
					System.out.println("Vous avez choisi de suivre la formation Concepteur Développeur d'Applications");
					reponse = 'n';
					break;
				case "D":
					System.out.println("Vous avez choisi de suivre la formation Developpeur Web et Web Mobile");
					reponse = 'n';
					break;
				case "R":
					System.out.println("Vous avez choisi de suivre la réorientation");
					reponse = 'n';
					break;
				case "E":
					System.out.println("Vous avez choisi d'être en cours de réflexion");
					reponse = 'n';
					break;
				default:
					do{
						System.out.println("Votre réponse est incorrecte, voulez vous réessayer ? (o/n)");
						reponse = sc.nextLine().charAt(0);
					} while(reponse != 'O' && reponse != 'N' && reponse != '0' && reponse != 'o' );
					break;
			}
		} while (reponse == 'O' || reponse == '0' || reponse == 'o');
		
		sc.close();
		
		//------------------//
		
	}	

}
