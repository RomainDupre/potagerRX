package src;/*
 * To change this template, choose src.Tools | Templates
 * and open the template in the editor.
 */
import src.Modele.Modele;

import javax.swing.*;

/**
 *
 * @author frederic
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){

				Modele m = new Modele();
				Vue fenetre = new Vue(m);
				m.addObserver(fenetre);
				fenetre.setVisible(true);//On la rend visible
			}
		});
	}

}
