/**
* @author Richefeu
* @version 0.1 : Date : Sat Jan 29 15:07:04 CET 2022
*
*/

/**
 * a un nom, plus une fonction attribué a une fonction, doit connaitre une Unité centrale
*/



public abstract class ToucheFonction extends Touche  {

	protected UniteCentrale uc;
	protected String nomFonction;

	public ToucheFonction(String unNom, UniteCentrale uneUc, String fonction){
		super(unNom);
		this.uc = uneUc;
		this.nomFonction = fonction;
	}


}
