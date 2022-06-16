/**
* @author Richefeu
* @version 0.1 : Date : Fri Feb 04 13:40:36 CET 2022
*
*/
public class CaseLibre extends Case {

	private Damier plateau;
	private boolean blurf;
	private List listeDesGlarks;


	/**
	 * Constucteur de la classe CaseLibre
	*/
	public CaseLibre(int i, int j , Damier unPlat, boolean tasBlurf, List liste){
		super(i, j);
		this.plateu = unPlat;
		this.blurf = tasBlurf;
		this.listeDesGlarks = liste;
	}

	/**
	 * Methode d'acces en lecture de la presence d'un tas de blurf
	 *
	 * @return presence ou non d'un tas
	*/
	public boolean getBlurf(){
		return this.blurf;
	}

	/**
	 * Methode d'acces en modification de la presence d'un tas de blurf
	 *
	 * @param vrai ou faux
	*/
	public boolean setBlurf(boolean unBool){
		this.blurf = unBool;
	}


	/**
	 * Methode d'ajout d'un glarks
	 *
	 * @param un glarks
	*/
	public void ajoutGlark(Glark unGlark){
		this.listeDesGlarks.add(unGlark);
	}

	/**
	 * Methode d'effacer un glarks
	 *
	 * @param un glarks
	*/
	public void supprimerGlark(Glark unGlark){
		this.listeDesGlarks.remove(unGlark);
	}


	/**
	 * Offre au glark passé en parametre de manger le blurf si il y en a un ou un glark si il y en a un
	 *
	 * @param unGlark
	*/
	public void menu(Glark unGlark){

		if(this.plateau[this.i][this.j].getBlurf()){
			this.blurf = false;
		}

		if(this.listeDesGlarks.length > 1){
			this.listeDesGlarks.remove(unGlark);
		}

	}


}
