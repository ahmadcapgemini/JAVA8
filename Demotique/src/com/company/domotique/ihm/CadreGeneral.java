
package com.company.domotique.ihm;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.appareils.AppareilThermostate;
import com.company.domotique.appareils.Compteur;


public class CadreGeneral extends JFrame {
	
	private AppareilElectrique monAppElec;
	private AppareilThermostate monAppThermos;
	private Compteur monCompteur;
	private Horloge monHorloge;
	
	
	/*
	 * Construit graphiquement un nouveau panneau de commande
	 */

	public CadreGeneral(AppareilElectrique pAppElec, AppareilThermostate pAppThermos, Compteur pCompteur, Horloge pHorloge) {
		
		monAppElec = pAppElec;
		monAppThermos = pAppThermos;
		monCompteur = pCompteur;
		monHorloge = pHorloge;
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().setBackground(new Color(125,204,204));
		
		PanneauCompteur unPanoC=new PanneauCompteur(monCompteur);		
		PanneauAppareil unPanoE=new PanneauAppareil(monAppElec, unPanoC);		
		PanneauThermostat unPanoT=new PanneauThermostat(monAppThermos, unPanoC);
		Horloge uneHorloge = new Horloge();
		unPanoC.abonnement(unPanoE, unPanoT);	
		Thread th = new Thread(uneHorloge);
		th.start();

		getContentPane().add(unPanoE);
		getContentPane().add(unPanoT);
		getContentPane().add(unPanoC);	
		getContentPane().add(uneHorloge);	
	
		setSize(550,200);
		setVisible(true);
	}

}
