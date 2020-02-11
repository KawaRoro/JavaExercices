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
public class DemandePrenom {
	
	/**
	 * @param args
	 */
	// Exercice demande de prénom
	public static void main(String[] args) {
		
		String prenom = new String();
		//Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
		char reponse = ' ';
		 
		Scanner sc = new Scanner(System.in);
		 
		do{
		  System.out.println("Donnez un prénom : ");
		  prenom = sc.nextLine();
		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
		       
		  do{
		    System.out.println("Voulez-vous réessayer ? (O/N)");
		    reponse = sc.nextLine().charAt(0);
		  }while(reponse != 'O' && reponse != 'N' && reponse != 'o' && reponse != 'n');
		        
		}while (reponse == 'O' || reponse == 'o');
		 
		System.out.println("Au revoir…");
		sc.close();
	}
	
}
