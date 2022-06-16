/**
*   Fichier permettant de mettre en place un l'exercice des pokemons
* 		Ici les caractéristiques propre au pokemons terrestres
* @author Richefeu
* @version 0.1 : Date : Fri Jan 07 15:19:54 CET 2022
*
*/
public class Terrestre extends Pokemon {




	/*
	 * Variable de classe en pretected
	*/
	protected int pattes;
	protected float taille;






	/*
	 * Constructeur de la class Terrestre
	 *
	 * @pram unNom qui est le nom du pokemeon
	 * @param unPoids qui est le poids du pokemon
	 * @param nbPattes qui corresponds au nombres de pattes du pokemon
	 * @param uneTaille taille du pokemon
	 * @return
	*/
	Terrestre(String unNom, int unPoids, int nbPattes, float uneTaille){

		super(unNom, unPoids);
		pattes = nbPattes;
		taille = uneTaille;
	}



	/*
	 * Calcul de la vitesse des pokemon terrestre
	 *
	 * @return la vitesse de course
	*/
	public float vitesse(){
		return (5 * pattes)/poids;
	}


	/*
	 * Redefinition de toString pour l'affiche de notre pokemon terreste
	 *
	 * @return La description du pokemon
	*/
	public String toString(){
		return super.toString() + " , j'ai " + pattes + " patte(s) et je mesure : " + taille + " Donc je cours a " + vitesse() + "km/h ";
	}




}
