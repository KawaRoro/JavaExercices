package com.crm.formation;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class Affichage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		
		System.out.println("Comment �a va ?");
		
		// Variables interdites -> nombres / espaces et mots cl�s interdits
		
		// Types primitifs :
		// Les entiers
		byte maVariableByte_1 = 25;
		System.out.println(maVariableByte_1);
		short maVariableShort_1 = 2568;
		System.out.println(maVariableShort_1);
		int maVariableInt_1 = 258;
		System.out.println(maVariableInt_1);
		long  maVariableLong_1 = 258L; 
		System.out.println(maVariableLong_1);
		
		// Les nombres � virgules
		float maVariableFLoat_1 = 2.5F;
		System.out.println(maVariableFLoat_1);
		double maVariableDouble_1 = 22.3642157;
		System.out.println(maVariableDouble_1);
		
		// Les chaines de caract�res
		char maVariableChar_1 = 'C'; // caract�re
		char maVariableChar_2 = '\u0059'; // caract�re unicode
		System.out.println(maVariableChar_1);
		System.out.println(maVariableChar_2);
		
		String maVariableString_1 = "Ma chaine de caract�re..."; // Chaine de caract�re
		String maVariableString_2 = " avec toto";
		String maVariableString_3 =  maVariableString_1 +  maVariableString_2;
		System.out.println(maVariableString_3);
		
		// Les booleens
		boolean maVariableBoolean_1 = true; // or false;
		System.out.println(maVariableBoolean_1);
		
		
		
	}

}
