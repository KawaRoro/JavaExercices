import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class EvaluationNote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String nbrSaisi = new String();
		int nbrNote;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre nombre :");
		nbrSaisi = sc.nextLine();
		System.out.println("Vous avez saisi : " + nbrSaisi);
		nbrNote = Integer.parseInt(nbrSaisi);
		//System.out.println("Chaine saisi convertie en nombre : " + nbrInt);
		sc.close();
		
		// 
		if(nbrNote > 0 && nbrNote <= 9) {
			System.out.println("Vous devez passer le rattrapage.");
		} else if(nbrNote > 9 && nbrNote <= 13) {
			System.out.println("Vous êtes reçu.");
		} else if(nbrNote >= 14 && nbrNote <= 16) {
			System.out.println("Vous êtes reçu avec mention « bien »");
		} else if(nbrNote >= 16 && nbrNote <= 18) {
			System.out.println("Vous êtes reçu avec mention « assez bien »");
		} else if(nbrNote >= 18 && nbrNote <= 20) {
			System.out.println("Vous êtes reçu avec mention « très bien »");
		}else {
			System.out.println("Vous n'avez entré une note correcte !");
		}
		
	}

}
