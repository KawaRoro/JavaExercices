package com.crm.boapp._old;

import com.crm.bo.Personne;

public class PersonneApp_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne pers = new Personne();
		pers.surnom = "Kawaroro";
		pers.setNom("Schoenmaeker");
		pers.setPrenom("Benjamin");
		
		System.out.println(pers.surnom);
		System.out.println(pers.getPrenom());
		System.out.println(pers.getNom());
		
	}

}
