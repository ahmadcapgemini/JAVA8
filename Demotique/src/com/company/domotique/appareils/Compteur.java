package com.company.domotique.appareils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

public class Compteur extends AppareilElectrique implements ProducteurDeCourant {

	private int puissanceInstantanee = 20;
	private Collection<ConsommateurDeCourant> mesAppareilsBranches = new ArrayList<ConsommateurDeCourant>();
	private Vector<ConsommateurDeCourant> mesAppareilsBranchesVector = new Vector<ConsommateurDeCourant>();





	public Compteur(String pMarque, String pModele, int pPuissanceMaxWatts) {
		super(pMarque, pModele, pPuissanceMaxWatts);
	}

	@Override
	public void brancher(ConsommateurDeCourant cc) {

		if (this.isEnMarche) {

			this.mesAppareilsBranches.add(cc);
			int maPuissanceInstantanee= this.puissanceInstantanee + cc.getConsommation();
			System.out.println(maPuissanceInstantanee);

			if (this.iPuissanceMaxWatts < maPuissanceInstantanee) {
				this.disjoncter();

			}
			else {
				this.puissanceInstantanee = maPuissanceInstantanee;
				System.out.println(maPuissanceInstantanee);
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

	public int getEnergieFournie() {
		// TODO Auto-generated method stub
		return -1;
	}



}
