package com.company.domotique.application;



import com.company.domotique.appareils.AppareilSecurise;


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
		AppareilSecurise microOnde= new AppareilSecurise("Philips", "mod123", 250, 10, false);
		AppareilSecurise microOnde2= new AppareilSecurise("Moulinex", "v32", 350, 10, false);
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
		
		
	

		
		
	
	
	}

	
}


