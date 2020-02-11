/**
 * 
 */


import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class Ex_001_DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ce programme calcul la somme de N premiers nombres entiers
		System.out.println("-Ce programme calcul la somme de N premiers nombres entiers-");
		
		//int n = 0;
		int resultat = 0;
		int cpt = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre nombre: ");
		int n = sc.nextInt();
		sc.close();
		
		do {
			resultat += cpt;
			cpt++;
			//System.out.println("resultat = "+ resultat);
		} while(cpt < n);
		
		System.out.println("Le résultat avec répéter est : "+ resultat);
		//------------------//
		
	}	

}
