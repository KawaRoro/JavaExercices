/**
 * 
 */

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class CalculSomme {
	
	/**
	 * @param args
	 */
	// Exercice numéro 1_1_1
	public static void main(String[] args) {
		String str = new String("Entrer votre premier nombre");
		int nombre1 = 18; // Champ de formulaire à créer
		int nombre2 = 12;
		int somme = 0;
		int moyenne = 0;
		
		if(nombre1 >= 0) {
			System.out.println(str+" "+nombre1);
			System.out.println(str+" "+nombre2);
			somme = nombre1 + nombre2;
			System.out.println("somme --> "+somme);
			moyenne = (nombre1 + nombre2)/2;
			System.out.println("moyenne --> "+moyenne);
		}
		
	}
}
