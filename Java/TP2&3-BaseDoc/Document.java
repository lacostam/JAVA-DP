/**
* @author Richefeu
* @version 0.1 : Date : Fri Jan 21 15:16:01 CET 2022
*
*/
public class Document {

	private Auteur auteur;
	private String titre;
	private boolean statut;


	/**
	 * Constructeur de la classe Document pemettant de creer un document avec
	 *
	 * @param unAuteur  qui correspond a l'auteur du document
	 * @param unTitre qui correspond au titre du doc
	*/
	public Document(Auteur unAuteur, String unTitre, boolean unStatut){
		this.auteur = unAuteur;
		this.titre = unTitre;
		this.statut = unStatut;
	}

	/**
	 * Redefinitiopn de toString pour l'affichag d'un document
	 *
	 * @return l'affichage du document
	*/
	@Override
	public String toString(){
		return "Document titre : " + this.titre + "   Par : " + this.auteur.getNom() + "   Disponibilité : " + this.statut;
	}


	/**
	 * Redefinition de equals pour comparer deux document
	 *
	 * @return vrai ou faux
	*/
	@Override
	public boolean equals(Object o){

		if( o instanceof Document){
			Document e = (Document) o;
			return(e.titre == this.titre && e.auteur.equals(this.auteur));
		}
		return false;
	}



	/**
	 * Methode d'acces en lecture du statut du document
	 *
	 * @return le statut du document
	*/
	public Boolean getStatut(){
		return this.statut;
	}

	/**
	 * Methode d'acces en lecture du titre du document
	 *
	 * @return le titre du document
	*/
	public String getTitre(){
		return this.titre;
	}

	/**
	 * Methode d'acces en lecture de l'auteur du document
	 *
	 * @return l'auteur du document
	*/
	public Auteur getAuteur(){
		return this.auteur;
	}

	/**
	 * Methode d'acces en ecriture du statut du ducument
	 *
	 * @param b boolean
	*/
	public void setStatut(boolean b){
		this.statut = b;
	}

}
