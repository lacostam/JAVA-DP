/**
* @author Richefeu
* @version 0.1 : Date : Fri Mar 25 13:40:34 CET 2022
*
* Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*/


/**
 * Interface permettant la gestion des etats des différentes cellules
*/
public interface CelluleEtat {


	/**
	 * Permettant de dire a une cellulle qu'elle est en vie
	 * @return CelluleEtat
	*/
	public CelluleEtat vit();


	/**
	 * Permettant de dire a une cellulle qu'elle est morte
	 * @return CelluleEtat
	*/
	public CelluleEtat meurt();


	/**
	 * Permettant connaitre l'eata de la cellule
	 * @return boolean
	*/
	public boolean estVivante();


	/**
	 * Methode permettant d'accepeter le visiteur
	 *
	 *  @param visiteur le visiteur
	 *  @param cellule la cellule
	*/
	public void accepte(Visiteur visiteur, Cellule cellule);
}
