/**
* @author Richefeu
* @version 0.1 : Date : Sun Jan 16 14:33:54 CET 2022
*
*/

import java.util.*;

public class Joueur {

	private int position;
	private int numJoueur;
	private int dureeStrat;
	private Strategie strat;


	private java.util.Random rnd;


	public Joueur(int numJ, java.util.Random random){
		this.numJoueur = numJ;
		this.rnd = random;
		this.position = 0;

	}

	public void deplace(int d){
		this.dureeStrat --;
		this.position += strat.changePosition(d);
	}

	public boolean gagnant(){
		return(this.position>=500);
	}

	public void donneStrat(Strategie uneStrat){
		this.strat = uneStrat;
		//etre 2 et 5 tours
		this.dureeStrat = 2 + rnd.nextInt(4);
		System.out.println(" La Strategie du joueur" + this.numJoueur + " est " + this.strat.toString() + ". Pour une duree de" +this.dureeStrat);
	}

	public int getDureeStrat(){
		return this.dureeStrat;
	}
	public int getPosition(){
		return this.position;
	}
	public int getNumJoueur(){
		return this.numJoueur;
	}

}
