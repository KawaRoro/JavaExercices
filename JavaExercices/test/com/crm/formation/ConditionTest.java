package com.crm.formation;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class ConditionTest {
	public static void main(String[] args) {
		
		/*boolean estVrai = true;
		
		System.out.println("début de programme");
		if(estVrai == true) {
			System.out.println("yes");
		} else {
			System.out.println("false");
		}
		System.out.println("fin de programme");
		
		System.out.println("début de programme");
		if(estVrai == true) System.out.println("yes");
		System.out.println("fin de programme");*/
		
		int nb = 3;
		String chaine = "OK";
		
		if(nb > 10 && chaine.equals("OK")) {
			System.out.println("Condition remplie");
		} else if (nb > 10 || chaine.equals("ok")){
			System.out.println("Une des 2 conditions est remplie");
		}
		
	}
}
