/**
 * 
 */
package com.crm.bo;

/**
 * @author CRM
 *
 */
public class Banque {

	// Atrributs
	private String num_compte;
	private long decouvert;
	private float solde;
	private int tab_num_compte;
	private int tab_retrait;
	private int tab_depot;
	private int type_operation;

	// Méthodes
	public String getNumCompte() {
		return num_compte;
	}
	
	public void setNumCompte(String n) {
		this.num_compte = n;
	}
	
	public float getSoldeCompte() {
		return solde;
	}
	
	public void setSoldeCompte(float n) {
		this.solde = n;
	}
	
	public void afficherCreationCompte() {
		System.out.println("Le numéro de compte qui vous est attribué est le suivant : "+ num_compte );
	}
	public void afficherSolde() {
		System.out.println("Votre solde est de : " + solde + " € ");
	}
	public void afficherDetails() {
		System.out.println("Sur votre compte : "+ num_compte + " le solde est de : " + solde + " € ");
	}
	
	public String generate(int length) {
		String chars = "1234567890";
		StringBuilder cpt_gen = new StringBuilder(length);
		for (int x = 0; x < length; x++) {
			int i = (int) (Math.random() * chars.length());
			cpt_gen.append(chars.charAt(i));
		}
		return cpt_gen.toString(); 
	}
	
}
