package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Repere;
// class vector
public class RepereApp_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char reponse = ' ';
		
		int cpt_tab_rep = 0;
		int cpt_max_tab_rep = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez le nombre de point à traiter : ");
		cpt_max_tab_rep = Integer.parseInt(sc.nextLine());
		//cpt_max_tab_rep = 100;
		
		
		Repere[] tab_rep = new Repere[cpt_max_tab_rep];
		
		/*Repere rep = new Repere();
		rep.setX(20);
		rep.setY(20);
		rep.afficherDetails();
		tab_rep[0] = rep;
		
		cpt_tab_rep++;*/
		
		//------------------//
		
		
		do{
			//rep = new Repere();
			Repere rep = new Repere();
			
			System.out.println("Donnez la coordonnée de x : ");
			rep.setX(Integer.parseInt(sc.nextLine()));
			
			System.out.println("Donnez la coordonnée de y : ");
			rep.setY(Integer.parseInt(sc.nextLine()));
			
			rep.afficherDetails();
			
			tab_rep[cpt_tab_rep] = rep;
			
			cpt_tab_rep++;
			
			/* do{
				    System.out.println("Voulez-vous réessayer ? (O/N)");
				    reponse = sc.nextLine().charAt(0);
				    
			}while(reponse != 'O' && reponse != 'N' && reponse != 'o' && reponse != 'n');*/
				        
		}while (cpt_tab_rep < cpt_max_tab_rep);
		
		
		System.out.println("Récapitulatif--------------------------------------------------");
		
		System.out.println("Calcul la distance entre deux points à partir de (0,0) ");
		for(int i=0; i < cpt_tab_rep ; i++) {
			//tab_rep[i].afficherDetails();
			//tab_rep[i].afficherComparaisonDetails(i, moyenne_x , moyenne_y);
			System.out.println(getChar(i) + ": (0,0)-("+tab_rep[i].getX()+","+tab_rep[i].getY()+"): " + Distance(0, 0, tab_rep[i].getX(), tab_rep[i].getY()) );
		}
		
		//for(int i=0; i < tab_points.length ; i++) {
			
		//}
		
		do{
			System.out.println("Pour calculer la distance entre deux points, veuillez précisez les deux points (exemple : A-B)");
			String points = sc.nextLine();
			String[] tab_points = points.split("-");
			
			int var_get_int0 = getInt(tab_points[0]);
			int var_get_int1 = getInt(tab_points[1]);
			
			System.out.println(points + ": ("+tab_rep[var_get_int0].getX()+","+tab_rep[var_get_int0].getY()+")-("+tab_rep[var_get_int1].getX()+","+tab_rep[var_get_int1].getY()+"): " + Distance(tab_rep[var_get_int0].getX(), tab_rep[var_get_int0].getY(), tab_rep[var_get_int1].getX(), tab_rep[var_get_int1].getY()) );
			
			do{
				System.out.println("Voulez-vous réessayer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			}while(reponse != 'O' && reponse != 'N' && reponse != 'o' && reponse != 'n');
        
		}while (reponse == 'O' || reponse == 'o');
		
		sc.close();
		
	}
	
	public static double sqr(double a) {
        return a*a;
    }
 
    public static double Distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(sqr(y2 - y1) + sqr(x2 - x1));
    }
    
    public static char getChar(int i) {
        return i<0 || i>25 ? '?' : (char)('A' + i);
    }
    
    /*public static int getInt(char c) {
    	return c = (char) Integer.parseInt(String.valueOf(c));
    }*/
    
    public static int getInt(String c) {
    	int code = 0;
    	switch (c) {
		        case "A": 
		             code = 0;
		                break;
		        case "B": 
		             code = 1;
		                break;
		        case "C": 
		             code = 2;
		                break;
		        case "D": 
		             code = 3;
		                break;
		        case "E": 
		             code = 4;
		                break;
		        case "F": 
		             code = 5;
		                break;
		        case "G": 
		             code = 6;
		                break;
		        case "H": 
		             code = 7;
		                break;
		        case "I": 
		             code = 8;
		                break;
		        case "J": 
		             code = 9;
		                break;
		        case "K": 
		             code = 10;
		                break;
		        case "L": 
		             code = 11;
		                break;
		        case "M": 
		             code = 12;
		                break;
		        case "N": 
		             code = 13;
		                break;
		        case "O": 
		             code = 14;
		                break;
		        case "P": 
		             code = 15;
		                break;
		        case "Q": 
		             code = 16;
		                break;
		        case "R": 
		             code = 17;
		                break;
		        case "S": 
		             code = 18;
		                break;
		        case "T": 
		             code = 19;
		                break;
		        case "U": 
		             code = 20;
		                break;
		        case "V": 
		             code = 21;
		                break;
		        case "W": 
		             code = 22;
		                break;
		        case "X": 
		             code = 23;
		                break;
		        case "Y": 
		             code = 24;
		                break;
		        case "Z": 
		             code = 25;
		                break;
		    default:
		            System.out.println("Nom de point invalide !");
		            break;
		}
    	return code;
    }
}
