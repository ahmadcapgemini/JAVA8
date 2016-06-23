package com.company.domotique.appareils;

public class AppareilSecurise extends AppareilThermostate {

	public AppareilSecurise(String pMarque, String pModele, int pPuissanceMaxWatts, int valeurThermostatMax,
			boolean isSecuriteEnclenchee) {
		super(pMarque, pModele, pPuissanceMaxWatts, valeurThermostatMax);
		this.isSecuriteEnclenchee = isSecuriteEnclenchee;
	}

	public AppareilSecurise(String pMarque, String pModele, int pPuissanceMaxWatts, int valeurThermostatMax) {
		super(pMarque, pModele, pPuissanceMaxWatts, valeurThermostatMax);
	}

	private boolean isSecuriteEnclenchee = false;

	public void demarrer() {
		if (isSecuriteEnclenchee == false) {
			super.isEnMarche = true;
			System.out.println("La securit� n'est pas enclench�e!");
			System.out.println("l'appareil vient d'�tre d�marr�");
		} else {
			super.isEnMarche = true;
			isSecuriteEnclenchee = false;
		}
	}// demarrer

	public void desenclencheSecurite() {
		isSecuriteEnclenchee = false;

	}

	public void enclencheSecurite() {
		isSecuriteEnclenchee = true;
		this.arreter();
		System.out.println("L'appareil vient d'�tre arr�t� � cause de l'enclenchement de la securit�");

	}

	public boolean isSecuriteEnclenchee() {
		return isSecuriteEnclenchee;
	}

	public void setSecuriteEnclenchee(boolean isSecuriteEnclenchee) {
		this.isSecuriteEnclenchee = isSecuriteEnclenchee;
		if (isSecuriteEnclenchee == true) {
			this.setValeurThermostat(0);
			System.out.println("L'appareil vient d'�tre arr�t�; Le thermostat est �teint");
			System.out.println("Valuer thermostat = " + this.getValeurThermostat());
		}
	}

	@Override
	public String toString() {
		return "AppareilSecurise [Securit� Enclench�e=" + isSecuriteEnclenchee + ", Valeur du Thermostat Max="
				+ getValeurThermostatMax() + ", Puissance=" + getPuissanceMaxWatts() + ", Marque=" + getMarque()
				+ ", Modele=" + getModele() + "]";

	}

}
