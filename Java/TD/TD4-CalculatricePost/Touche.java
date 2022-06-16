/**
* @author Richefeu
* @version 0.1 : Date : Sat Jan 29 15:06:53 CET 2022
*
*/

/**
 * A un nom et on peut appuyer sut un touche
*/
public abstract class Touche {

	protected String nom;

	public Touche(String unNom){
		this.nom = unNom;
	}

	public abstract void appuie();
}
