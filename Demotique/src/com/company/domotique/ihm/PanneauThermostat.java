package com.company.domotique.ihm;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.company.domotique.appareils.AppareilThermostate;


public class PanneauThermostat extends PanneauAppareil implements ActionListener{
	protected AppareilThermostate appareilThermostate;
	private JLabel lblThermostat;
	private JButton btnAugmenterThermostat;
	private JButton btnDiminuerThermostat;

	private int thermostatCourant;

	public PanneauThermostat(AppareilThermostate pAppThermo, PanneauCompteur pPanoC){
		super(pAppThermo, pPanoC);
		appareilThermostate = pAppThermo;

		//  bouton diminuer
		btnDiminuerThermostat = new JButton("-");
		btnDiminuerThermostat.setEnabled(true);  //pourquoi?
		btnDiminuerThermostat.addActionListener(this);
		
		add(btnDiminuerThermostat);

		//creer label Thermostat
		thermostatCourant = pAppThermo.getValeurThermostat();
		lblThermostat=new JLabel();
		afficherThermostat();	
		add(lblThermostat);
		//lblThermostat.setPreferredSize(new Dimension(20,30));


		//creer  bouton augmenter
		btnAugmenterThermostat = new JButton("+");
		btnAugmenterThermostat.setEnabled(false);//pourquoi?
		btnAugmenterThermostat.addActionListener(this);
		add(btnAugmenterThermostat);
	}





	public void actionPerformed(ActionEvent evt){
		// On laisse traiter les actions demarrer et arreter au parent
		super.actionPerformed(evt);

		AppareilThermostate cetAppareil=(AppareilThermostate)appareil;

		Object src = evt.getSource();
		if (src == btnDemarrer) {
			cetAppareil.demarrer();
			cetAppareil.setValeurThermostat(cetAppareil.getValeurThermostatMax());
		}
		else if (src == btnArreter) {
			cetAppareil.arreter();
		}
		else if(src == btnAugmenterThermostat){
			cetAppareil.incrementerThermostat();
		}
		else if (src == btnDiminuerThermostat){
			cetAppareil.decrementerThermostat();
		}//btnDiminuerThermostat
	}//actionPerformed(ActionEvent evt)




	private void afficherThermostat(){
		AppareilThermostate  cetAppareil=(AppareilThermostate)appareil;
		String s=new Integer(cetAppareil.getValeurThermostat()).toString();
		if (s.length()<2)s="0"+s;
		lblThermostat.setText(s);
		//TOTO setter s comme label IHM
		//lblThermostat.set....;
	}

	//En cas de disjonctage, permet d initialiser les elements du pano
	public void initPano() {
		super.initPano();
		btnAugmenterThermostat.setEnabled(false);
		btnDiminuerThermostat.setEnabled(false);
		lblThermostat.setText("0");	
	}
}//PanneauAppareil