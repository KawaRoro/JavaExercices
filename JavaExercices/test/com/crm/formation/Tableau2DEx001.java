package com.crm.formation;

import java.util.Arrays;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class Tableau2DEx001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// d�claration d'un tableau de 2 dimensions
		int[][] tab2d = new int[2][3];
		
		tab2d[0][0] = 1;
		System.out.println("�l�ment [0][0] -> "+ tab2d[0][0]);
		System.out.println("------------------------------------");
		
		int[][] tab2dim = { {1,3,5}, {0,2,4} };
		
		System.out.println("�l�ment [1][0] -> "+ tab2dim[1][0]);
		System.out.println("�l�ment [0][0] -> "+ tab2dim[0][0]);
		System.out.println("�l�ment [1][1] -> "+ tab2dim[1][1]);
		System.out.println("�l�ment [0][1] -> "+ tab2dim[0][1]);
		System.out.println("�l�ment [1][2] -> "+ tab2dim[1][2]);
		System.out.println("�l�ment [0][2] -> "+ tab2dim[0][2]);
		
		System.out.println("------------------------------------");
		tab2dim[1][2] = 6;
		
		System.out.println("�l�ment [1][0] -> "+ tab2dim[1][0]);
		System.out.println("�l�ment [0][0] -> "+ tab2dim[0][0]);
		System.out.println("�l�ment [1][1] -> "+ tab2dim[1][1]);
		System.out.println("�l�ment [0][1] -> "+ tab2dim[0][1]);
		System.out.println("�l�ment [1][2] -> "+ tab2dim[1][2]);
		System.out.println("�l�ment [0][2] -> "+ tab2dim[0][2]);
		
		System.out.println("------------------------------------");
		
		// Taille de colonne
		System.out.println(tab2dim.length);
		
		// Nombre de colonne
		System.out.println(tab2dim[0].length);
		
		// Lecture
		for(int i = 0; i < tab2dim.length; i++) {
			for(int j = 0; j < tab2dim[i].length; j++) {
				System.out.println("�l�ment ["+i+"]["+j+"] -> " + tab2dim[i][j]);
			}
		}
		
		System.out.println("------------------------------------");
		// D�claration avec init ( colonnes , variables)
		int[][] tab2dVar2 = { {1,3,5}, {0,2,4,0,2,4}, {1}, {0,2,4,0,2,4,7} };
		
		for(int i = 0; i < tab2dVar2.length; i++) {
			for(int j = 0; j < tab2dVar2[i].length; j++) {
				System.out.println("�l�ment ["+i+"]["+j+"] -> " + tab2dVar2[i][j]);
			}
		}
		
		System.out.println("------------------------------------");
		
		
	}
	
}
