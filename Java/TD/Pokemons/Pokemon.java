/**
 * Fichier permettant de mettre en place un l'exercice des pokemons
 * 	Ici les caractéristiques commune a tout les pokemons
* @author Richefeu
* @version 0.1 : Date : Fri Jan 07 15:05:49 CET 2022
*
*/



public class Pokemon {


	/*
	 * Variable de classe en protected pour l'acces aux fils
	*/
	protected String nom;
	protected int poids;



	/*
	 * Constructeur de la class Pokemon
	 *
	 * @pram unNom qui est le nom du pokemeon
	 * @param unPoids qui est le poids du pokemon
	 * @return
	*/
	Pokemon(String unNom, int unPoids){
		nom=unNom;
		poids = unPoids;
	}



	/*
	 * Redefinition de toString pour l'affiche de notre pokemon
	 *
	 * @return La description du pokemon
	*/
	public String toString(){
		return "Je suis le pokemon " + nom + " et je pese " + poids;
	}

}
