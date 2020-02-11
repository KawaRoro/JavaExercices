package com.crm.formation;
/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class TableauTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args != null) {
			System.out.println(args.length);
		}
		for(String st : args) {
			System.out.println(st);
		}
		
		int[] tableau = {1,2,3,4,5};
		afficherTableau(tableau);
	}
	
	public static void afficherTableau(int[] tabInt) {
		for(int nb : tabInt) {
			System.out.println(nb);
		}
	}
	
	

}
