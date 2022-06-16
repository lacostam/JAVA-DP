/**
* @author Richefeu
* @version 0.1 : Date : Wed Mar 09 13:35:38 CET 2022
*
*/

import java.util.*;
import java.util.Collections;

public class TriJava implements StrategieTri{

	@Override
	public <T extends Comparable<T>> List<T> trie(List<T> donnees){

		Collections.sort(donnees);
		return donnees;
	}
}
