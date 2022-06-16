/**
* @author Richefeu
* @version 0.1 : Date : Wed Mar 30 14:39:30 CEST 2022
*
*	Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*/
public class CommandeVit extends Commande {

	/**
	 * Constructeur de la commande avec une param la cellule qui va recevoir la commande
	 * @param c la cellule
	*/
	public CommandeVit(Cellule c){
		super(c);
	}


	/**
	 * declanche l'execution vit a la cellule
	*/
	public void executer(){
		this.cellule.vit();
	}
}
