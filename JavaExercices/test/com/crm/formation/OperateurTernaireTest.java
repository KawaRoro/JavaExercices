package com.crm.formation;

import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class OperateurTernaireTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb1 = 2;
		int nb2 = 3;
		
		//boolean estVrai = true;
		
		boolean estVrai = nb1 > nb2 ? true : false;
		//System.out.println(estVrai);
		
		//------------------//
		
		String nbrSaisi = new String();
		int nbrAge;
		
		System.out.println("Bienvenu � la SNCF pour b�n�ficier de tarifs avantageux veuillez suivre l'�tape suivante.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre �ge :");
		nbrSaisi = sc.nextLine();
		System.out.println("Vous avez saisi : " + nbrSaisi);
		nbrAge = Integer.parseInt(nbrSaisi);
		//System.out.println("Chaine saisi convertie en nombre : " + nbrAge);
		sc.close();
		
		//------------------//
		
		// M�thode imbriqu�e
		if(nbrAge > 0 && nbrAge <= 25) {
			System.out.println("Vous avez droit � une r�duction de 50%.");
		} else if(nbrAge > 25 && nbrAge <= 50) {
			System.out.println("Vous n'avez droit � aucune r�duction.");
		} else if(nbrAge >= 50 && nbrAge <= 120) {
			System.out.println("Vous avez droit � une r�duction de 30%.");
		} else {
			System.out.println("Vous n'avez entr� un �ge correct !");
		}
		
		//------------------//
		
		// M�thode simplifi�e
		boolean trancheAge1 = nbrAge <= 25 ? true : false;
		boolean trancheAge2 = (nbrAge > 25 && nbrAge <= 50) ? true : false;
		boolean trancheAge3 = (nbrAge >= 50 && nbrAge <= 120) ? true : false;
		
		 
		if (trancheAge1)
			System.out.println("Vous avez droit � une r�duction de 50%.");
		else
			if (trancheAge2)
				System.out.println("Vous n'avez droit � aucune r�duction.");
			else
				if (trancheAge3)
					System.out.println("Vous avez droit � une r�duction de 30%.");
				else
					System.out.println("Vous n'avez entr� un �ge correct !");
		
		//------------------//
		
	}	

}
