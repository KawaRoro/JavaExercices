import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class LoginCRM_002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//final String REF_LOGIN = "root";
		//final String REF_MDP = "mdp";
		
		String[][] ref = { {"root","login","Ben","Benjamin"}, {"K25@ml","mdp","Ben","Benjamin"}, {"Administrateur","Utilisateur","Rédacteur","Lecteur"} };
		
		String login = new String();
		String mdp = new String();

		boolean open_login = false;
		boolean open_mdp = false;
		
		char reponse = ' ';
		
		int cpt_log = 0;
		
		Scanner sc = new Scanner(System.in);
		
		// Boucle de réitération de login / mdp
		do{
			if(cpt_log < 3) {
				System.out.println("Entrer votre login :");
				login = sc.nextLine();
				//System.out.println("Vous avez saisi : " + login);
				
				System.out.println("Entrer votre mdp :");
				mdp = sc.nextLine();
				//System.out.println("Vous avez saisi : " + mdp);
				
				if(login.equals("") || mdp.equals("")) {
					System.out.println("Les champs que vous avez rempli sont vides veuillez réessayer :");
					System.out.println("Entrer votre login :");
					login = sc.nextLine();
					//System.out.println("Vous avez saisi : " + login);
					
					System.out.println("Entrer votre mdp :");
					mdp = sc.nextLine();
					//System.out.println("Vous avez saisi : " + mdp);
				}
				
				// System.out.println(login.equalsIgnoreCase(ref_login));
				
				if( checkLogin(ref, login) ) { //if( login.equalsIgnoreCase(REF_LOGIN) ) {
					//System.out.println("Login --> ok");
					open_login = true;
				} else {
					System.out.println("Le login n'est pas correct.");
					cpt_log++;
					do{
					    System.out.println("Voulez-vous réessayer ? (O/N)");
					    reponse = sc.nextLine().charAt(0);
					}while(reponse != 'O' && reponse != 'N' && reponse != 'o');
				}
				
				if( checkMdp(ref, mdp, checkIdLogin(ref, login) ) ) { //if( mdp.equalsIgnoreCase(REF_MDP) ) {
					//System.out.println("mdp --> ok");
					open_mdp = true;
				} else {
					System.out.println("Le mot de passe n'est pas correct.");
					cpt_log++;
					do{
					    System.out.println("Voulez-vous réessayer ? (O/N)");
					    reponse = sc.nextLine().charAt(0);
					}while(reponse != 'O' && reponse != 'N' && reponse != 'o' );
				}
				
				if( open_login && open_mdp ) {
					cpt_log = 0;
					System.out.println("Vous êtes identifié en tant que : " + checkNiveau(ref, login) );
					reponse = ' ';
				}
			}else {
				System.out.println("Vous vous êtes identifié trois fois, vous avez été banni ! ");
				break;
			}
		} while ( (reponse == 'O' || reponse == 'o') && (cpt_log != 3));
		
		sc.close();
	}
	
	// Méthode qui retourne vrai ou faux pour le login
	public static boolean checkLogin(String[][] ref, String login) {
		int id_login = -1;
		
		int i = 0;
		for(int j = 0; j < ref[i].length ; j++ ) {
			String stringTemp = ref[i][j].toLowerCase();
			if(stringTemp.equals(login.toLowerCase())) { // .toUpperCase()
				id_login = j;
				//System.out.println("id_login ->"+id_login);
			}
		}
		
		if(id_login != -1) {
			return true;
		}else {
			return false;
		}
	}
	
	// Méthode qui retourne vrai ou faux pour le login
	public static int checkIdLogin(String[][] ref, String login) {
		int id_login = -1;
		
		int i = 0;
		for(int j = 0; j < ref[i].length ; j++ ) {
			String stringTemp = ref[i][j].toLowerCase();
			if(stringTemp.equals(login.toLowerCase())) { // .toUpperCase()
				id_login = j;
				//System.out.println("id_login ->"+id_login);
			}
		}
		
		return id_login;
	}
	
	// Méthode qui retourne vrai ou faux pour le mot de passe
	public static boolean checkMdp(String[][] ref, String mdp, int idLogin) {
		int id_mdp = -1;
		
		int i = 1;
		//for(int j = 0; j < ref[i].length ; j++ ) {
			String stringTemp = ref[i][idLogin].toLowerCase();
			if(stringTemp.equals(mdp.toLowerCase())) { // .toUpperCase()
				id_mdp = idLogin;
				//id_mdp = j;
				//System.out.println("id_mdp ->"+id_mdp);
			}
		//}
		
		if(id_mdp != -1) {
			return true;
		}else {
			return false;
		}
	}
	
	// Méthode qui retourne le niveau d'administration en fonction du login et mdp
	public static String checkNiveau(String[][] ref, String login) {
		String niveau = "";
		
		int i = 0;
		for(int j = 0; j < ref[i].length ; j++ ) {
			String stringTemp = ref[i][j].toLowerCase();
			if(stringTemp.equals(login.toLowerCase())) { // .toUpperCase()
				niveau = ref[2][j];
				//System.out.println("id_login ->"+id_login);
			}
		}
		
		return niveau;
	}
	
}
