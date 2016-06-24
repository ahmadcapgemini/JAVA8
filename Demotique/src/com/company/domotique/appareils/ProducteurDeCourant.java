package com.company.domotique.appareils;

import com.company.domotique.exception.CompteurADisjoncteException;

public interface ProducteurDeCourant {
	
	public void brancher(ConsommateurDeCourant cc) throws CompteurADisjoncteException;
	

}
