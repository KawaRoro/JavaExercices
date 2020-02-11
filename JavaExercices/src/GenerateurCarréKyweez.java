import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class GenerateurCarréKyweez {
	
	public static void main(String[] args) {
		
		int nbrColonne;
		int nbrLigne;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer la largeur du carré : ");
		nbrLigne = nbrColonne = sc.nextInt();
		
		//System.out.println("Entrer la longeur du carré : ");
		//nbrLigne = sc.nextInt();
		
		//System.out.println(nbrColonne); // debug
		//System.out.println(nbrLigne); // debug
		
		for(int i =0; i<nbrLigne; i++) {
			for(int e =0; e<nbrColonne; e++) {
				// Première colonne
				if( e == 0 && i==0 ) {
					System.out.print(" /");
				} else if( e == 0  && i == (nbrColonne-1)) {
					System.out.print(" \\");
				} else if( e == 0 ) {
					System.out.print(" |");
				// Première ligne
				} else if( e == (nbrColonne-1) && i==0 ) {
					System.out.print(" \\");
				} else if( e < (nbrColonne-1) && i==0 ) {
					System.out.print(" =");
				// Dernière colonne
				} else if( e == (nbrColonne-1) && i == (nbrColonne-1) ) {
					System.out.print(" /");
				} else if( e == (nbrColonne-1)  && i == (nbrColonne-1)) {
					System.out.print(" \\");
				} else if( e == (nbrColonne-1) ) {
					System.out.print(" |");
				// Dernère ligne
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
