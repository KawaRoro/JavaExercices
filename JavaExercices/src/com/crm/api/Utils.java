/**
 * 
 */
package com.crm.api;

/**
 * @author CRM
 *
 */
public class Utils {
	
	// Déclaration d'une constante PI
	public static final float PI = 3.14f;
	public static final String COULEUR_BLEU = "Bleu";
	
	public static float somme(float a, float b) {
		float s = a + b;
		return s;
	}
	
	public static float calculRectangle(float ab, float bc) {
		
		float perRec = 0;
		
		perRec = (ab + bc)* 2;
		
		//System.out.println("Le périmétre du rectangle est : "+ perRec);
		return perRec;
	}
	
	public static double surfaceAireCercle(float rayon) {
		
		double PI = 3.14;
		double aireSphere;
		
		//aire <-- 4*PI*R*R
		aireSphere = 4*PI*rayon*rayon;
		
		//System.out.println("L'aire d'un cercle est : "+ aireSphere);
		return aireSphere;
	}
	
	public static double surfaceVolumeCercle(float rayon) {
		// Déclaration d'une constante PI
		//final float PI = 3.14f;
		
		//double PI = 3.14;
		double volumeSphere;
		
		//volume <-- 4/3*PI*R*R*R
		volumeSphere = 4/3*PI*rayon*rayon*rayon;
		
		//System.out.println("L'aire d'un cercle est : "+ aireSphere);
		return volumeSphere;
	}
	
	public static double surfaceAireCerclePi(float rayon) {
		
		//double Pi = Math.PI;
		double aireSphere;
		
		//aire <-- 4*PI*R*R
		aireSphere = 4 * Math.PI * Math.pow( rayon, 2.0);//rayon*rayon;
		
		//System.out.println("L'aire d'un cercle est : "+ aireSphere);
		return aireSphere;
	}
	
}
