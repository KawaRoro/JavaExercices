package com.crm.formation;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class Tableaux {
	
	/**
	 * @param args
	 */
	// Exercice numéro 1_1_1
	public static void main(String[] args) {
		
		//int i = 0, j=0;
		int premiersNombres[][] = {{0,2,4,6,8},{1,3,5,7,9}};
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(premiersNombres[j][i]);
			}
		}
		
		
	}
}
