package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgave6 {

	public static void main(String[] args) {
		
		int bruttoIntekt = Integer.parseInt(showInputDialog("skriv inn brutto lønn"));
		double trinnSkatt;
		if(bruttoIntekt>=0 && bruttoIntekt <= 164100) {
		trinnSkatt = bruttoIntekt*0;
		} else if (bruttoIntekt>= 164101 && bruttoIntekt <=230950) {
			trinnSkatt = bruttoIntekt*0.0093;
		} else if (bruttoIntekt>= 230951 && bruttoIntekt <=580650) {
			trinnSkatt = bruttoIntekt*0.0241;
		}  else if (bruttoIntekt>= 580601 && bruttoIntekt <=934050) {
			trinnSkatt = bruttoIntekt*0.1152;
		}  else if (bruttoIntekt>= 934051 ) {
			trinnSkatt = bruttoIntekt*0.1452;
		} else {
			showMessageDialog(null, "beløpet er ikke gylig");
			trinnSkatt = 0; 
			
		}
		
		showMessageDialog(null, " skatten som skal betalest er " + trinnSkatt + " kroner ");
	}

}
