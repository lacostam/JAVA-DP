/**
* @author Richefeu
* @version 0.1 : Date : Tue Jan 25 14:04:35 CET 2022
*
*/
/**
 * Classe pemettant de mettre en place un Seletionneur sur un mot dans le titre du livre
 * @see Selectionneur
*/
public class MotDansTitreSelectionneur implements Selectionneur {


	private String s;


	/**
	 * Constructeur
	*/
	public MotDansTitreSelectionneur (String unMot){
		this.s = unMot;
	}


	/**
	 * Redifinition de estSatisfaitPar
	 *
	 * @param d qui est un document
	 * @return true or false
	 * @see Selectionneur
	*/
	@Override
	public boolean estSatisfaitPar(Document d){
		return d.getTitre().indexOf(this.s) != -1;
	}
}
