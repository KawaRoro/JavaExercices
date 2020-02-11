package com.crm.formation;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class VariablesLocales {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		System.out.println("byte max value :");
		byte nombreEntier = 127; // 1 octet
		System.out.println(nombreEntier);
		
		System.out.println("short max value :");
		short onduleur = -32768; // 2 octets
		System.out.println(onduleur);
		
		System.out.println("int max value :");
		int quantite = 3; // 4 octets
		System.out.println(quantite);
		
		System.out.println("long max value :");
		long entierLong = 9223372036854775807L; // 8 octets // Rajouter L quand c'est par défaut un entier
		//long entierLong = Long.MAX_VALUE;
		System.out.println(entierLong);
		
		System.out.println("float max value :");
		float prix = 3.50F; // 4 octets // Rajouter F quand c'est par défaut un nombre décimal
		System.out.println(prix);
		
		System.out.println("double max value :");
		double nombreDouble = Double.MAX_VALUE; // 8 octets
		System.out.println(nombreDouble);
		
		System.out.println("char max value :");
		char nombreChar = 'a'; // 8 octets // ou '\u039A'
		System.out.println(nombreChar);
		
		System.out.println("boolean max value :");
		boolean nombreBoolean = true;
		System.out.println(nombreBoolean);
		
	}
}
