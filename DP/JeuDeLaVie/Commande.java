/**
* @author Richefeu
* @version 0.1 : Date : Wed Mar 30 14:32:47 CEST 2022
*
*
* Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*/


public abstract class Commande {

	/**cellule sur laquelle executer la commande*/
	protected Cellule cellule;

	/**
	 * Constructeur de la commande avec une param la cellule qui va recevoir la commande
	 * @param c la cellule
	*/
	public Commande(Cellule c){
		this.cellule = c;
	}


	/**
	 * declanche l'execution  la commande
	*/
	public abstract void executer();
}
