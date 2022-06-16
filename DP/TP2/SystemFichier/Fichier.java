/**
* @author Richefeu
* @version 0.1 : Date : Wed Mar 16 13:39:40 CET 2022
*
*/
import java.time.LocalDate;

public class Fichier {


	private String nom;
	private int taille;
	private String contenu;
	private LocalDate dateCreation;

	public Fichier(String unNom, String unContenu, int uneTaille){
		this.nom = unNom;
		this.taille = uneTaille;
		this.contenu = unContenu;
		this.dateCreation = dateCreation.now() ;
	}

	public int getTaille(){
		return this.taille;
	}

	public String getNom(){
		return this.nom;
	}
}
