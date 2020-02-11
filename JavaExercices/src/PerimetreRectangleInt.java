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
public class PerimetreRectangleInt {
	
	/**
	 * @param args
	 */
	// Exercice le périmétre d'un rectangle
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir une longeur au rectangle:");
		int ab = sc.nextInt();
		System.out.println("Vous avez saisi : "+ ab);
		
		System.out.println("Veuillez saisir une largeur au rectangle:");
		int bc = sc.nextInt();
		System.out.println("Vous avez saisi : "+ bc);
		sc.close();
		
		//int ab = Integer.parseInt(longeurRectangle);
		//int bc = Integer.parseInt(largeurRectangle);
		
		int perRec = 0;
		
		//int ab = 10;
		//int bc = 3;
		
		//int cd = 0;
		//int da = 0;
		
		perRec = (ab + bc)* 2;
		
		System.out.println("Le périmétre du rectangle est : "+ perRec);
		
	}
	
}
