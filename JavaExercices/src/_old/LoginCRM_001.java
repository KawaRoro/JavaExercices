package _old;
import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class LoginCRM_001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final String REF_LOGIN = "root";
		final String REF_MDP = "mdp";
		
		String login = new String();
		String mdp = new String();

		boolean open_login = false;
		boolean open_mdp = false;
		
		char reponse = ' ';
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Entrer votre login :");
			login = sc.nextLine();
			//System.out.println("Vous avez saisi : " + login);
			
			System.out.println("Entrer votre mdp :");
			mdp = sc.nextLine();
			//System.out.println("Vous avez saisi : " + mdp);
		
			
			// System.out.println(login.equalsIgnoreCase(ref_login));
			
			if( login.equalsIgnoreCase(REF_LOGIN) ) {
				//System.out.println("Login --> ok");
				open_login = true;
			} else {
				System.out.println("Le login n'est pas correct.");
				do{
				    System.out.println("Voulez-vous réessayer ? (O/N)");
				    reponse = sc.nextLine().charAt(0);
				}while(reponse != 'O' && reponse != 'N' && reponse != 'o');
			}
			
			if( mdp.equalsIgnoreCase(REF_MDP) ) {
				//System.out.println("mdp --> ok");
				open_mdp = true;
			} else {
				System.out.println("Le mot de passe n'est pas correct.");
				do{
				    System.out.println("Voulez-vous réessayer ? (O/N)");
				    reponse = sc.nextLine().charAt(0);
				}while(reponse != 'O' && reponse != 'N' && reponse != 'o' );
			}
			
			if( open_login && open_mdp ) {
				System.out.println("Vous êtes identifié.");
				reponse = ' ';
			}
		} while (reponse == 'O' || reponse == 'o');
		
		sc.close();
	}

}
