package com.crm.formation;

import java.util.Arrays;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class TableauEx005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] tableauPrenom1 = {"toto", "tata", "titi", "riri", "fifi", "loulou"};
		String[] tableauPrenom2 = {"toto", "tata", "titi", "riri", "fifi", "loulou"};
		
		if(tableauPrenom1[0].equals(tableauPrenom2[0])) {
			System.out.println("ça match ! ");
		}
		if(tableauPrenom1[0] == tableauPrenom2[0]) {
			System.out.println("ça match également ! ");
		}

	}

}
