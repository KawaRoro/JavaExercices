/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
package _old;
// Java Program to illustrate reading from FileReader 
// using BufferedReader 
import java.io.*;
import java.util.Scanner;

public class ImportDoc_001
{ 
	public static void main(String[] args)throws Exception 
	{
		  //String[] tabFlag = {"fr", "en", "de", "es", "it"};
		  File file_fr = new File("C:\\Users\\CRM.CRM-UC-3618\\Downloads\\mots2.txt");
		  File file_en = new File("C:\\Users\\CRM.CRM-UC-3618\\Downloads\\mots_en.txt");
		  File file_de = new File("C:\\Users\\CRM.CRM-UC-3618\\Downloads\\mots_de.txt");
		  File file_es = new File("C:\\Users\\CRM.CRM-UC-3618\\Downloads\\mots_es.txt");
		  File file_it = new File("C:\\Users\\CRM.CRM-UC-3618\\Downloads\\mots_it.txt");
		  
		  String charset = "UTF-8";
		  
		  BufferedReader reader_fr = new BufferedReader(new InputStreamReader(new FileInputStream(file_fr), charset));
		  BufferedReader reader_en = new BufferedReader(new InputStreamReader(new FileInputStream(file_en), charset));
		  BufferedReader reader_de = new BufferedReader(new InputStreamReader(new FileInputStream(file_de), charset));
		  BufferedReader reader_es = new BufferedReader(new InputStreamReader(new FileInputStream(file_es), charset));
		  BufferedReader reader_it = new BufferedReader(new InputStreamReader(new FileInputStream(file_it), charset));
		  
		  int e = 0;
		  String[] tabFr = new String[336531];
		  String[] tabEn = new String[336531];
		  String[] tabDe = new String[336531];
		  String[] tabEs = new String[336531];
		  String[] tabIt = new String[336531];
		  String st;
		  
		  // Ajout des mots dans une tableau -> fr
		  while ((st = reader_fr.readLine()) != null) {
			  if( e < 5000 ) {
				  tabFr[e] = st;
				  System.out.println( e +"->"+ st);
				  e++;
			  }
		  }
		  
		  // Ajout des mots dans une tableau -> en
		  e = 0;
		  while ((st = reader_en.readLine()) != null) {
			  if( e < 5000 ) {
				  tabEn[e] = st;
				  System.out.println( e +"->"+ st);
				  e++;
			  }
		  }
		  
		  // Ajout des mots dans une tableau -> de
		  e = 0;
		  while ((st = reader_de.readLine()) != null) {
			  if( e < 5000 ) {
				  tabDe[e] = st;
				  System.out.println( e +"->"+ st);
				  e++;
			  }
		  }
		  
		  // Ajout des mots dans une tableau -> es
		  e = 0;
		  while ((st = reader_es.readLine()) != null) {
			  if( e < 5000 ) {
				  tabEs[e] = st;
				  System.out.println( e +"->"+ st);
				  e++;
			  }
		  }
		  
		  // Ajout des mots dans une tableau -> it
		  e = 0;
		  while ((st = reader_it.readLine()) != null) {
			  if( e < 5000 ) {
				  tabIt[e] = st;
				  System.out.println( e +"->"+ st);
				  e++;
			  }
		  }
		  
		  int id_langue = 0;
		  int id_jour = 0;
		  String[] tabFlag = {"fr", "en", "de", "es", "it"};
		  String[] tabLanguage = {"Français", "Anglais", "Allemand", "Espagnol", "Italien"};
		  String[][] tabTrad = {  tabFr, tabEn, tabDe, tabEs, tabIt };
		  
		  Scanner sc = new Scanner(System.in);
			System.out.println("Quelle est la langue source ? choix:fr/en/de/es/it");
			String langue = sc.nextLine();
			System.out.println("langue ->"+langue);
			
			// Première boucle pour trouver l'identifiant de la langue
			for(int i = 0; i < tabFlag.length ; i++ ) {
				String stringTemp = tabFlag[i].toLowerCase();
				if(stringTemp.equals(langue.toLowerCase())) { // .toUpperCase()
					id_langue = i;
					System.out.println("id_langue ->"+id_langue);
				}
			}
			
			System.out.println("Donnez un jour de la semaine pour obtenir sa traduction : ");
			String jour = sc.nextLine();
			System.out.println("jour ->"+jour);
			System.out.println(tabTrad.length);
			
			// Deuxième boucle pour trouver l'identifiant du jour de la semaine
			for(int i = 0; i < (tabTrad.length-1) ; i++ ) {
				for(int j = 0; j < (tabTrad[i].length-1) ; j++ ) {
					String stringTemp = tabTrad[i][j].toLowerCase();
					if(stringTemp.equalsIgnoreCase(jour)) { // .toUpperCase()
						id_jour = j;
						System.out.println("id_jour ->"+id_jour);
					}
				}
			}
			
			System.out.println(tabTrad.length);
			// Troisième boucle pour afficher le résultat langue et jour du tableau de jours
			for(int i = 0; i < tabTrad.length ; i++ ) {
				if(id_langue != i) {
					System.out.println("La traduction de " +jour+ " est la suivante : " + tabTrad[i][id_jour] + " en " + tabLanguage[i]);
				}
			}
		  
		  //reader.close();
	}
} 
