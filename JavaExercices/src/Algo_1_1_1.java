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
public class Algo_1_1_1 {
	
	/**
	 * @param args
	 */
	// Exercice le p�rim�tre d'un rectangle
	public static void main(String[] args) {
		
		//int x, y;
		int r�el;
		
		//boolean binaire = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre premier nombre:");
		int x = sc.nextInt();
		System.out.println("Vous avez saisi : "+ x);
		
		System.out.println("Entrer votre deuxi�me nombre:");
		int y = sc.nextInt();
		System.out.println("Vous avez saisi : "+ y);
		sc.close();
		
		r�el = (x + y)/2;
		
		System.out.println("La moyenne des deux nombres est : "+ r�el);
		
	}
	
}
