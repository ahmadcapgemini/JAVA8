package appareil;


public class Lanceur {

	public static void main(String [] args){

		System.out.println("Bonjour");
		AppareilElectrique ordinateur= new AppareilElectrique("DELL","GX100",500);
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



		//Tentative d'incrementation du thermostat superieure à son thermostat maxi (12)
		for (int i=0; i<12; i++) {
			chauffage.incrementerThermostat();	
		}
		// mise en marche de l'ordinateur
		ordinateur.demarrer();

		//etc...................................


		System.out.println("Au revoir!");

	}

}

