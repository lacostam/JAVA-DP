/**
* @author Richefeu
* @version 0.1 : Date : Mon Jan 10 16:18:16 CET 2022
*
*/



public class Generateur {

	private Filtre premierFiltre;


	/*
	 * Constructeur de la class Generateur, Initialise le premier filtre a 2
	*/
	public Generateur(){
		premierFiltre = new Filtre(2);
	}

	/*
	 * affichage de la class generateur
	*/
	@Override
	public String toString(){
		return "La liste des filtres Générés est :\n" + premierFiltre.toString()+"\n";
	}

	/*
	 * Lance la generation des filtre jusqu'au nombre placé en paramètre
	 * @param Borne jusqu'a laquelle il faut generer les nombres premiers
	*/
	public void lanceToi(int unNombre){
		int i;
		for(i = 3 ; i<unNombre ; i++){
			premierFiltre.aToiDeTraiter(i);
		}
	}

}//fi class Generateur
