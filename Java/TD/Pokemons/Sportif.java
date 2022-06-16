/**
*   Fichier permettant de mettre en place un l'exercice des pokemons
* 		Ici les caractéristiques propre au pokemons Sportif
*
*
* @author Richefeu
* @version 0.1 : Date : Fri Jan 07 16:17:24 CET 2022
*
*/
public class Sportif extends Terrestre {


	protected int frequenceCardiaque;

	/*
	 * Constructeur de la class Sportif
	 *
	 * @pram unNom qui est le nom du pokemeon
	 * @param unPoids qui est le poids du pokemon
	 * @param nbPattes qui corresponds au nombres de pattes du pokemon
	 * @param uneTaille taille du pokemon
	 * @param bpm represente la fréquence cardiaque
	 * @return
	*/
	Sportif(String unNom, int unPoids, int nbPattes, float uneTaille, int bpm){

		super(unNom, unPoids, nbPattes, uneTaille);
		frequenceCardiaque = bpm;
	}

	/*
	 * Redefinition de toString pour l'affiche de notre pokemon Sportif
	 *
	 * @return La description du pokemon
	*/
	public String toString(){
		return super.toString() + " bpm = "+frequenceCardiaque +"\n";
	}


}
