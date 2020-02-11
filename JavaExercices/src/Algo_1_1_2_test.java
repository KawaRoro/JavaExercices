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
public class Algo_1_1_2_test {
	
	/**
	 * @param args
	 */
	// Exercice le périmétre d'un rectangle
	public static void main(String[] args) {
		
		int nbr;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		while (reponse == 'O')
		{
		  System.out.println("Entrer votre nombre: ");
		  nbr = sc.nextInt();
		  System.out.println("Vous avez saisi : " +nbr);                        
		  
		  reponse = ' ';
		  
		  while(reponse != 'O' && reponse != 'N')
		  {
		    System.out.println("Souhaitez vous faire un autre calcul ? (O/N)");
		    reponse = sc.nextLine().charAt(0);
		  }
		}
		System.out.println("Au revoir…");
		sc.close();
	}
	
}
