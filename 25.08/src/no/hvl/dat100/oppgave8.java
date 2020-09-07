package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgave8 {

	public static void main(String[] args) {
		int heltall = 0;
		boolean valid = false;
		
		while (!valid) {
			heltall = Integer.parseInt(showInputDialog("skriv inn et heltall"));
			if(heltall>0) {
				valid = true;
			} else {
				showMessageDialog(null, "skriv in et heltall >0");
			}
		}
		int sum = 1;
		
		while (heltall>1) {
			sum *=heltall;
			heltall--;
		};
		
		showMessageDialog(null, sum);
		
	}

}
