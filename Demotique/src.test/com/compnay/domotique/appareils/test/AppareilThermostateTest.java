package com.compnay.domotique.appareils.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.company.domotique.appareils.AppareilThermostate;

public class AppareilThermostateTest {

	@Test
	public void testIncrementerThermostat() {
		//fail("Not yet implemented");
		AppareilThermostate chauffage = new AppareilThermostate("Philips", "4315", 1000, 100, 10);
		chauffage.demarrer();
		
		int valeurThermostat = 9; 
		chauffage.setValeurThermostat(valeurThermostat);  
		chauffage.incrementerThermostat();
		int nouvelleValeurThermostat = chauffage.getValeurThermostat();
		
		//à vérifier que novuelleValeur = 0+1;
		assertEquals(valeurThermostat+1, nouvelleValeurThermostat);
	}


	@Test
	public void testIncrementerThermostatWhenThermostatMax() {
		AppareilThermostate chauffage = new AppareilThermostate("Philips", "4315", 1000, 100, 10);
		chauffage.demarrer();
		
		int valeurThermostat = chauffage.getValeurThermostatMax(); 
		chauffage.setValeurThermostat(valeurThermostat);  
		chauffage.incrementerThermostat();
		int nouvelleValeurThermostat = chauffage.getValeurThermostat();
		
		//à vérifier que la valeur n'a pas changé 
		assertEquals(valeurThermostat, nouvelleValeurThermostat);
	
	}
	
	@Test
	public void testIncrementerThermostatWhenThermostatIsStop() {
		AppareilThermostate chauffage = new AppareilThermostate("Philips", "4315", 1000, 100, 10);
		chauffage.arreter();
		
		int valeurThermostat = chauffage.getValeurThermostatMax(); 
		chauffage.setValeurThermostat(valeurThermostat);  
		chauffage.incrementerThermostat();
		int nouvelleValeurThermostat = chauffage.getValeurThermostat();
		
		//à vérifier que la valeur n'a pas changé 
		assertEquals(valeurThermostat, nouvelleValeurThermostat);
	
	}
	
	@Test
	public void testIncrementerThermostatWhenThermostatMaxIsSetNegatif() {
		AppareilThermostate chauffage = new AppareilThermostate("Philips", "4315", 1000, 100, -111);
		chauffage.demarrer();
		
		int valeurThermostat = chauffage.getValeurThermostatMax(); 
		chauffage.setValeurThermostat(valeurThermostat);  
		chauffage.incrementerThermostat();
		int nouvelleValeurThermostat = chauffage.getValeurThermostat();
		
		//à vérifier que la valeur n'a pas changé 
		assertEquals(-1, nouvelleValeurThermostat);
	
	}
}
