package com.company.domotique.appareils;


public class AppareilElectrique extends Appareil implements ConsommateurDeCourant {

	protected int iPuissanceMaxWatts=0;
	protected boolean isEnMarche=false;
	protected boolean isSousTension = false;
	protected boolean isBranche=false;


	//Constructeur
	public AppareilElectrique(String pMarque,String pModele, int pPuissanceMaxWatts){
		super(pMarque, pModele);
		iPuissanceMaxWatts=pPuissanceMaxWatts;
		isEnMarche=false;
	}// constructeur



	public void setPuissanceMaxWatts(int pPuissanceMaxWatts) {
		iPuissanceMaxWatts = pPuissanceMaxWatts;
	} // set
	
	
	public int getPuissanceMaxWatts() {
		return iPuissanceMaxWatts;
	} // get


	public void setIsEnMarche(boolean pOnOff) {
			isEnMarche = pOnOff ;
	} // set
	public boolean isEnMarche() {
			return isEnMarche;
	} // get


	/**
		 met l'appareil en marche
	*/
    public void demarrer() {
	   isEnMarche=true;
	   System.out.println(this.getMarque()+" vient d'être allumé");
    }//demarrer

   /**
    arrete l'appareil
   */
   public void arreter() {
   	   isEnMarche=false;
   	   System.out.println(this.getMarque()+" vient d'être étient");
   }//arreter

	/**
	  retourne la consommation de l'appareil
	*/
	public int  getConsommation(){
		  if (isEnMarche==true)
		  		return iPuissanceMaxWatts;
		  else
		  		return 0;
	}//getConsommation



	@Override
	public String toString() {
		return "AppareilElectrique [iPuissanceMaxWatts=" + iPuissanceMaxWatts + ", isEnMarche=" + isEnMarche
				+ ", isSousTension=" + isSousTension + ", isBranche=" + isBranche + ", getMarque()=" + getMarque()
				+ ", getModele()=" + getModele() + "]";
	}





}
