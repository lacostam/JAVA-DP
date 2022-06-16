/**
* @author Richefeu
* @version 0.1 : Date : Tue Jan 25 13:34:17 CET 2022
*
*/

/**
 * Interface permettant de selectionner des documents en fonction de critères
*/
public interface Selectionneur {

	/**
	 * determine si un document est satisfait pas un critère
	 *
	 * @param d qui est en document
	 * @return true or false
	*/
	public boolean estSatisfaitPar(Document d);
}
