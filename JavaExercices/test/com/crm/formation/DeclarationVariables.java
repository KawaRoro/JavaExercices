package com.crm.formation;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class DeclarationVariables {
	
	/**
	 * @param args
	 */
	
	public static float getTotalAchats(int cli) {
		
		float total = 0; // Variable locale
		int nbArticles = cli; // Variable locale
		float txTVA = 1.196F;
		
		//int tempCount = 1;
		return total = nbArticles * txTVA;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getTotalAchats(12));
		
	}
	
}
