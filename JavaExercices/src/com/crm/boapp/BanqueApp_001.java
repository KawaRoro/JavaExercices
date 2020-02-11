package com.crm.boapp;

import java.util.Scanner;
//java.io.FileNotFoundException;
import java.io.*;

import com.crm.bo.Banque;
// class vector
public class BanqueApp_001 {
	
	public static void main(String[] args) throws IOException {
		final int PLAFOND = -150;
		char reponse = ' ';
		String cpt_banq = "";
		float solde = 0;
		float depot = 0;
		int retrait = 0;
		int choix_operation_001 = 0;
		int choix_operation_002 = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("***Bienvenue à la petite Banque***");
		
		Banque banq = new Banque();
		
		do{
			System.out.println("Choisissez le type d'opération que vous voulez effectuer : ");
			System.out.println("[1] Ouvrir un compte");
			System.out.println("[2] Accéder à votre compte");
			choix_operation_001 = Integer.parseInt(sc.nextLine());
			
			if(choix_operation_001 == 1) {
				cpt_banq = banq.generate(11);
				banq.setNumCompte(cpt_banq);
				//banq.setNumCompte("18456812020");
				//banq.getSoldeCompte();
				
				addModFile("file_"+cpt_banq+".txt", String. valueOf(banq.getSoldeCompte()));
				
				banq.afficherCreationCompte();
				
				reponse = 'O';
				choix_operation_001 = 2;
				 
			} else if(choix_operation_001 == 2) {
				
				System.out.println("Veuillez saisir votre numéro de compte : ");
				cpt_banq = sc.nextLine();
				
				readFile("file_"+cpt_banq);
				
				do{
					System.out.println("Choisissez le type d'opération que vous voulez effectuer : ");
					System.out.println("[1] Connaitre le solde du compte");
					System.out.println("[2] Faire un retrait");
					System.out.println("[3] Procéder à un dépot");
					
					choix_operation_002 = Integer.parseInt(sc.nextLine());
					
					//[1] Connaitre le solde du compte
					if(choix_operation_002 == 1) {
						banq.afficherDetails();
						
						reponse = again(sc, reponse);
					
					//[2] Faire un retrait
					} else if(choix_operation_002 == 2) {
						banq.afficherSolde();
						System.out.println("Indiquez la somme à retirer : ");
						solde = banq.getSoldeCompte();
						retrait = Integer.parseInt(sc.nextLine());
						
						if(PLAFOND > (solde-retrait)) {
							System.out.println("Solde de découvert atteint. L'opération ne peut donner suite");
							//reponse = again(sc, reponse);
						} else {
						
							banq.setSoldeCompte(solde-retrait);
							banq.afficherSolde();
						}
						
						reponse = again(sc, reponse);
					
					//[3] Procéder à un dépot
					} else if(choix_operation_002 == 3) {
						banq.afficherSolde();
						System.out.println("Indiquez la somme à déposer : ");
						solde = banq.getSoldeCompte();
						depot = Integer.parseInt(sc.nextLine());
						
						banq.setSoldeCompte(solde+depot);
						banq.afficherSolde();
						
						reponse = again(sc, reponse);
					}
				}while (reponse == 'O' || reponse == 'o');
			}
		}while (reponse == 'O' || reponse == 'o');
		
		//------------------//
		
		System.out.println("Bonne journée, à bientôt.");
		sc.close();
		//out.close();
		
	}
	
	/*public static String generate(int length) {
		String chars = "1234567890";
		StringBuilder cpt_gen = new StringBuilder(length);
		for (int x = 0; x < length; x++) {
			int i = (int) (Math.random() * chars.length());
			cpt_gen.append(chars.charAt(i));
		}
		return cpt_gen.toString();
	}*/
	
	public static char again(Scanner sc , char rep) {
		do{
		    System.out.println("Souhaitez vous procéder à une autre opération ? (O/N)");
		    rep = sc.nextLine().charAt(0);
		    return rep;
		}while(rep != 'O' && rep != 'N' && rep != 'o' && rep != 'n');
	}
	
	public static void addModFile(String filename, String text) {
		BufferedWriter writer = null;
		try
		{
		    writer = new BufferedWriter( new FileWriter( filename ));
		    writer.write(text);
	
		}
		catch ( IOException e)
		{
		}
		finally
		{
		    try
		    {
		        if ( writer != null)
		        writer.close( );
		    }
		    catch ( IOException e)
		    {
		    }
		}
	}
	
	public static String readFile(String filename)  throws IOException {
		String solde_txt = "";
		String st = "";
		InputStream is = null; 
		InputStreamReader isr = null;
		BufferedReader br = null;
		String charset = "UTF-8";
		
		try {
			// open input stream test.txt for reading purpose.
			is = new FileInputStream("C:\\Users\\CRM.CRM-UC-3618\\Downloads\\_Banque_de_code\\_gitWork\\JavaLeRetour\\JavaLeRetour\\"+filename+".txt");
			// create new input stream reader
			isr = new InputStreamReader(is, charset);
			// create new buffered reader
			br = new BufferedReader(isr);
			
			while ((st = br.readLine()) != null) {
				solde_txt += st;
			}
			
			// releases any system resources associated with reader
			br.close();
			// creates error
			br.read();
		     
		} catch(IOException e) {
			// IO error
			System.out.println("The buffered reader is closed");
		} finally {
			// releases any system resources associated
			if(is!=null)
				is.close();
			if(isr!=null)
				isr.close();
			if(br!=null)
				br.close();
		}
		
		return solde_txt;
	}
	
}
