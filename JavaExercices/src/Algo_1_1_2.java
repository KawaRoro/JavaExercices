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
public class Algo_1_1_2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String nbr = new String();
		int moyenne = 0;
		int nbrInt = 0;
		int somme = 0;
		int count = 0;
		
		char reponse = ' ';
		
		Scanner sc = new Scanner(System.in);
		
		do{
		  System.out.println("Entrer votre nombre :");
		  nbr = sc.nextLine();
		  System.out.println("Vous avez saisi : " + nbr);
		  nbrInt = Integer.parseInt(nbr);
		  
		  somme = somme + nbrInt;
		  count ++;
		  
		  do{
		    System.out.println("Souhaitez vous faire un autre calcul ? (O/N)");
		    reponse = sc.nextLine().charAt(0);
		  }while(reponse != 'O' && reponse != 'N' && reponse != '0' && reponse != 'o' );
		   
		}while (reponse == 'O' || reponse == '0' || reponse == 'o');
		
		moyenne = somme / count;
		System.out.println("La moyenne de ces "+ count +" nombres est : " + moyenne);
		sc.close();
		
	}
	
}
