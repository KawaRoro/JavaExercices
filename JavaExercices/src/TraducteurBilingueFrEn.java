/**
 * 
 */
import java.util.Scanner;
/**
 * @author CRM
 *
 */
public class TraducteurBilingueFrEn {	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclaration des variables et des constantes
		final String LANGUE_FR = "francais";
		final String LANGUE_EN = "anglais";
		Scanner sc = new Scanner(System.in);
		String langueOrigine = "";
		String jour = "";		// Construction du dictionnaire
		String[][] dico = { { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" },
				{ "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" } };		// Demander à l'utilisateur de saisir la langue d'origine et le mot à traduire
		System.out.println("Entrer la langue");
		langueOrigine = sc.nextLine();
		System.out.println("Entrer le jour à traduire");
		jour = sc.nextLine();		// Identification de la langue choisie
		if (langueOrigine.equalsIgnoreCase(LANGUE_FR)) {
			// FRANCAIS
			// Recherche de la correspondance dans le dictionnaire
			// Sous tableau des jours en français
			for (int i = 0; i < dico[0].length; i++) {
				if (jour.equalsIgnoreCase(dico[0][i])) {
					// Le mot existe dans le dictionnaire
					// Je peux utiliser l'indice i pour trouver le mot en anglais
					// dans le 2e sous tableau(liste des jours en anglais)
					System.out.println("La traduction est : " + dico[1][i]);
					break;
				}
			}		} else if (langueOrigine.equalsIgnoreCase(LANGUE_EN)) {
			// ANGLAIS
			// Recherche de la correspondance dans le dictionnaire
			// Sous tableau des jours en anglais
			for (int i = 0; i < dico[1].length; i++) {
				if (jour.equalsIgnoreCase(dico[1][i])) {
					// Le mot existe dans le dictionnaire
					// Je peux utiliser l'indice i pour trouver le mot en francais
					// dans le 1er sous tableau(liste des jours en francais)
					System.out.println("La traduction est : " + dico[0][i]);
					break;
				}
			}
		} else {
			// Langue inconnue
			System.out.println("Choix de langue incorrecte");
		}		// Fermeture du scanner
		sc.close();
	}}