import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class NombrePair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String nbrSaisi = new String();
		int nbrInt;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre nombre :");
		nbrSaisi = sc.nextLine();
		System.out.println("Vous avez saisi : " + nbrSaisi);
		nbrInt = Integer.parseInt(nbrSaisi);
		//System.out.println("Chaine saisi convertie en nombre : " + nbrInt);
		sc.close();
		// 
		if(nbrInt % 2 == 0) {
			System.out.println("Ce nombre est 'Pair'");
		} else {
			System.out.println("Ce nombre est 'Impair'");
		}
		
	}

}
