import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class GenerateurCarr�Kyweez {
	
	public static void main(String[] args) {
		
		int nbrColonne;
		int nbrLigne;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer la largeur du carr� : ");
		nbrLigne = nbrColonne = sc.nextInt();
		
		//System.out.println("Entrer la longeur du carr� : ");
		//nbrLigne = sc.nextInt();
		
		//System.out.println(nbrColonne); // debug
		//System.out.println(nbrLigne); // debug
		
		for(int i =0; i<nbrLigne; i++) {
			for(int e =0; e<nbrColonne; e++) {
				// Premi�re colonne
				if( e == 0 && i==0 ) {
					System.out.print(" /");
				} else if( e == 0  && i == (nbrColonne-1)) {
					System.out.print(" \\");
				} else if( e == 0 ) {
					System.out.print(" |");
				// Premi�re ligne
				} else if( e == (nbrColonne-1) && i==0 ) {
					System.out.print(" \\");
				} else if( e < (nbrColonne-1) && i==0 ) {
					System.out.print(" =");
				// Derni�re colonne
				} else if( e == (nbrColonne-1) && i == (nbrColonne-1) ) {
					System.out.print(" /");
				} else if( e == (nbrColonne-1)  && i == (nbrColonne-1)) {
					System.out.print(" \\");
				} else if( e == (nbrColonne-1) ) {
					System.out.print(" |");
				// Dern�re ligne
				} else if( e < (nbrColonne-1) && i == (nbrLigne-1) ) {
					System.out.print(" =");
				}else {
					System.out.print(" *");
				}
			}
			System.out.println("");
		}
		
		sc.close();
	}
	
}
