/**
* @author Richefeu
* @version 0.1 : Date : Tue Mar 22 09:16:55 CET 2022
*
*/
import java.util.*;

public class IterateurNull implements Iterator<Composant> {
	private int compteur;

	public IterateurNull(){
		this.compteur = 0;
	}

	@Override
	public boolean hasNext(){
		return false;
	}

	public Composant next() {
		return null;
	}
}
