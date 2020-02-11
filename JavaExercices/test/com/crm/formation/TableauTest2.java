package com.crm.formation;
/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class TableauTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Déclaration de tableau
		int[] tabInt1 = new int[5]; // Version 1
		System.out.println(tabInt1[0]);
		int tabInt2[] = new int[5]; // Version 2
		
		System.out.println("/---------------------/");
		
		// Initialiser un tableau
		int[] tabInt3 = {0, 1, 2, 3};
		// Accéder aux éléments d'un tableau
		for(int i = 0; i < 4 ; i++ ) {
			System.out.println(tabInt3[i]);
		}
		
		System.out.println("/---------------------/");
		
		// Modifier la valeur d'un élément du tableau
		tabInt3[0] = 10;
		int premierElement = tabInt3[0];
		System.out.println(tabInt3[0]);
		
		System.out.println("/---------------------/");
		
		// Afficher la taille du tableau 
		int tailleTableau = tabInt3.length;
		System.out.println("tailleTableau --> " + tailleTableau);
		
		System.out.println("/---------------------/");
		
		// Accéder aux éléments d'un tableau String
		String[] tabInt4 = {"0", "1", "2", "3"};
		for(int i = 0; i < tabInt4.length ; i++ ) {
			System.out.println(tabInt4[i]);
		}
		
		System.out.println("/---------------------/");
		
		for(String nb : tabInt4) {
			System.out.println(nb);
		}
		
	}

}
