package com.crm.formation;

//import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class InstructionReturnTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO
		int nombre = 10;
		afficherListeNombre(nombre);
		System.out.println("L'éxecution continue");
	}
	
	public static void afficherListeNombre(int nb) {
		System.out.println("début afficher Liste Nombre");
		
		for(int i=0;i<nb;i++) {
			if(i==5) {
				return;//return;
			}
			System.out.println(i);
		}
		
		System.out.println("fin afficher Liste Nombre");
	}
	
}
