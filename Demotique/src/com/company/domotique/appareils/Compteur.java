package com.company.domotique.appareils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

import com.company.domotique.exception.CompteurADisjoncteException;

public class Compteur extends AppareilElectrique implements ProducteurDeCourant {

	private int puissanceInstantanee = 20;
	private Collection<ConsommateurDeCourant> mesAppareilsBranches = new ArrayList<ConsommateurDeCourant>();
	private Vector<ConsommateurDeCourant> mesAppareilsBranchesVector = new Vector<ConsommateurDeCourant>();





	public Compteur(String pMarque, String pModele, int pPuissanceMaxWatts) {
		super(pMarque, pModele, pPuissanceMaxWatts);
	}

	@Override
	public void brancher(ConsommateurDeCourant cc)throws CompteurADisjoncteException {

		if (this.isEnMarche) {

			this.mesAppareilsBranchesVector.add(cc);
			int maPuissanceInstantanee= this.puissanceInstantanee + cc.getConsommation();
			if (this.iPuissanceMaxWatts < maPuissanceInstantanee) {
				this.disjoncter();
				throw new CompteurADisjoncteException(this, maPuissanceInstantanee);
			}
			else {
				this.puissanceInstantanee = maPuissanceInstantanee;
			}
		}

	}

	public void disjoncter() {
		// mesAppareilsBranches.iterator(); // pour ArrayList
		for (Enumeration<ConsommateurDeCourant> e = mesAppareilsBranchesVector.elements(); e.hasMoreElements();) {
			AppareilElectrique appareilBranche = new AppareilElectrique("pMarque", "pModele", -1);
			appareilBranche = (AppareilElectrique) e.nextElement(); // (AppareilElectrique)correspond au cast	
			System.out.println("Appareil :" + appareilBranche.getMarque()+" est allumé");
			appareilBranche.arreter();
			System.err.println("Appareil :" + appareilBranche.getMarque()+ "est arrété car le disjoncteur a sauté!");
		}



	}



}
