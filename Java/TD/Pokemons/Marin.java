/**
*   Fichier permettant de mettre en place un l'exercice des pokemons
* 		Ici les caractéristiques propre au pokemons marin
* @author Richefeu
* @version 0.1 : Date : Fri Jan 07 16:03:40 CET 2022
*
*/
public class Marin extends Pokemon{


	/*
	 * Variable de classe en protected
	*/
	protected int nageoires;




	/*
	 * Constructeur de la class Marin
	 *
	 * @pram unNom qui est le nom du pokemeon
	 * @param unPoids qui est le poids du pokemon
	 * @param nbNageoires qui corresponds au nombres de nageoires du pokemon
	 * @return
	*/
	Marin(String unNom, int unPoids, int nbNageoires){

		super(unNom, unPoids);
		nageoires = nbNageoires;
	}



	/*
	 * Calcul de la vitesse des pokemon Marin
	 *
	 * @return la vitesse de course
	*/
	public float vitesse(){
		return (2 * nageoires)/poids;
	}


	/*
	 * Redefinition de toString pour l'affiche de notre pokemon Marin
	 *
	 * @return La description du pokemon
	*/
	public String toString(){
		return super.toString() + " , j'ai " + nageoires + " nageoire(s) Donc je nage a " + vitesse() + "km/h ";
	}



}
