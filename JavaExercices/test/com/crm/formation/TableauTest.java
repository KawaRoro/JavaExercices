package com.crm.formation;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class TableauTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Méthode 1 de déclaration d'un tableau
		/*int[] tabInt;
		tabInt = new int[5];
		System.out.println(tabInt[0]);
		
		//------------------//
		
		// Méthode 2 de déclaration d'un tableau
		int[] tabInt1 = new int[5];
		System.out.println(tabInt1[0]);
		
		tabInt1[0] = 5;
		System.out.println(tabInt1[0]);
		System.out.println(tabInt1[1]);*/
		
		//------------------//
		
		// Méthode 3 de déclaration d'un tableau
		int tabInt2[] = {1,2,3,4,5};
		//System.out.println(tabInt2[4]);
		
		int i;
		for(i = 0; i < 5; i++) {
			System.out.println("tabInt2[" + i + "] --> " + tabInt2[i]);
		}
	}

}
