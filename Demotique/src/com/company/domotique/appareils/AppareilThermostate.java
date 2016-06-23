package com.company.domotique.appareils;

/**
@author Ahmad J. 
@version 1.1
 */

public class AppareilThermostate extends AppareilElectrique {

	private int puissanceInstantanee = 0;
	private int incPuissance = 20;
	private int valeurThermostatMax = 0;
	private int valeurThermostat = 0;


	/**
	 * @param valeurThermostat : int, positive, <valeurThermostatMax
	 */
	public void setValeurThermostat(int valeurThermostat) {
		if (valeurThermostat>=0 && valeurThermostat<=valeurThermostatMax){
			this.valeurThermostat = valeurThermostat;
		}
		else {
			this.valeurThermostat=-1;
			System.err.println("La valeur du thermostat doit être comprise entre 0 et la valeur thermostat Max!");
		}
	}

	/**
	 * 
	 * @return La valeur du Thermostat à un instant t
	 */
	public int getValeurThermostat() {
		return valeurThermostat;
	}

	/**
	 * @return La valeur maximale du thermostat 
	 */
	public int getValeurThermostatMax() {
		return valeurThermostatMax;
	}


	/**
	 * 
	 * @param valeurThermostat : int, positive, > valeurThermostat
	 */
	public void setValeurThermostatMax(int valeurThermostatMax) {
		if (valeurThermostatMax>=0){
			this.valeurThermostatMax = valeurThermostatMax;
		}
		else {
			this.valeurThermostatMax=-1;
			System.err.println("La valeur du thermostat doit être comprise entre 0 et la valeur thermostat Max!");
		}
	}


	/**
	 * 
	 * @return La puissance de l'appareil à un instant t 
	 */
	public int getPuissanceInstantanee() {
		return puissanceInstantanee;
	}


	/**
	 * 
	 * @return La puissance incrémentée en fonction du thermostat(valeurThermostat)
	 */
	public int getIncPuissance() {
		return incPuissance;
	}

	/**
	 * Constructeur sans incPuissance utiliser dans la classe AppareilSecurise
	 * @param pMarque
	 * @param pModele
	 * @param pPuissanceMaxWatts
	 * @param valeurThermostatMax
	 */
	public AppareilThermostate(String pMarque, String pModele, int pPuissanceMaxWatts, int valeurThermostatMax) {
		super(pMarque, pModele, pPuissanceMaxWatts);
		this.valeurThermostatMax = valeurThermostatMax;
	}
	/**
	 * 
	 * @param pMarque String, Définie dans la classe Appareil
	 * @param pModele String, Définie dans la classe Appareil
	 * @param pPuissanceMaxWatts int, Définie dans la classe AppareilElectrique
	 * @param incPuissance int, locale, puissance incrémenter en fonction du thermostat (valeurThermostat)
	 * @param valeurThermostatMax int, locale, Valeur thermostat maximale
	 */
	public AppareilThermostate(String pMarque, String pModele, int pPuissanceMaxWatts, int incPuissance,
			int valeurThermostatMax) {
		super(pMarque, pModele, pPuissanceMaxWatts);
		this.incPuissance = incPuissance;
		this.valeurThermostatMax = valeurThermostatMax;
	}

	/**
	 * @TODO
	 */
	public int getConsommation() {
		if (isEnMarche()) {
			puissanceInstantanee = valeurThermostat * incPuissance;
			return puissanceInstantanee;
		} else {
			return 0;
		}
	}

	public int incrementerThermostat() {
		if(this.valeurThermostat<this.valeurThermostatMax){
			this.valeurThermostat +=1;
		}
		return this.valeurThermostat;
	}

	public void demarrer() {
		super.isEnMarche=true;
	}//demarrer

	/**
	    arrete l'appareil
	 */
	public void arreter() {
		super.isEnMarche=false;
		this.setValeurThermostat(0);
		System.out.println("L'appareil vient d'étre arrété; Le thermostat est éteint");
		System.out.println("Valuer thermostat = "+this.getValeurThermostat());
	}//arreter

	@Override
	public String toString() {
		return "AppareilThermostate [puissanceInstantanee=" + puissanceInstantanee + ", incPuissance=" + incPuissance
				+ ", valeurThermostatMax=" + valeurThermostatMax + ", valeurThermostat=" + valeurThermostat
				+ ", toString()=" + super.toString() + "]";
	}

}
