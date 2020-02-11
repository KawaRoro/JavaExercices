package com.crm.boapp;

import java.util.Vector;

import com.crm.bo.Personne;

public class VectorApp {

	public static void main(String[] args) {
		Vector<Personne> groupe = new Vector();
		
		Personne michael = new Personne("micky", "Michael", "Jordan");
		Personne lebron = new Personne("The king", "Lebron", "James");
		
		groupe.addElement(michael);
		groupe.addElement(lebron);
		
		Personne unBasketteur1 = (Personne) groupe.get(0);
		System.out.println(unBasketteur1.getNom());
		
		System.out.println("Mon équipe a "+ groupe.size() + " joueurs");
		
		Personne kobe = new Personne("Kobe", "Kobe", "Bryan");
		groupe.addElement(kobe);
		
		System.out.println("Mon équipe a : " + groupe.size()+ " joueurs");
		
		System.out.println("Le joueur James est à la : " + (groupe.indexOf(lebron) + 1)+ " position");
		
		Personne lebronModif = (Personne)groupe.get(1);
		
		System.out.println("Le surnom du joueur James Lebron est : " + lebronModif.surnom );
	}

}
