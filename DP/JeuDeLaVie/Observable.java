/**
* @author Richefeu
* @version 0.1 : Date : Fri Mar 25 16:21:49 CET 2022
*
* Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*/
public interface Observable {


	/**
	 * Attache un nouvel observateur
	 * @param o l'observateur a attacher
	*/
	public void attacheObservateur(Observateur o);

	/**
	 * Detache un nouvel observateur
	 *  @param o l'observateur a detacher
	*/
	public void detacheObservateur(Observateur o);

	/**notifie observateurs*/
	public void notifieObservateurs();
}
