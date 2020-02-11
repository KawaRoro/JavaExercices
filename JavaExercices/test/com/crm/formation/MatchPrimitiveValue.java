package com.crm.formation;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class MatchPrimitiveValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
    {
		String typing = "string";
		String input = "18";
		//showPrimitive(typing, input);
		//System.out.println("Primitive check differences " + showPrimitive(typing, input));
    }

    public static void showPrimitive(String typing, String input) {
    	
    	String oldTyping = typing;
    	boolean checkTyping = false;
    	
    	// Boolean
        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
            System.out.println("Primitive : boolean");
            typing = "boolean";
            //return;
        }
        
        // Int
        try {
        	
            long num = Long.parseLong(input);
            
            if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                System.out.println("Primitive : byte");
                typing = "byte";
            } else if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
               System.out.println("Primitive : short");
               typing = "short";
            } else if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
               System.out.println("Primitive : int");
               typing = "int";
            } else {
               System.out.println("Primitive : long");
               typing = "long";
            }
            
            return;
            
        } catch (NumberFormatException ex) {
        	//System.err.println("NumberFormatException: " + ex.getMessage());
        }
        
        // Float & Double
        try {
        	
        	double num_decimal = Double.parseDouble(input);
        	//typing = "double";
        	if(num_decimal >= Float.MIN_VALUE && num_decimal <= Float.MAX_VALUE ) {
	        	//float f = Float.valueOf(input.trim()).floatValue();
	        	float f = Float.parseFloat(input);
	            System.out.println("float f = " + f);
	            typing = "float";
        	}else {
        		typing = "double";
        	}
        	
        	return;
        	
        } catch (NumberFormatException ex) {
        	//System.err.println("NumberFormatException: " + ex.getMessage());
        }
        
        // Character
        if(input.length() < 2 && typing == "string" && input.length() != 0) {
        	System.out.println("Primitive : char");
            typing = "char";
        }
        
        // Void
        if(input == "" && typing == "string") {
        	System.out.println("Primitive : void");
            typing = "void";
        }
        
        checkTyping = oldTyping != typing ? true : false;
        
        /*if(oldTyping != typing) {
        	checkTyping = true;
        }*/
        
        // Array
        
        
        return ;//checkTyping
    }
}
