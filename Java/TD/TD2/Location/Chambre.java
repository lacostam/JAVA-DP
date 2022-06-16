/**
* @author Richefeu
* @version 0.1 : Date : Fri Jan 14 17:36:25 CET 2022
*
*/

package location;

public class Chambre implements Louable{

	private float prix;
	private int numChambre;


	public Chambre(float unPrix, int unNum){
		this.prix = unPrix;
		this.numChambre = unNum;
	}

	public float prixLoacation(){
		return prix;
	}

	public boolean peutEtreLoue(Personne loueur){
		return ((loueur.getAge() > 18) && (this.prix > loueur.getSalaire() * 0.20) && (loueur.getSalaire() > 100));
	}

	public String toString(){
		return this.numChambre + " ";
	}

}
