/**
* @author Richefeu
* @version 0.1 : Date : Fri Jan 21 14:22:03 CET 2022
*
*/

public class Auteur{

	private String nom;
	private Date naissance, deces;


	/**
	 * Constructeur de la classe Auteur pemettant de creer un auteur avec
	 *
	 * @param unNom  qui correspond au nom
	 * @param uneDateN qui correspond a la date de naissance
	 * @param uneDateM qui correspond a la date de deces
	*/
	public Auteur(String unNom, Date uneDateN, Date uneDateM){
		this.nom = unNom;
		this.naissance = uneDateN;
		this.deces = uneDateM;
	}



	/**
	 * Redefinitiopn de toString pour l'affichag d'un auteur
	 *
	 * @return l'affichage de l'aureur
	*/
	@Override
	public String toString(){
		return "Auteur nom : " + this.nom + " Date naissance : " + this.naissance + " Date de deces : " + this.deces;
	}



	/**
	 * Redefinition de equals pour comparer deux auteurs
	 *
	 * @return vrai ou faux
	*/
	@Override
	public boolean equals(Object o){

		if( o instanceof Auteur){

			Auteur e = (Auteur) o;

			return(e.nom == this.nom && e.naissance == this.naissance && e.deces == this.deces);
		}
		return false;
	}

	/**
	 * Methode d'acces en lecture du nom de l'auteur
	 *
	 * @return le nom de l'auteur
	*/
	public String getNom(){
		return this.nom;
	}

	/**
	 * Methode d'acces en lecture du deces de l'auteur
	 *
	 * @return la date de deces
	*/
	public Date getDeces(){
		return this.deces;
	}

}
