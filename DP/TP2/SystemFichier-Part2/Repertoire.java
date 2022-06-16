/**
* @author Richefeu
* @version 0.1 : Date : Wed Mar 16 16:18:43 CET 2022
*
*/
import java.time.LocalDate;
import java.util.*;
import java.util.Stack;

public class Repertoire implements Composant {

	private String nom;
	private LocalDate dateCreation;
	private LinkedList<Composant> listeFichiers;
	private int taille;

	public Repertoire(String unNom, LocalDate uneDate){
		this.nom = unNom;
		this.dateCreation = uneDate ;
		listeFichiers = new LinkedList<Composant>();
		this.taille=0;
	}


	public void ajouter(Fichier f){
		this.listeFichiers.add(f);
		this.taille = this.taille+1;
	}

	public void ajouter(Repertoire r){
		this.listeFichiers.add(r);
		this.taille = this.taille+1;
	}

	public String getNom(){
		return this.nom;
	}

	public LocalDate getDate(){
		return this.dateCreation;
	}

	public int getTaille(){
		return this.taille;
	}

	public LinkedList<Composant> getListeFichiers(){
		return this.listeFichiers;
	}

	@Override
	public void accepter(Visiteur v){
		v.visiteRepertoire(this);
	}


	@Override
	public String toString(){
		return "Repertoire{nom='" + getNom() +"' , date=" + this.dateCreation +"} \n";
	}


	@Override
   	public Iterator<Composant> iterator() {
      	return new IterateurRepertoire(this);
   	}

   	private class IterateurRepertoire implements Iterator<Composant> {

		private Stack<Composant> pile;
		private Iterator<Composant> it;

		public IterateurRepertoire(Composant rep){

			this.pile = new Stack();
			this.it = listeFichiers.iterator();
			this.pile.push(rep);
		}

		@Override
		public boolean hasNext(){

			if(!pile.empty()){
				return true;
			}
			else return false;

		}

		public Composant next() {

			if(pile.empty()){
				 throw new Error("pile vide");
			}
			else{
				Composant tmp=pile.pop();
				if( tmp instanceof Repertoire){
					Repertoire rep = (Repertoire) tmp;
					for(Iterator i=rep.listeFichiers.descendingIterator();i.hasNext();){
						Composant c = (Composant)i.next();
						pile.push(c);
					}
				}
				return tmp;
			}
		}
	}

}
