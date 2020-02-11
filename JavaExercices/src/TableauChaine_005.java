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
public class TableauChaine_005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int id_langue = 0;
		int id_jour = 0;
		
		//------------------//
		String[] tabFlag = {"fr", "en", "de", "es", "it"};
		String[] tabLanguage = {"Français", "Anglais", "Allemand", "Espagnol", "Italien"};
		String[][] tabTrad = {
								{"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"},
								{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Synday"},
								{"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"},
								{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"}, 
								{"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"} 
							};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle est la langue source ? choix:fr/en/de/es/it");
		String langue = sc.nextLine();
		//System.out.println("langue ->"+langue);
		
		// Première boucle pour trouver l'identifiant de la langue
		for(int i = 0; i < tabFlag.length ; i++ ) {
			String stringTemp = tabFlag[i].toLowerCase();
			if(stringTemp.contains(langue.toLowerCase())) { // .toUpperCase()
				id_langue = i;
				//System.out.println("id_langue ->"+id_langue);
			}
		}
		
		System.out.println("Donnez un jour de la semaine pour obtenir sa traduction : ");
		String jour = sc.nextLine();
		//System.out.println("jour ->"+jour);
		
		// Deuxième boucle pour trouver l'identifiant du jour de la semaine
		for(int i = 0; i < tabTrad.length ; i++ ) {
			for(int j = 0; j < tabTrad[i].length ; j++ ) {
				String stringTemp = tabTrad[i][j].toLowerCase();
				if(stringTemp.contains(jour.toLowerCase())) { // .toUpperCase()
					id_jour = j;
					//System.out.println("id_jour ->"+id_jour);
				}
			}
		}
		
		// Troisième boucle pour afficher le résultat langue et jour du tableau de jours
		for(int i = 0; i < tabTrad.length ; i++ ) {
			if(id_langue != i) {
				System.out.println("La traduction de " +jour+ " est la suivante : " + tabTrad[i][id_jour] + " en " + tabLanguage[i]);
			}
		}
		
	}
	
}
