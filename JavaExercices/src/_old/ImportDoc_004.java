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

public class ImportDoc_004 
{
	public static void main(String[] args)throws Exception 
	{
		  int taille_tab = 336532;
		  
		  //String[] tabFlag = {"fr", "en", "de", "es", "it"};
		  //C:\\Users\\CRM.CRM-UC-3618\\Downloads\\_Banque_de_code\\_gitWork\\JavaLeRetour\\JavaLeRetour\\src
		  File file_fr = new File("C:\\Users\\CRM.CRM-UC-3618\\Downloads\\_Banque_de_code\\_gitWork\\JavaLeRetour\\JavaLeRetour\\src\\rep_langues\\mots_fr.txt");
		  File file_en = new File("C:\\Users\\CRM.CRM-UC-3618\\Downloads\\_Banque_de_code\\_gitWork\\JavaLeRetour\\JavaLeRetour\\src\\rep_langues\\mots_en.txt");
		  File file_de = new File("C:\\Users\\CRM.CRM-UC-3618\\Downloads\\_Banque_de_code\\_gitWork\\JavaLeRetour\\JavaLeRetour\\src\\rep_langues\\mots_de.txt");
		  File file_es = new File("C:\\Users\\CRM.CRM-UC-3618\\Downloads\\_Banque_de_code\\_gitWork\\JavaLeRetour\\JavaLeRetour\\src\\rep_langues\\mots_es.txt");
		  File file_it = new File("C:\\Users\\CRM.CRM-UC-3618\\Downloads\\_Banque_de_code\\_gitWork\\JavaLeRetour\\JavaLeRetour\\src\\rep_langues\\mots_it.txt");
		  
		  String charset = "UTF-8";
		  
		  BufferedReader reader_fr = new BufferedReader(new InputStreamReader(new FileInputStream(file_fr), charset));
		  BufferedReader reader_en = new BufferedReader(new InputStreamReader(new FileInputStream(file_en), charset));
		  BufferedReader reader_de = new BufferedReader(new InputStreamReader(new FileInputStream(file_de), charset));
		  BufferedReader reader_es = new BufferedReader(new InputStreamReader(new FileInputStream(file_es), charset));
		  BufferedReader reader_it = new BufferedReader(new InputStreamReader(new FileInputStream(file_it), charset));
		  
		  int cpt_fr = 0;
		  String[] tabFr = new String[taille_tab];
		  String[] tabEn = new String[taille_tab];
		  String[] tabDe = new String[taille_tab];
		  String[] tabEs = new String[taille_tab];
		  String[] tabIt = new String[taille_tab];
		  String st;
		  
		  // Ajout des mots dans une tableau -> fr
		  while ((st = reader_fr.readLine()) != null) {
			  if( cpt_fr < taille_tab ) {
				  tabFr[cpt_fr] = st;
				  //System.out.println( cpt_fr +"->"+ st);
				  cpt_fr++;
			  }
		  }
		  //System.out.println("cpt_fr ->"+cpt_fr);
		  
		  // Ajout des mots dans une tableau -> en
		  int cpt_en = 0;
		  while ((st = reader_en.readLine()) != null) {
			  if( cpt_en < taille_tab ) {
				  //System.out.println( cpt_en +"->"+ st);
				  if(!st.equals("")) {
					  tabEn[cpt_en] = st;
					  //System.out.println( cpt_en +"->"+ st);
					  cpt_en++;
				  }
			  }
		  }
		  //System.out.println("cpt_en ->"+cpt_en);
		  
		  // Bidouille temporaire
		  /*if(cpt_en < cpt_fr) {
			  for(int i = cpt_en ; i < cpt_fr ; i++) {
				  tabEn[i] = "";
			  }
		  }*/
		  
		  // Ajout des mots dans une tableau -> de
		  int cpt_de = 0;
		  while ((st = reader_de.readLine()) != null) {
			  if( cpt_de < taille_tab ) {
				  if(!st.equals("")) {
					  tabDe[cpt_de] = st;
					  //System.out.println( cpt_en +"->"+ st);
					  cpt_de++;
				  }
			  }
		  }
		  //System.out.println("cpt_de ->"+cpt_de);
		  // Bidouille temporaire
		  /*if(cpt_de < cpt_fr) {
			  for(int i = cpt_de ; i < cpt_fr ; i++) {
				  tabDe[i] = "";
			  }
		  }*/
		  
		  // Ajout des mots dans une tableau -> es
		  int cpt_es = 0;
		  while ((st = reader_es.readLine()) != null) {
			  if( cpt_es < taille_tab ) {
				  if(!st.equals("")) {
					  tabEs[cpt_es] = st;
					  //System.out.println( cpt_de +"->"+ st);
					  cpt_es++;
				  }
			  }
		  }
		  // System.out.println("cpt_es ->"+cpt_es);
		  // Bidouille temporaire
		  /*if(cpt_es < cpt_fr) {
			  for(int i = cpt_es ; i < cpt_fr ; i++) {
				  tabEs[i] = "";
			  }
		  }*/
		  
		  // Ajout des mots dans une tableau -> it
		  int cpt_it = 0;
		  while ((st = reader_it.readLine()) != null) {
			  if( cpt_it < taille_tab ) {
				  if(!st.equals("")) {
					  tabIt[cpt_it] = st;
					  //System.out.println( cpt_it +"->"+ st);
					  cpt_it++;
				  }
			  }
		  }
		  //System.out.println("cpt_it ->"+cpt_it);
		  // Bidouille temporaire
		  /*if(cpt_it < cpt_fr) {
			  for(int i = cpt_it ; i < cpt_fr ; i++) {
				  tabIt[i] = "";
			  }
		  }*/
		  
		  int id_langue = 0;
		  int id_jour = 0;
		  String[] tabFlag = {"fr", "en", "de", "es", "it"};
		  String[] tabLanguage = {"Français", "Anglais", "Allemand", "Espagnol", "Italien"};
		  String[][] tabTrad = {  tabFr, tabEn, tabDe, tabEs, tabIt };
		  
		  Scanner sc = new Scanner(System.in);
			System.out.println("Quelle est la langue source ? choix:fr/en/de/es/it");
			String langue = sc.nextLine();
			//System.out.println("langue ->"+langue);
			
			// Première boucle pour trouver l'identifiant de la langue
			for(int i = 0; i < tabFlag.length ; i++ ) {
				String stringTemp = tabFlag[i].toLowerCase();
				if(stringTemp.equals(langue.toLowerCase())) { // .toUpperCase()
					id_langue = i;
					//System.out.println("id_langue ->"+id_langue);
				}
			}
			
			System.out.println("Donnez un jour de la semaine pour obtenir sa traduction : ");
			String jour = sc.nextLine();
			//System.out.println("jour ->"+jour);
			//System.out.println(tabTrad.length);
			
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
			
			//System.out.println(tabTrad.length);
			// Troisième boucle pour afficher le résultat langue et jour du tableau de jours
			for(int i = 0; i < tabTrad.length ; i++ ) {
				if(id_langue != i) {
					System.out.println("La traduction de " +jour+ " est la suivante : " + tabTrad[i][id_jour] + " en " + tabLanguage[i]);
				}
			}
		  
		  //reader.close();
			sc.close();
	}
} 
