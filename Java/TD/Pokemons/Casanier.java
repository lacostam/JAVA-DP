/**
*   Fichier permettant de mettre en place un l'exercice des pokemons
* 		Ici les caractéristiques propre au pokemons Casanier
*
*
* @author Richefeu
* @version 0.1 : Date : Fri Jan 07 16:17:24 CET 2022
*
*/
public class Casanier extends Terrestre {


	protected int tempsTv;

	/*
	 * Constructeur de la class Casanier
	 *
	 * @pram unNom qui est le nom du pokemeon
	 * @param unPoids qui est le poids du pokemon
	 * @param nbPattes qui corresponds au nombres de pattes du pokemon
	 * @param uneTaille taille du pokemon
	 * @param untempsTv represente le temps devant un tv
	 * @return
	*/
	Casanier(String unNom, int unPoids, int nbPattes, float uneTaille, int untempsTv){

		super(unNom, unPoids, nbPattes, uneTaille);
		tempsTv = untempsTv;
	}

	/*
	 * Redefinition de toString pour l'affiche de notre pokemon Casanier
	 *
	 * @return La description du pokemon
	*/
	public String toString(){
		return super.toString() + ", Temps devant une tv  = " + tempsTv+"\n";
	}


}
