package com.crm.formation;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class TableauEx003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String strToSplit = "Riri,Fifi,Loulou";
		String[] tabSplit = strToSplit.split(",");
		
		for( String str : tabSplit ) {
			System.out.println(str);
		}
		
	}

}
