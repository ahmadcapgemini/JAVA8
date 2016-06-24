package com.company.domotique.ihm;

import java.time.LocalTime;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Horloge extends JPanel implements Runnable {
	private JLabel	labCpt = new JLabel("Il est :   ");
	public Thread myThread;
	

	public Horloge() {
		add(labCpt);
			
		myThread = new Thread(this);
		// TODO demarrer le thread 
		
	}


	public void run() {
		System.out.println("coucou");
		//TODO
		
		
		while (true) {
			
			LocalTime localTime = LocalTime.now();
			
				

				try {
					
					myThread.sleep(1000);
					
					labCpt.setText("Il est: "+localTime.getHour()+":"+localTime.getMinute()+":"+localTime.getSecond());
				} 
				catch (InterruptedException e){
					e.toString();
				}

		} // while
	}


	


} // class Horloge