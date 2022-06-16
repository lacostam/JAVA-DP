/**
* @author Richefeu
* @version 0.1 : Date : Fri Jan 14 17:32:08 CET 2022
*
*/

package location;

public class Voiture implements Louable {

	private float prix;

	public Voiture(float unPrix){
		this.prix = unPrix;
	}

	public float prixLoacation(){
		return prix;
	}

	public boolean peutEtreLoue(Personne loueur){
		return ((loueur.hasPermis()) && (this.prix > loueur.getSalaire() * 0.50));
	}
	public String toString(){
		return this.prix + "€";
	}

}
