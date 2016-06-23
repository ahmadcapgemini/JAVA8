package com.company.domotique.appareils;

import java.util.Comparator;

public class SortByCroissant implements Comparator<Object> {

	public int compare(Object pObj1, Object pObj2) {
		String marque1 = ((AppareilElectrique) pObj1).getMarque();
		String marque2 = ((AppareilElectrique) pObj2).getMarque();
		String modele1 = ((AppareilElectrique) pObj1).getModele();
		String modele2 = ((AppareilElectrique) pObj2).getModele();
		int puissanceMax1 = ((AppareilElectrique) pObj2).getPuissanceMaxWatts();
		int puissanceMax2 = ((AppareilElectrique) pObj2).getPuissanceMaxWatts();

		int resultat = (marque1.compareTo(marque2));
		
		if (marque1.equals(marque2)) {
			resultat = (modele1.compareTo(modele2));
			
			if (modele1.equals(modele2)) {
				
				if (puissanceMax1>puissanceMax2)resultat = 1;
				if (puissanceMax1==puissanceMax2)resultat = 0;
				if (puissanceMax1<puissanceMax2)resultat = -1;
				//resultat = Integer.compare(puissanceMax1, puissanceMax2);//synthaxe à optimiser

			}
		}
		return resultat;
	}

}
