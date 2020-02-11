package com.crm.formation;

//import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class ForTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO
		
		/*for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		//------------------//
		
		for(int i = 0, j = 10; i < 10; i++, j--) {
			System.out.println("i = "+ i);
			System.out.println("j = "+ j);
		}
		
		//------------------//
		
		for(int i = 0; i < 10; i++) {
			if(i == 2) {
				System.out.println("Compteur à deux.");
				break;
			}
			System.out.println(i);
		}
		
		//------------------//
		
		for(int i = 0; i < 10; i++) {
			if(i == 2) {
				System.out.println("Compteur à deux.");
				continue;
			}
			System.out.println(i);
		}
		
		//------------------//
		
		for(int i = 0; i < 10; i++) {
			if(i == 8) {
				System.out.println("Compteur à huit.");
				return;
			}
			System.out.println(i);
		}*/
		
		//loop();
		System.out.println(loop());
		
	}
	
	public static boolean loop() {
		int i;
		for(i = 0; i < 10; i++) {
			if(i == 8) {
				System.out.println("Compteur à huit.");
				return false;
			}
			System.out.println(i);
		}
		return true;
	}

}
