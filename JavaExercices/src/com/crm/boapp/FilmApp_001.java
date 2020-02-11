package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Film;

public class FilmApp_001 {

	public static void main(String[] args) {
		
		
		//------------------//
		
		Film fil = new Film();
		
		fil.setTitre("Schoenmaeker");
		fil.setClassification("Tous publics");
		fil.setCategory("Action");
		
		fil.afficherDetails();
		
		
	}

}
