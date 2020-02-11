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
public class Ex_001_For {

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
		
		for(cpt = 1; cpt <= n; cpt++) {
			resultat = resultat + cpt;
			//System.out.println("resultat = "+ resultat);
		}
		
		System.out.println("Le résultat avec pour est : "+ resultat);
		//------------------//
		
	}	

}
