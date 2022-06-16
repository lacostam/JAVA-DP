/**
* @author Richefeu
* @version 0.1 : Date : Wed Mar 30 14:41:52 CEST 2022
*
*	Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*/
public class CommandeMeurt extends Commande {


	/**
	 * Constructeur de la commande avec une param la cellule qui va recevoir la commande
	 * @param c la cellule
	*/
	public CommandeMeurt(Cellule c){
		super(c);
	}


	/**
	 * declanche l'execution meut a la cellule
	*/
	public void executer(){
		this.cellule.meurt();
	}

}
