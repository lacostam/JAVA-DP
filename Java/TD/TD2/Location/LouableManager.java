/**
* @author Richefeu
* @version 0.1 : Date : Fri Jan 14 17:41:18 CET 2022
*
*/
package location;
import java.util.*;


public class LouableManager{

	//A revoir evoqué en TD de list avec un type, a revoir/ corriger si pas bon

	public List<Louable> filtreLouable(List<Louable> louables, Personne unePersonne){

		List<Louable> res = new ArrayList<Louable>();

		for(Louable bien : louables){
			if(bien.peutEtreLoue(unePersonne)){
				res.add(bien);
			}else{
				System.out.println(bien + "Non Louable par "+  unePersonne);
			}
		}//fin for

		return res;
	}

}
