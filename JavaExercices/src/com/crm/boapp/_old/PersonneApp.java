package com.crm.boapp._old;
import com.crm.bo.Personne;

/**
 * @author CRM
 *
 */
public class PersonneApp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclaration des variables
		Personne pers = new Personne();
		pers.surnom = "Joe";
		pers.setNom("Schoenmaeker");
		
		System.out.println("Bienvenue "+ pers.getNom() + " ("+ pers.surnom+ ")" );
		
		Personne pers2 = new Personne();
		pers2.afficherDetails();
		
		Personne pers3 = new Personne("Boby", "Bob", "Dylan");
		pers3.afficherDetails();
		
	}
}
