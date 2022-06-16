/**
* @author Richefeu
* @version 0.1 : Date : Tue Jan 25 13:55:13 CET 2022
*
*/

/**
 * Classe pemettant de mettre en place un Seletionneur sur l'emprunt du livre
 * @see Selectionneur
*/
public class NonEmprunteSelectionneur implements Selectionneur {

	/**
	 * Redifinition de estSatisfaitPar
	 *
	 *  @param d qui est un document
	 * @return true or false
	 * @see Selectionneur
	*/
	@Override
	public boolean estSatisfaitPar(Document d){
		return d.getStatut();
	}
}
