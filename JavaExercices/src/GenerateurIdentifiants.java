import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class GenerateurIdentifiants {
	
	public static void main(String[] args) {
		
		String prenom = new String();
		String nom = new String();
		String login = new String();
		String mdp = new String();
		char premierCaractere;
		int nomCount;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer votre prénom : ");
		prenom = sc.nextLine();
		
		premierCaractere = prenom.charAt(0); // returns b
		
		//System.out.println(prenom); // debug
		//System.out.println(premierCaractere); // debug
		
		System.out.println("Entrer votre nom : ");
		nom = sc.nextLine();
		//System.out.println(nom);
		
		nomCount = nom.length();
		mdp = nom.replaceAll("a", "@");
		mdp = mdp.toLowerCase();
		
		login = premierCaractere +"."+ nom;
		
		System.out.println("Votre login sera : " + login);
		
		
		System.out.println("Votre mot de passe sera : " + mdp  + nomCount);
		
		sc.close();
	}
	
}
