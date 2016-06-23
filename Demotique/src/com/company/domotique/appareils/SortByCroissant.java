package com.company.domotique.appareils;

import java.util.Comparator;

public class SortByCroissant implements Comparator<AppareilElectrique> {
	
		Bordereau bordereau1 = new Bordereau();
		
		
		
	public int compare (AppareilElectrique appareilElectrique1, AppareilElectrique appareilElectrique2){
		
		String chaine1;
		String chaine2;
		bordereau1.add(appareilElectrique1);
		bordereau1.add(appareilElectrique2);
		//chaine1 = bordereau1.afficher(appareilElectrique1);
		//chaine2 = bordereau1.afficher(appareilElectrique2);
		return 1;
	}

}
