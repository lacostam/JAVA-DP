/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Wed Mar 16 16:16:43 CET 2022
*
*/
import java.time.LocalDate;
import java.util.*;

public class Fichier implements Composant{

	private String nom;
	private int taille;
	private String contenu;
	private LocalDate dateCreation;

	public Fichier(String unNom, LocalDate uneDate, String unContenu){
		this.nom = unNom;
		this.taille = 100;
		this.contenu = unContenu;
		this.dateCreation = uneDate ;
	}

	public int getTaille(){
		return this.taille;
	}

	public String getNom(){
		return this.nom;
	}

	public String getContenu(){
		return this.contenu;
	}

	public LocalDate getDate(){
		return this.dateCreation;
	}

	@Override
   	public Iterator<Composant> iterator() {
      	return null;
   	}

	@Override
   	public String toString(){
		return "Fichier{nom='" + getNom() +"' , date=" + this.dateCreation +"} \n";
	}

	@Override
	public void accepter(Visiteur v){
		v.visiteFichier(this);
	}
}
