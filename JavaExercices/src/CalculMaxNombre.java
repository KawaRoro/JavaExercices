/**
 * 
 */

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class CalculMaxNombre {
	
	/**
	 * @param args
	 */
	// Exercice numéro 1_1_1
	public static void main(String[] args) {
		
		String str_debut = new String("Le nombre");
		String str_fin = new String("est le plus grand ");
		
		int nombre1 = 12; // Champ de formulaire à créer
		int nombre2 = 25;
		int nombre3 = 8;
		
		if(nombre1 >= nombre2) {
			if(nombre1 >= nombre3) {
				System.out.println(str_debut + " " + nombre1 + " " + str_fin);
			}
		}
		
		if(nombre2 >= nombre1) {
			if(nombre2 >= nombre3) {
				System.out.println(str_debut + " " + nombre2 + " " + str_fin);
			}
		}
		
		if(nombre3 >= nombre1) {
			if(nombre3 >= nombre2) {
				System.out.println(str_debut + " " + nombre3 + " " + str_fin);
			}
		}
		
	}
}
