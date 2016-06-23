package com.company.domotique.application;



import java.util.ArrayList;

import com.company.domotique.appareils.AppareilElectrique;
import com.company.domotique.appareils.AppareilSecurise;
import com.company.domotique.appareils.AppareilThermostate;
import com.company.domotique.appareils.Bordereau;
import com.company.domotique.appareils.Compteur;
import com.company.domotique.ihm.CadreGeneral;


public class Lanceur {

	public static void main(String [] args){

		
		/*AppareilSecurise micro_onde= new AppareilSecurise("Philips","mod123",250, 0);
		AppareilThermostate chauffage= new AppareilThermostate("Philips", "4315", 1000, 100, 10);


		// affichage de l'objet chauffage (methode toString appelee par defaut)
		//Verification de l'instanciation
		System.out.println(ordinateur);
		System.out.println(chauffage);





		//Mise en marche chauffage, reglage thermostat
		chauffage.demarrer();
		chauffage.setValeurThermostat(7);
		chauffage.getConsommation();

		System.out.println(chauffage);

		chauffage.incrementerThermostat();
		chauffage.getConsommation();
		System.out.println(chauffage);



		//Tentative d'incrementation du thermostat superieure Ã  son thermostat maxi (12)
		for (int i=0; i<12; i++) {
			chauffage.incrementerThermostat();	
		}
		// mise en marche de l'ordinateur
		ordinateur.demarrer();

		//etc...................................*/
		AppareilSecurise microOnde= new AppareilSecurise("Philips", "mod123", 100, 1, false);
		AppareilSecurise microOnde2= new AppareilSecurise("Moulinex", "v32", 500, 5, false);
		System.out.println("Bonjour");
		System.out.println("***********************");
		System.out.println(microOnde);
		System.out.println("***********************");
		System.out.println(microOnde2);
		System.out.println("***********************");
		
		System.out.println("***********************");
		microOnde.arreter();
		System.out.println("***********************");
		System.out.println("La consommation de votre micro_onde est : " + microOnde.getConsommation());
		System.out.println("***********************");
		microOnde.setValeurThermostat(4);
		microOnde.demarrer();
		System.out.println("La consommation de votre micro_onde est : " + microOnde.getConsommation()+ " quand le thermostat est à  :"+ microOnde.getValeurThermostat());
		System.out.println("***********************");
		microOnde.setSecuriteEnclenchee(true);
		System.out.println("La consommation de votre micro_onde est : " + microOnde.getConsommation()+ " quand le thermostat est à  :"+ microOnde.getValeurThermostat()+ " et la sécurité est déclenchée");
		System.out.println("***********************");
		System.out.println("Au revoir!");
		
		
		
		
		
		AppareilSecurise nouvelAppareil = new AppareilSecurise("Philips", "mod123", 900, 9, false);

		Bordereau testBordereau = new Bordereau();
		testBordereau.add(microOnde);
		testBordereau.add(microOnde2);
		testBordereau.add(nouvelAppareil);
		testBordereau.afficher();
		System.out.println("***********************");
		System.out.println("Après un tri par ordre croissant");
		
		testBordereau.trierCroissant();
		testBordereau.afficher();
		
		System.out.println("***********************");
		System.out.println("***********************");
		Compteur compteur = new Compteur("compteur", "modéle", 1000); //création compteur
		compteur.demarrer(); microOnde.demarrer(); microOnde2.demarrer(); nouvelAppareil.demarrer();//démarrage compteur et les trois appareils
		microOnde.setValeurThermostat(microOnde.getValeurThermostatMax());// initiation objets 
		microOnde2.setValeurThermostat(microOnde2.getValeurThermostatMax());
		nouvelAppareil.setValeurThermostat(nouvelAppareil.getValeurThermostatMax());
	
		compteur.brancher(microOnde);
		compteur.brancher(microOnde2);
		compteur.brancher(nouvelAppareil);
	
		
		System.out.println("***********************");
		System.out.println("***********************");
		
		
		
		
		
		
		
	
		/*ArrayList alAppElec = new ArrayList();
		ArrayList alAppThermos = new ArrayList();
		

		AppareilElectrique unOrdinateur = new AppareilElectrique("DELL","GX100",500);
		AppareilThermostate unMicroOnde = new AppareilThermostate("Philips","mod123",250);
		Compteur unCompteurEDF = new Compteur(1250);

		
		unCompteurEDF.brancher(unOrdinateur);
		unCompteurEDF.brancher(unMicroOnde);
			
		CadreGeneral monInterface = new CadreGeneral(unOrdinateur, unMicroOnde, unCompteurEDF);	*/
		
	
	
	}

	
}


