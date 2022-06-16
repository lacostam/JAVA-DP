/**
* @author Richefeu
* @version 0.1 : Date : Tue Jan 25 13:59:01 CET 2022
*
*/

/**
 * Classe pemettant de mettre en place un Seletionneur sur le deces ou non de l'auteur du document
 * @see Selectionneur
*/
public class AuteurVivantSelectionneur implements Selectionneur {

	private int date;


	/**
	 * Constructeur
	*/
	public AuteurVivantSelectionneur (int uneDate){
		this.date = uneDate;
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
		if ((d.getAuteur().getDeces() == null)){
			return true;
		}else{
			return d.getAuteur().getDeces().getAnnee() > this.date;
		}
	}
}
