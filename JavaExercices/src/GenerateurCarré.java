import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class GenerateurCarré {
	
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
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
	}
	
}
