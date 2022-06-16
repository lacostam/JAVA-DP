/**
* @author Ricehfeu
* @version 0.1 : Date : Wed Mar 09 13:35:15 CET 2022
*
*/
import java.util.*;

public class BaseDonnees <T extends Comparable<T>>{

	private StrategieTri strat;
	private List<T> donnees ;

	public BaseDonnees(StrategieTri s){
		this.strat = s;
		donnees = new LinkedList<T>();
	}

	public void afficheDonneesTriees(){

		for(T elem : this.strat.trie(this.donnees)){
			System.out.println("\t\t"+elem);
		}
	}

	public void afficheDonneesNonTriees(){

		for(T elem : this.donnees){
			System.out.println("\t\t"+elem);
		}
	}

	public void ajouter(T elem){
		this.donnees.add(elem);
	}

}
