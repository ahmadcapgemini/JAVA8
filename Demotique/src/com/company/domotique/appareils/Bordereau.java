package com.company.domotique.appareils;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Bordereau extends Vector<AppareilElectrique> {

	/**
	 *  todo
	 */
	private static final long serialVersionUID = 1L;

	public void afficher (){
		for (Enumeration<AppareilElectrique> e = this.elements(); e.hasMoreElements();)
		       System.out.println(e.nextElement());
	}
	
	
	/**
	 * creation d'un nouveau Vector vide
	 */
	public Bordereau() {
		super();
	
	}

	public void trierCroissant (){ 
		Collections.sort(this, new SortByCroissant());
		
	}

}
