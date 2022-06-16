/**
* @author Richefeu
* @version 0.1 : Date : Fri Feb 04 13:40:44 CET 2022
*
*/
public abstract class Glark {

	protected int energie;
	protected CaseLibre caseCourante;


	/**
	 * Constructeur de la classe Glark
	 *
	 * @param courante case ou est le glark
	*/
	protected Glark(CaseLibre courante){
		this.caseCourante = courante;
		this.energie = 100;
	}

	/**
	 * Modification de l'energie
	 *
	 * @param nb a ajouter ou supp
	*/
	final void setEnergie(int nb){
		if( nb > 0){
			this.energie += nb;
		}else{
			this.energie -= nb;
		}
	}

	/**
	 * acces en lecture de l'energie
	 *
	 * @return  nb energie
	*/
	final int getEnergie(){
		return this.energie;
	}

	/**
	 * Modification de la case courante
	 *
	 * @param nb a ajouter ou supp
	*/
	final void setCaseCourante(CaseLibre unCase, Glark unGlark){
		this.caseCourante = uneCase;
		this.caseCourante.ajoutGlark(unGlark);
	}

	/**
	 * acces en lecture de la case courante
	 *
	 * @return  la case courante
	*/
	final CaseLibre getCaseCourant(){
		return this.caseCourante;
	}

	/**
	 * Si un glark meurs il disparait de la liste
	 *
	 * @param unGlark a faire mourir
	*/
	final void meurs(Glark unGlark){
		this.caseCourante.supprimerGlark(unGlark);
	}




}
