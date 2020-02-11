package com.crm.formation;

import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longeur = 0;
		
		String texte = "Bonjour";
		System.out.println(texte);
		
		texte = "Hello";
		System.out.println(texte);
		
		texte = texte.toUpperCase();
		System.out.println(texte);
		
		longeur = texte.length();
		System.out.println(longeur);
		
		System.out.println(texte + " " + texte.charAt(longeur-2));
		
		// Longeur d'une chaine
		String str1 = " Java c'est génial !!! ";
		//str.length();
		System.out.println(str1.length());
		
		// Convertir en lettres majuscules
		String str2 = str1;
		System.out.println(str2.toUpperCase());
		
		// Supprimer les espace au début et à la fin de la chaine
		String str3 = str2.trim();
		System.out.println(str3);
		
		// Supprimer tous les espaces
		String test = str3.replaceAll(" ", "");
		System.out.println(test);
		
		// Extraction d'une sous chaine
		String str5 = str1.substring(0,4);
		System.out.println(str5);
		
		//Scanner sc = new Scanner(System.in);
		//sc.hasNext();
		
		//Math.addExact(x, y)
		String chaine1 = "test";
		String chaine2 = "TeSt";
		System.out.println(chaine1.contentEquals(chaine2));
		System.out.println(chaine1.equals(chaine2));
		System.out.println(chaine1.equalsIgnoreCase(chaine2));
		
	}

}
