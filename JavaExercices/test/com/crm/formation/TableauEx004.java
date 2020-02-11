package com.crm.formation;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class TableauEx004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] tableauNom = new String[1];
		String[] tableauPrenom = new String[1];
		int i = 0;
		int countNom = 0;
		int countPrenom = 0;
		
		// Débug
		if(args != null) {
			//System.out.println(args.length);
		}
		
		// Boucle qui parcour les arguments envoyer via run -> debug configurations
		for(String st : args) {
			
			//System.out.println(st);
			String[] tabSplit = st.split("=");
			
			// Récupération du nom
			if(tabSplit[0].equals("nom")) {
				tableauNom[0] = tabSplit[1];
				countNom++;
			}
			// Récupération du prénom
			if(tabSplit[0].equals("prenom")) {
				tableauPrenom[0] = tabSplit[1];
				countPrenom++;
			}
			
			i++;
			
		}
		
		// Afficher Bonjour en personnalisé
		System.out.println("Bonjour "+ tableauPrenom[0] + " " + tableauNom[0]);
		
	}

}
