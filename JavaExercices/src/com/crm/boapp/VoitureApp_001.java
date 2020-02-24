package com.crm.boapp;
import java.util.Scanner;

import com.crm.bo.Voiture;

public class VoitureApp_001 {

	private static final char NAN = 0;
	private static String mode = "ville"; // route // autoroute
	private static String temps = "ensoleillé"; // route // autoroute

	public static void main(String[] args) {
		
		char reponse = ' ';
		int choix_operation_001 = 0;
		int choix_operation_002 = 0;
		
		int choix_consigne_001 = 0;
		
		
		System.out.println("-------------------------------------------");
		System.out.println("Bienvenue sur le circuit «L'Anneau du Rhin»");
		System.out.println("-------------------------------------------");
		
		System.out.println("-------------------------------------------");
		System.out.println("Des voitures s'affrontent sur un parcourt qui alli ville, route de campagne et autoroute");
		System.out.println("Choisissez une voiture d'après la liste suivante :");
		
		Voiture[] voitures = new Voiture[5];
		//public Voiture(String marque, String model, String couleur, int nb_portes, int prix, boolean boite_auto, double vitesse_max, int puissance) {
		voitures[0] = new Voiture("Renault", "Clio 12", "Bleu", 3, 12000, false, 180, 7);
		voitures[1] = new Voiture("BMW", "BMW x5", "Noir", 3, 65900, true, 220, 8);
		voitures[2] = new Voiture("Ford", "Fiesta", "Rouge", 5, 13900, false, 200, 6);
		voitures[3] = new Voiture("Audi", "A3", "Noir", 3, 26870, true, 240, 8);
		voitures[4] = new Voiture("Nissan", "Juke", "Noir", 3, 19990, true, 200, 8);
		
		for (Voiture v : voitures) {
			v.attributs_choix();
		}
		
		System.out.println("-------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		choix_operation_001 = Integer.parseInt(sc.nextLine());
		choix_operation_001 = choix_operation_001-1;
		
		System.out.println("Exellent choix !!!");
		
		do {
			System.out.println("");
			System.out.println("Vous avez accès aux fonctionnalités suivantes :");
			System.out.println("[1] Démarrer");
			System.out.println("[2] Accéder à la vitesse courante");
			System.out.println("[3] Accélérer");
			System.out.println("[4] Ralentir");
			System.out.println("[5] Arrêter la voiture");
			System.out.println("[6] Klaxonner");
			
			choix_operation_002 = Integer.parseInt(sc.nextLine());
			
			switch (choix_operation_002) {
		        case 1:
		        	if(voitures[choix_operation_001].isDemarrage() == false) {
		        		voitures[choix_operation_001].setDemarrage(true);
		        		System.out.println("VrooooooOOOoooooooooooooooooooom");
		        		System.out.println("La voiture ronronne !!!");
		        	} else {
		        		System.out.println("La voiture est déjà démarré !");
		        	}
		            break;
		        case 2:
		        	if(voitures[choix_operation_001].isDemarrage() == false) {
		        		System.out.println("Vous devez démarrer la voiture pour accéder aux propriétés de vitesse ...");
		        	}else {
			        	if(voitures[choix_operation_001].getVitesse() == 0) {
			        		System.out.println("La voiture passe de 0 à 50 en xxx secondes");
			        		voitures[choix_operation_001].setLimite_vitesse(50);
			        	}else{
			        		System.out.println("La voiture passe à 50.");
			        		voitures[choix_operation_001].setLimite_vitesse(50);
			        	}
		        	}
		            break;
		        case 3:
		        	
		            break;
		        case 4:
		        	
		            break;
		        case 5:
		        	if(voitures[choix_operation_001].isDemarrage() == true) {
		        		voitures[choix_operation_001].setDemarrage(false);
		        		System.out.println("Le moteur de la voiture est maintenant éteint...");
		        	}
		            break;
		        case 6:
		        	System.out.println("Tutututuututu");
		            break;
			}
			
			choix_consigne((int)Math.round(Math.random()*10));
			
		}while(reponse != 'n' && reponse != 'N' && reponse != NAN);
			
	}
	
	public static void choix_consigne(int number) {
		System.out.println(number);
		switch (number) {
	        case 1:
	        	System.out.println("***Vous arrivez à un stop vous devez diminuer votre vitesse***");
	            break;
	        case 2:
	        	System.out.println("***Vous êtes en ville***");
	        	mode = "ville";
	            break;
	        case 3:
	        	System.out.println("***Vous êtes sur route***");
	        	mode = "route";
	            break;
	        case 4:
	        	System.out.println("***Vous êtes sur autoroute***");
	        	mode = "autoroute";
	            break;
	        case 5:
	        	System.out.println("***Vous devez faire le plein***");
	            break;
	        case 6:
	        	System.out.println("***Brouillard***");
	        	temps = "brouillard";
	            break;
	        case 7:
	        	System.out.println("***Il se met à pleuvoir***");
	        	temps = "pluie";
	            break;
	        case 8:
	        	System.out.println("***Temps ensoleillé***");
	        	temps = "ensoleillé";
	            break;
	        default:
	        	if(temps != "ensoleillé") {
	        		temps = "ensoleillé";
	        	}
	        	break;
		}
	}

}
