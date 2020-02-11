package com.crm.formation;

import java.text.DecimalFormat;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class ClassMath {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		System.out.println("double max value :");
		double nombreDouble = Double.MAX_VALUE; // 8 octets
		System.out.println(nombreDouble);
		
		//final double PI_LIGHT = Math.PI;
		//System.out.println(PI_LIGHT);
		//double mon_double = PI_LIGHT;
		
		double monDoublePi = Math.PI;
        DecimalFormat df = new DecimalFormat("0.00"); // import java.text.DecimalFormat;
        System.out.println(df.format(monDoublePi));
        String strPi = df.format(monDoublePi);
        strPi = strPi.replaceAll(",", ".");  // eventuellement
        final double PI_LIGHT = Double.parseDouble(strPi);
        System.out.println(PI_LIGHT);
	}
	
}
