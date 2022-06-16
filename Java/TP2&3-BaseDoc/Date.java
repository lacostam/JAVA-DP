/**
* @author Richefeu
* @version 0.1 : Date : Fri Jan 21 13:31:10 CET 2022
*
*/

public class Date implements Comparable<Date> {

	private int jour, mois, annee;


	/**
	 * Constructeur de la classe Date pemettant de creer un date avec
	 *
	 * @param unJour qui correspond au jour
	 * @param unMois qui correspond au mois
	 * @param uneAnnee qui correspond a l'annee
	*/
	public Date (int unJour, int unMois, int uneAnnee)throws InvalidDateException {


		if (unJour > 31){
			throw new InvalidDateException("Jour non valide");
		}

		if (unMois > 12){
			throw new InvalidDateException("Mois non valide");
		}else {
			this.jour = unJour;
			this.mois = unMois;
			this.annee = uneAnnee;
		}
	}


	/**
	 * Redefinitiopn de toString pour l'affichag d'une date
	 *
	 * @return l'affichage de la date
	*/
	@Override
	public String toString(){
		return (this.jour + "/" + this.mois + "/"+ this.annee) ;
	}



	/**
	 * Redefinitiopn de compareTo pour comparer des dates
	 *
	 * @return  0 1 ou -1
	*/
	@Override
	public int compareTo(Date date){

		if(this.annee - date.annee != 0){
			return this.annee - date.annee ;
		}
		if (this.mois - date.mois != 0){
			return this.mois - date.mois;
		}else {
			return this.jour - date.jour;
		}
	}


	/**
	 * Methode d'acces en lecture a l'anné
	 *
	 * @return la date de deces
	*/
	public int getAnnee(){
		return this.annee;
	}

}
