package com.crm.formation;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class TableauxMultiDim {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int premiersNombres[][] = {{0,2,4,6,8},{1,3,5,7,9}};
		
		int i = 0, j =0;
		
		while(i<2) {
			j = 0;
			while(j<5) {
				System.out.print(premiersNombres[i][j]);
				j++;
			}
			System.out.println("");
			i++;
		}
	}
}
