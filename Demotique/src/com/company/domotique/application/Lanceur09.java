package com.company.domotique.application;

import java.util.ArrayList;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.appareils.AppareilThermostate;
import com.company.domotique.appareils.Compteur;
import com.company.domotique.exception.CompteurADisjoncteException;
import com.company.domotique.ihm.CadreGeneral;
import com.company.domotique.ihm.Horloge;

public class Lanceur09 {

		
	public static void main(String[] args) throws CompteurADisjoncteException {
	
		ArrayList alAppElec = new ArrayList();
		ArrayList alAppThermos = new ArrayList();
		

		AppareilElectrique unOrdinateur = new AppareilElectrique("DELL","GX100",500);
		AppareilThermostate unMicroOnde = new AppareilThermostate("Philips","mod123",250);
		Compteur unCompteurEDF = new Compteur("", "", 1250); 
		Horloge uneHorloge = new Horloge ();

		
		unCompteurEDF.brancher(unOrdinateur);
		unCompteurEDF.brancher(unMicroOnde);
		unOrdinateur.arreter();
		unMicroOnde.arreter();
		
		
		CadreGeneral monInterface = new CadreGeneral(unOrdinateur, unMicroOnde, unCompteurEDF, uneHorloge);	
		
	}
}
