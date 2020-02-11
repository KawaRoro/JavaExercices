package _old;
import java.util.Scanner;
/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class TableauChaine_002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int id_jour = 0;
		// jours de la semaine
		String[] tabJoursSemaine = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
		for(int i = 0; i < tabJoursSemaine.length ; i++ ) {
			//System.out.println(tabJoursSemaine[i]);
		}
		
		//------------------//
		//days of the week
		String[] tabDaysByWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Synday"};
		for(int i = 0; i < tabDaysByWeek.length ; i++ ) {
			//System.out.println(tabDaysByWeek[i]);
		}
		
		//------------------//
		//wochentags
		String[] tabWochentags = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
		for(int i = 0; i < tabWochentags.length ; i++ ) {
			//System.out.println(tabWochentags[i]);
		}
		
		//------------------//
		//días de la semana
		String[] tabDiasdelasemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		for(int i = 0; i < tabDiasdelasemana.length ; i++ ) {
			//System.out.println(tabDiasdelasemana[i]);
		}
		
		//------------------//
		String[][] tabTrad = { {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"}, {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Synday"}, {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"}, {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"} };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez un jour de la semaine pour obtenir sa traduction : ");
		String jour = sc.nextLine();
		
		for(int i = 0; i < tabJoursSemaine.length ; i++ ) {
			String stringTemp = tabJoursSemaine[i].toLowerCase();
			if(stringTemp.equals(jour.toLowerCase())) { // .toUpperCase()
				id_jour = i;
			}
		}
		
		System.out.println("La traduction de " +jour+ " est la suivante : " + tabDaysByWeek[id_jour] + " en anglais");
		System.out.println("La traduction de " +jour+ " est la suivante : " + tabWochentags[id_jour] + " en allemand");
		System.out.println("La traduction de " +jour+ " est la suivante : " + tabDiasdelasemana[id_jour] + " en espagnol");
	}
	
	
	
	
}
