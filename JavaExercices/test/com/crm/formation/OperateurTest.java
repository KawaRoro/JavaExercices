package com.crm.formation;

import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class OperateurTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maVariableInt1;
		int maVariableInt2;
		int maVariableInt3;
		maVariableInt1 = 11;
		
		System.out.println(maVariableInt1);
		maVariableInt3 = maVariableInt2 = maVariableInt1;
		
		System.out.println(maVariableInt1);
		System.out.println(maVariableInt2);
		System.out.println(maVariableInt3);
		
		System.out.println("----------------");
		
		int somme1;
		int somme2;
		int somme3;
		
		// Addition
		somme1 = 5 + 6;
		System.out.println("Addition --> " + somme1);
		
		somme2 = somme1 + 7;
		System.out.println(somme2);
		
		System.out.println("----------------");
		
		// Soustraction
		somme3 = somme1 - somme2;
		System.out.println("Soustraction --> " + somme3);
		
		System.out.println("----------------");
		
		// Multiplication
		somme3 = somme1 * somme2;
		System.out.println("Multiplication --> " + somme3);
		
		System.out.println("----------------");
		
		// Division
		somme3 = 5 / 2;//somme1 / somme2;
		System.out.println("Division --> " + somme3);
		
		float quotient1 = 5f / 2f;
		System.out.println("Division --> " + quotient1);
		
		System.out.println("----------------");
		
		// Modulo
		int modulo;
		modulo = 5 % 2;
		System.out.println("Modulo --> " + modulo);
		
		System.out.println("----------------");
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot:");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : "+ str);
		sc.close();
		*/
	}

}
