/**
* @author Richefeu
* @version 0.1 : Date : Fri Feb 04 13:40:05 CET 2022
*
*/
public abstract class Case {

	private int i;
	private int j;

	/**
	 * Conctructeur de la classe Case, permettant de creer un case
	*/
	public Case(int i , int j){
		this.i = i;
		this.j = j;
	}


	/**
	 * Permet de saloir si la case est un obstable
	 *
	 * @return vrai ou faux
	*/
	public boolean  estObstacle(){
		return false;
	}
}
