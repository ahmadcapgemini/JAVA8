package com.company.domotique.exception;

import com.company.domotique.appareils.Compteur;

public class CompteurADisjoncteException extends Exception{

	
	private int puissanceDemandee;
	private Compteur compteurEncause = new Compteur("", "",  -1);
	
	
	
	
	public CompteurADisjoncteException(Compteur compteurEncause, int puissanceDemandee) {
		super();
		this.puissanceDemandee = puissanceDemandee;
		this.compteurEncause = compteurEncause;

	}




	public int getPuissanceDemandee() {
		return puissanceDemandee;
	}









	public Compteur getCompteurEncause() {
		return compteurEncause;
	}





	


}
