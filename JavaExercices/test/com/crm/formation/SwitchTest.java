package com.crm.formation;

//import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class SwitchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO
		int choixNbr = 37;
		
		switch(choixNbr) {
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
