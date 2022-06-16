/**
* @author Richefeu
* @version 0.1 : Date : Wed Mar 30 15:43:30 CEST 2022
*
*	Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*
*/


public abstract class Visiteur {

	/**jeu du visiteur*/
	protected JeuDeLaVie jeu;

	/**Nom du visiteur*/
	protected String nom;

	/**
	 * Constructeur de visiteur
	 * @param unJeu le jeu du visiteur
	*/
	public Visiteur(JeuDeLaVie unJeu){
		this.jeu = unJeu;
	}

	/**
	 * Methode permettant de visiter une cellule vivante
	 * @param cellule a visiter
	*/
	public abstract void visiteCelluleVivante(Cellule cellule);


	/**
	 * Methode permettant de visiter une cellule morte
	 * @param cellule a visiter
	*/
	public abstract void visiteCelluleMorte(Cellule cellule);


	/**
	 * Methode d'acces au nom du visiteur
	 * @return nom
	*/
	public String getNom(){
		return this.nom;
	}
}
