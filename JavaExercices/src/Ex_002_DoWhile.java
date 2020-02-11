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
public class Ex_002_DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ce programme calcul la factorielle de l'entier N
		System.out.println("-Ce programme calcul la factorielle de l'entier N-");
		
		int n = 0;
		int resultat = 1;
		int cpt = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre nombre corresondant à N = ");
		cpt = sc.nextInt();
		System.out.println("Vous avez saisi le nombre: "+cpt);
		n = cpt;
		sc.close();
		
		if( n == 0 || n == 1) {
			System.out.println("La factorielle de n avec tant que est : "+ resultat );
		}else {
			do {
				resultat = resultat * cpt;
				cpt--;
				//System.out.println("resultat = "+ resultat);
			} while(cpt >= 1 );
		}
		
		System.out.println("Le résultat avec répéter est : "+ resultat);
		//------------------//
		
	}	

}
