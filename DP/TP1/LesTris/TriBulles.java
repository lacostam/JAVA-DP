/**
* @author Richefeu
* @version 0.1 : Date : Wed Mar 09 13:35:55 CET 2022
*
*/


import java.util.*;

public class TriBulles implements StrategieTri{

	@Override
	public <T extends Comparable<T>> List<T> trie(List<T> donnees){

		boolean echange;
		int i, butee = 1;

		do{
			for(i=0, echange=false; i < (donnees.size()-butee) ; i++){

				if( donnees.get(i).compareTo(donnees.get(i+1)) > 0 ){
					Collections.swap(donnees, i, i+1);
					echange = true;
				}
			}
			butee++;

		}while(echange != false);

		return donnees;
	}
}
