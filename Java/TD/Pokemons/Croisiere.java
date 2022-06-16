/**
*   Fichier permettant de mettre en place un l'exercice des pokemons
* 		Ici les caractéristiques propre au pokemons Croisiere
* @author Richefeu
* @version 0.1 : Date : Fri Jan 07 16:03:40 CET 2022
*
*/
public class Croisiere extends Marin{


		/*
	 * Constructeur de la class Marin
	 *
	 * @pram unNom qui est le nom du pokemeon
	 * @param unPoids qui est le poids du pokemon
	 * @param nbNageoires qui corresponds au nombres de nageoires du pokemon
	 * @return
	*/
	Croisiere(String unNom, int unPoids, int nbNageoires){

		super(unNom, unPoids, nbNageoires);
	}

	/*
	 * Calcul de la vitesse des pokemon Croisiere
	 *
	 * @return la vitesse de course
	*/
	public float vitesse(){
		return super.vitesse() / 2;
	}


	/*
	 * Redefinition de toString pour l'affiche de notre pokemon Croisiere
	 *
	 * @return La description du pokemon
	*/
	public String toString(){
		return super.toString() + " , j'ai " + nageoires + " nageoire(s) Donc je nage a " + vitesse() + "km/h\n";
	}



}
