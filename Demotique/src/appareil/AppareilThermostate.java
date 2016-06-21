package appareil;

public class AppareilThermostate extends AppareilElectrique {

	private int puissanceInstantanee = 0;
	private int incPuissance = 20;
	private int valeurThermostatMax = 0;
	private int valeurThermostat = 0;






	public void setValeurThermostat(int valeurThermostat) {
		this.valeurThermostat = valeurThermostat;
	}

	public int getValeurThermostat() {
		return valeurThermostat;
	}

	public int getValeurThermostatMax() {
		return valeurThermostatMax;
	}

	public void setValeurThermostatMax(int valeurThermostat) {
		this.valeurThermostatMax = valeurThermostat;
	}

	public int getPuissanceInstantanee() {
		return puissanceInstantanee;
	}

	public int getIncPuissance() {
		return incPuissance;
	}

	public AppareilThermostate(String pMarque, String pModele, int pPuissanceMaxWatts, int incPuissance,
			int valeurThermostatMax) {
		super(pMarque, pModele, pPuissanceMaxWatts);
		this.incPuissance = incPuissance;
		this.valeurThermostatMax = valeurThermostatMax;
	}

	public int getConsommation() {
		if (isEnMarche()) {
			puissanceInstantanee = valeurThermostat * incPuissance;
			return puissanceInstantanee;
		} else {
			return 0;
		}
	}

	public int incrementerThermostat(){
		if(this.valeurThermostat<this.valeurThermostatMax){
			this.valeurThermostat +=1;
		}
		return this.valeurThermostat;
	}

	@Override
	public String toString() {
		return "AppareilThermostate [puissanceInstantanee=" + puissanceInstantanee + ", incPuissance=" + incPuissance
				+ ", valeurThermostatMax=" + valeurThermostatMax + ", valeurThermostat=" + valeurThermostat
				+ ", toString()=" + super.toString() + "]";
	}




}
