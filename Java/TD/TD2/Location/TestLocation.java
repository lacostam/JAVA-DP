/**
* @author Richefeu
* @version 0.1 : Date : Fri Jan 14 18:05:38 CET 2022
*
*/


package location;

import java.util.*;


public class TestLocation {

	public static void main(String [] args){

		Louable v1 = new Voiture(100);
		Louable v2 = new Voiture(50);
		Louable v3 = new Voiture(60);
		Louable v4 = new Voiture(30);


		Louable c1 = new Chambre(49, 001);
		Louable c2 = new Chambre(100, 002);
		Louable c3 = new Chambre(1000, 003);
		Louable c4 = new Chambre(10, 004);
		Louable c5 = new Chambre(60, 005);

		List<Louable> listLouable = new ArrayList<Louable>();
		LouableManager l = new LouableManager();

		listLouable.add(v1);
		listLouable.add(v2);
		listLouable.add(v3);
		listLouable.add(v4);

		listLouable.add(c1);
		listLouable.add(c2);
		listLouable.add(c3);
		listLouable.add(c4);
		listLouable.add(c5);

		Personne unePersonne = new Personne("Matteo", 21, 2500, true);
		Personne uneAutrePersonne = new Personne("Arthur", 17, 100, false);



		 System.out.println(l.filtreLouable(listLouable, unePersonne));
		 System.out.println(l.filtreLouable(listLouable, uneAutrePersonne));

	}
}
