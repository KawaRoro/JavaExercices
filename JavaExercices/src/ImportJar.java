import com.crm.api.Utils;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class ImportJar {
	
	/**
	 * @param args
	 */
	// Exercice numéro 1_1_1
	public static void main(String[] args) {
		
		int nombre1 = 18;
		int nombre2 = 12;
		
		Utils boiteOutils = new Utils();
		System.out.println("Somme méthode class --> " + boiteOutils.somme(nombre1, nombre2));
		
		System.out.println("Calcul périmétre rectangle --> " + boiteOutils.calculRectangle(nombre1, nombre2));
		
		float difference = MethodesMaths.somme(nombre1, nombre2);
		System.out.println("Somme méthode jar --> " + difference);
		
		MethodesMaths.afficherMessage("Phrase de commentaire ...");
		
		//boiteOutils.surfaceCercle(12);
		System.out.println("Calcul de l'aire d'un cercle --> " + boiteOutils.surfaceAireCercle(nombre1));
		
		System.out.println("Calcul du volume d'un cercle --> " + boiteOutils.surfaceVolumeCercle(nombre1));
		
		System.out.println("boiteOutils.PI --> " + boiteOutils.PI);
		
		System.out.println("boiteOutils.COULEUR_BLEU --> " + boiteOutils.COULEUR_BLEU);
		
		//String link = "<a href=\"http://abcd.com\" style=\"color:"+boiteOutils.COULEUR_BLEU+"\" target=\"_blank\">http://abcd.com</a>";
		
		//System.out.println(link);
		
		int maxNB = Math.max(nombre1, nombre2);
		System.out.println("Math.max --> " + maxNB);
		
		System.out.println("Calcul de l'aire d'un cercle --> " + boiteOutils.surfaceAireCerclePi(nombre1));
		System.out.println("Aire d'un cercle avec Math.round --> " + Math.round(boiteOutils.surfaceAireCerclePi(nombre1)));
		
		
	}
}
