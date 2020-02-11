package _old;


import java.util.Scanner;
/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class TableauChaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int id_jour = 0;
		
		String[] tabJoursSemaine = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
		for(int i = 0; i < tabJoursSemaine.length ; i++ ) {
			//System.out.println(tabJoursSemaine[i]);
		}
		
		//------------------//
		
		String[] tabDaysByWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Synday"};
		for(int i = 0; i < tabDaysByWeek.length ; i++ ) {
			//System.out.println(tabDaysByWeek[i]);
		}
		
		//------------------//
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez un jour de la semaine pour obtenir sa traduction : ");
		String jour = sc.nextLine();
		
		for(int i = 0; i < tabJoursSemaine.length ; i++ ) {
			String stringTemp = tabJoursSemaine[i].toLowerCase();
			if(stringTemp.equals(jour.toLowerCase())) { // .toUpperCase()
				id_jour = i;
			}
		}
		
		System.out.println("La traduction de " +jour+ " est la suivante : " + tabDaysByWeek[id_jour]);
		
		
	}
	
	
	
	
}
