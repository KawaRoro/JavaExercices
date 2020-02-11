package com.crm.formation;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class ConversionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Variables interdites -> nombres / espaces et mots clés interdits
		
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
		
		// Les nombres à virgules
		float maVariableFLoat_1 = 2.5F;
		System.out.println(maVariableFLoat_1);
		double maVariableDouble_1 = 22.3642157;
		System.out.println(maVariableDouble_1);
		
		// Les chaines de caractères
		char maVariableChar_1 = 'C'; // caractère
		char maVariableChar_2 = '\u0059'; // caractère unicode
		System.out.println(maVariableChar_1);
		System.out.println(maVariableChar_2);
		
		String maVariableString_1 = "Ma chaine de caractère..."; // Chaine de caractère
		String maVariableString_2 = " avec toto";
		String maVariableString_3 =  maVariableString_1 +  maVariableString_2;
		System.out.println(maVariableString_3);
		
		// Les booleens
		boolean maVariableBoolean_1 = true; // or false;
		System.out.println(maVariableBoolean_1);
		
		// Conversion Implicite
		int maVariableInt_2 = 123456;
		long  maVariableLong_2 = maVariableInt_2;
		System.out.println(maVariableInt_2);
		System.out.println(maVariableLong_2);
		
		//System.out.println(Integer.valueOf(maVariableInt_2));
		
		int maVariableInt_3 = 65537;
		short z = (short)maVariableInt_3;
		System.out.println(maVariableInt_3);
		
		long L1 = 123456789;
		long L2 = 123456788;
		
		float f1 = L1;
		float f2 = L2;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(L1-L2);
		System.out.println(f1-f2);
		
		int nb1 = 2;
		int nb2 = nb1++;
		
		System.out.println(nb1);
		System.out.println(nb2);
		
		int var1 = 7, var2 = 13;
		boolean res = true;
		
		/*res = (var1 != var2); // Resultat est faux
		System.out.println(res);
		res = (var2 >= var1); // Resultat est vrai
		System.out.println(res);*/
		
		boolean bool1 = 1 > 2;
		boolean bool2 = 6==6;
		boolean bool3 = bool1 || bool2;
		System.out.println(bool3);
		
		double total=0, num = 1;
		double pourcentage = 0.50;
		
		total = total + num; // total vaut 1
		System.out.println(total);
		total += num; // total vaut 2
		System.out.println(total);
		total -= num; // total vaut 1
		System.out.println(total);
		total *= pourcentage; // total vaut 0.5
		System.out.println(total);
		total /= 2; // total vaut 0.25
		System.out.println(total);
		pourcentage = 12;
		System.out.println("----------------------");
		num %= pourcentage; // num vaut 0
		System.out.println(num);
		
	}

}
