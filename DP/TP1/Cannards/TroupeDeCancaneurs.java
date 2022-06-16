/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Wed Mar 09 10:55:40 CET 2022
*
*/
import java.util.*;

public class TroupeDeCancaneurs implements Cancaneur{

	private List<Cancaneur> troupe;

	public TroupeDeCancaneurs(){
		troupe = new LinkedList<Cancaneur>();
	}

	public void ajouter(Cancaneur c){
		this.troupe.add(c);
	}

	public void supprimer(Cancaneur c){
		this.troupe.remove(c);
	}

	@Override
	public void cancaner(){
		for(Cancaneur c : troupe){
			c.cancaner();
		}
	}
}
