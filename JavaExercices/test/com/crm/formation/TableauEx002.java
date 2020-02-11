package com.crm.formation;

import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class TableauEx002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int longeurTableau;
		
		// Saisi grâce à la méthode scanner de la longeur d'un tableau
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez la longeur du tableau désiré : ");
		longeurTableau = sc.nextInt();
		
		int[] tableau = new int[longeurTableau];
		//int[] tableau = {1,2,3,4,5};
		
		// Remplissage du tableau grâce à la méthode scanner
		System.out.println("Donnez une série de "+ (longeurTableau+1) +" chiffres pour compléter votre tableau : ");
		
		for(int i = 0; i<longeurTableau; i++) {
			System.out.println("Donnez la valeur "+ i +" : ");
			tableau[i] = sc.nextInt();
		}
		
		afficherTableau(tableau);
		afficherSomme(tableau);
		
		sc.close();
	}
	
	public static void afficherTableau(int[] tabInt) {
		System.out.println("Affichage du tableau : ");
		for(int nb : tabInt) {
			System.out.println(nb);
		}
		System.out.println("---------------------");
	}
	
	public static void afficherSomme(int[] tabInt) {
		int somme = 0;
		for(int i = 0; i<tabInt.length; i++) {
			somme += tabInt[i];
		}
		System.out.println("La somme des valeurs est : "+ somme);
	}

}
