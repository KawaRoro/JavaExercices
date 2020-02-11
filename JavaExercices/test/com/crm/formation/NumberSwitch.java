package com.crm.formation;

import java.util.Scanner;

//import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class NumberSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//int choixNbr = 37;
		//String choixNbr = "37";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un chiffre svp :");
		
		final String choixNbr = sc.nextLine();
		//final int choixNbr = sc.nextInt();
		
		if(choixNbr.length() > 1) {
			System.out.println("Attention vous devez saisir un chiffre ! ");
		}
		
		int num = Integer.parseInt(choixNbr);
		
		System.out.println("Vous avez saisi : " + num);
		sc.close();
		
		switch(num) {
			case 37:
				System.out.println("Café?");
				break;
			case 45:
				System.out.println("Chocolat");
				break;
			case 57:
				System.out.println("Thé?");
				break;
			default:
				System.out.println("???");
				break;
		}
		
		//------------------//
		
	}	

}
