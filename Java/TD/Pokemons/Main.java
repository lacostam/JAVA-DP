/**
* @author Richefeu
* @version 0.1 : Date : Fri Jan 07 16:45:54 CET 2022
*
*/



public class Main{

	public static void main(String [] args ){

		Sportif unSportif = new Sportif("PIKACHU", 3, 2, 10, 70);
		Marin unMarin = new Marin("TORTANK", 100, 5);
		Casanier unCasanier = new Casanier("METAMORPH", 300, 1, 20, 215);
		Croisiere unCroisiere = new Croisiere("TIPLOUF", 3, 5);

		System.out.println(unSportif);
		System.out.println(unMarin);
		System.out.println(unCasanier);
		System.out.println(unCroisiere);
	}
}
