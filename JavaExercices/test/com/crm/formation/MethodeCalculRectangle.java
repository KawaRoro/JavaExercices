package com.crm.formation;

import java.util.Scanner;

//import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class MethodeCalculRectangle {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int nombre1 = 18;
		int nombre2 = 12;
		
		// Calcul rectangle
		int resultat;
		resultat = calculRectangle(nombre1, nombre2);
		System.out.println("Le périmétre du rectangle est : " + resultat);
		
		// Calcul somme
		System.out.println("La somme des deux valeurs : " + calculSomme(nombre1, nombre2));
		
		
		
	}
	
	public static int calculRectangle(int ab, int bc) {
		
		int perRec = 0;
		
		perRec = (ab + bc)* 2;
		
		//System.out.println("Le périmétre du rectangle est : "+ perRec);
		return perRec;
	}
	
	public static int calculSomme(int nombre1, int nombre2) {
		//int nombre1 = 18; // Champ de formulaire à créer
		//int nombre2 = 12;
		int somme = 0;
		//int moyenne = 0;
		
		if(nombre1 >= 0) {
			somme = nombre1 + nombre2;
			//System.out.println("somme --> "+somme);
			//moyenne = (nombre1 + nombre2)/2;
			//System.out.println("moyenne --> "+moyenne);
		}
		return somme;
	}
	
}
