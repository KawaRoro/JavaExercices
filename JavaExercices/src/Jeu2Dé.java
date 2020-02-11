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
public class Jeu2Dé {
	//public static int tabInt[] = new int[0];
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char reponse = ' ';
		int numberRandom = 0;
		int cptLaunched = 0;
		int cptPlayer = 1;
		int[] tabInt = new int[101];
		tabInt[0] = 0;
		tabInt[1] = 0;
		
		Scanner sc = new Scanner(System.in);
		//------------------//
		System.out.println("Deux joueurs s'affrontent dans une partie de dés : ");
		System.out.println("Le joueur 1 commence avec 3 lancés : ");
		
		do{
			cptLaunched++;
			
			System.out.println("----------------------");
			System.out.println("Joueur "+ cptPlayer +" --> Lancé "+ cptLaunched + " : ");
			
			numberRandom = (int)((Math.random() * 6) +1 );

			tabInt[cptPlayer] = tabInt[cptPlayer] + numberRandom;
			
			System.out.println(numberRandom);
			
			if(numberRandom == 6) {
				System.out.println("Bravo vous avez fait un 6 ! Vous bénéficiez d'une relance : ");
				System.out.println("----------------------");
				System.out.println("Joueur "+ cptPlayer +" --> Lancé "+ cptLaunched + " : ");
				
				numberRandom = (int)((Math.random() * 6) +1 );
				tabInt[cptPlayer] = tabInt[cptPlayer] + numberRandom;
				
				System.out.println(numberRandom);
			}
			System.out.println("----------------------");
			System.out.println("Score " + tabInt[cptPlayer]);
			System.out.println("----------------------");
			
			do{
				if(cptLaunched < 3) {
					System.out.println("Prochain lancé ? (O/N)");
					reponse = sc.nextLine().charAt(0);
				}else {
					cptLaunched = 0;
					if(cptPlayer == 1) {
						cptPlayer = 2;
					}else {
						cptPlayer = 1;
					}
					System.out.println("C'est au tour du joueur "+cptPlayer+" avec 3 lancés : ");
				}
			} while(reponse != 'O' && reponse != 'N' && reponse != '0' && reponse != 'o' );
			
		} while (reponse == 'O' || reponse == '0' || reponse == 'o');
		
		sc.close();
	}
	
}
