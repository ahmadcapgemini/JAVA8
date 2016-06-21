package com.company.domotique.appareils;

public abstract class Appareil {

	private String marque;
	private String modele;
	public Appareil(String p_Marque,String p_Modele){
		marque= p_Marque;
		modele= p_Modele;

	}// constructeur
	public String getMarque() {
		return marque;
	} // get
	public void setMarque(String pMa) {
		marque =pMa;
	} // set
	public String getModele() {
		return modele;
	} // get
	public void setModele(String pModele) {
		modele = pModele;
	} // set

}
