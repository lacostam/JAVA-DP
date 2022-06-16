/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Sun Jan 16 15:12:36 CET 2022
*
*/
abstract class Strategie {

	protected Joueur[] joueur;
	protected int nombreJoueur;
	protected int numJoueur;

	public Strategie(Joueur[] j, int nbJ, int num){
		this.joueur = j;
		this.nombreJoueur = nbJ;
		this.numJoueur = num;
	}

	abstract int changePosition(int p);

	@Override
	public String toString(){
		return "la stratégue de type ";
	}
}
