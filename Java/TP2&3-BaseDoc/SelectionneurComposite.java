/**
* @author Richefeu
* @version 0.1 : Date : Tue Jan 25 14:32:46 CET 2022
*
*/
import java.util.*;
/**
 * Class SelectionneurComposite permet d'effectuer des selctions multi-critères
 * implement Selectionneur
 * @see Selectionneur
*/
public class SelectionneurComposite implements Selectionneur{

	private List<Selectionneur> Selectionneurs;

	/**
	 * Constucteur de la classe SelectionneurComposite
	*/
	public SelectionneurComposite(){
		this.Selectionneurs = new ArrayList<Selectionneur>();
	}


	/**
	 * Methode pour ajouter un selectionneur a notre liste
	 *
	 * @param s qui est un selectionneur a ajouter
	*/
	public void add(Selectionneur s){
		this.Selectionneurs.add(s);
	}

	/**
	 * redefinition de la methode estSatisfaitPar
	 *
	 * @param d qui est un document
	 * @return true or false
	 * @see Selectionneur
	*/
	@Override
	public boolean estSatisfaitPar(Document d){

		Iterator<Selectionneur> i = this.Selectionneurs.iterator();

		while(i.hasNext()){

			if (i.next().estSatisfaitPar(d)){
				return true ;
			}
		}
		return false;
	}
}
