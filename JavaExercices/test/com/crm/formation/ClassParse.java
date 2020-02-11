package com.crm.formation;

//import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class ClassParse {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		String nbrSaisi = new String();
		int nbrInt;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre nombre :");
		nbrSaisi = sc.nextLine();
		System.out.println("Vous avez saisi : " + nbrSaisi);
		nbrInt = Integer.parseInt(nbrSaisi);
		System.out.println("Chaine saisi convertie en nombre : " + nbrInt);
		
		//------------------//
		
		int i = Integer.parseInt("123");
		System.out.println(i);
		
		float f = Float.parseFloat("123.1f");
		System.out.println(f);
		
		//double j = Double.parseDouble(Math.PI);
		//System.out.println(j);
		
		//------------------//
		
		sc.close();
	}
	
}
