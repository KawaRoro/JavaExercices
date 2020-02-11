package com.crm.formation;

//import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class MethodeTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int resultat;
		resultat = somme(12, 8);
		System.out.println(resultat);
	}
	
	public static int somme(int a, int b) {
		int s;
		s = a + b;
		return s;
	}
	
}
