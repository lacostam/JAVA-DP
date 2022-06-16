/**
* @author Richefeu
* @version 0.1 : Date : Wed Mar 09 13:36:07 CET 2022
*
*/

import java.util.*;

public class TriInsertion implements StrategieTri{

	@Override
	public <T extends Comparable<T>> List<T> trie(List<T> donnees){

		int taille = donnees.size();
		int i, j;
		T ind;

    	for (i = 1; i < taille; i++){

       		ind = donnees.get(i);

        	j = i-1;

            while((donnees.get(j).compareTo(donnees.get(i)) > 0)){
            	Collections.swap(donnees, j+1, j);
                j--;
            }

            Collections.swap(donnees, j+1, i);
        }
		return donnees;
	}
}
