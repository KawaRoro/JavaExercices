package _old;
import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class LoginCRM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final String REF_LOGIN = "CRM";
		final String REF_MDP = "sdf";
		
		String login = new String();
		String mdp = new String();

		boolean open_login = false;
		boolean open_mdp = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre login :");
		login = sc.nextLine();
		System.out.println("Vous avez saisi : " + login);
		
		System.out.println("Entrer votre mdp :");
		mdp = sc.nextLine();
		System.out.println("Vous avez saisi : " + mdp);
		sc.close();
		
		// System.out.println(login.equalsIgnoreCase(ref_login));
		
		if( login.equalsIgnoreCase(REF_LOGIN) ) {
			//System.out.println("Login --> ok");
			open_login = true;
		} else {
			System.out.println("Le login n'est pas correct.");
		}
		
		if( mdp.equalsIgnoreCase(REF_MDP) ) {
			//System.out.println("mdp --> ok");
			open_mdp = true;
		} else {
			System.out.println("Le mot de passe n'est pas correct.");
		}
		
		if( open_login && open_mdp ) {
			System.out.println("Vous êtes identifié.");
		}
		
	}

}
