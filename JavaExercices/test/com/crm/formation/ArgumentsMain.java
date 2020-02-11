package com.crm.formation;
/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class ArgumentsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*System.out.println("debug:");
		if(args != null) {
			System.out.println(args.length);
		}
		for(String st : args) {
			System.out.println(st);
		}*/
		if(args.length == 3) {
			System.out.println("Bienvenue " + args[0] +" "+ args[1] +" "+ args[2]);
		}
		
	}
	
}
