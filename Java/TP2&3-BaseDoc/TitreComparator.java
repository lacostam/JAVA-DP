/**
* @author Richefeu
* @version 0.1 : Date : Tue Jan 25 15:16:39 CET 2022
*
*/
import java.util.Comparator;

public class TitreComparator implements Comparator{


	/**
	 * redefinition de compare de la classe Comparator
	 * @return int
	 * @param o1 object a comparer
	 * @param o2 object a comparer
	*/
	@Override
	public int compare(Object o1, Object o2){
		if(o1 instanceof Document && o2 instanceof Document){
			Document d1 = (Document) o1;
			Document d2 = (Document) o2;

			return d1.getTitre().compareTo(d2.getTitre());
		}
		System.err.println("Les objets en param na sont pas des documents");
		return 0;
	}

}
