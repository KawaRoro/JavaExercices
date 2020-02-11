import com.crm.api.Utils;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class ImportClass {
	
	/**
	 * @param args
	 */
	// Exercice numéro 1_1_1
	public static void main(String[] args) {
		
		float nombre1 = 18;
		float nombre2 = 12;
		
		Utils boiteOutils = new Utils();
		System.out.println("Somme --> " + boiteOutils.somme(nombre1, nombre2));
		
		System.out.println("Calcul périmétre rectangle --> " + boiteOutils.calculRectangle(nombre1, nombre2));
		
	}
}
