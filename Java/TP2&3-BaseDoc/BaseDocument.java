/**
* @author Richefeu
* @version 0.1 : Date : Fri Jan 21 15:58:03 CET 2022
*
*/
import java.util.*;

public class BaseDocuments {

	private String nom;
	private List<Document> base;

	public BaseDocuments(String unNom){
		this.nom = unNom;
		base = new LinkedList<Document>();
	}

	/** ajoute un document dans la base de documents
	* @param d le document `a ajouter
	*/
	public void ajoute(Document d){
		this.base.add(d);
	}

	/** supprime un document de la base de documents (si il est plusieurs
	* fois présents, une seule des occurrences est supprimée). Il
	* importe peu que le document soit emprunté ou non ,au moment de sa
	* suppression.
	* @param d le document à supprimer
	* @return le document supprimé, null s’il n’existe pas
	*/
	public Document supprime(Document d){

		int index = this.base.indexOf(d);

		if(index != -1){
			this.base.remove(index);
			return d;
		}else{
			return null;
		}
	}

	/** affiche tous les documents de la mediathèque (pour impression
	* du catalogue par exemple)
	*/
	public void affiche(){
		Iterator i = this.base.iterator();

		System.out.println(" Les document de la base " + this.nom + " sont");

		while(i.hasNext()){
			System.out.println(i.next());
		}

		System.out.println("\n\n");

	}

	/** indique si le document donné est disponible (non emprunté)
	* @param d le document concerné
	* @return true si le document donné est disponible (non emprunté)
	* @exception NoSuchElementException si le document n’existe
	* pas dans la mediathèque
	*/
	public boolean estDisponible(Document d) throws NoSuchElementException{
		int index = this.base.indexOf(d);

		if(index != -1){

			if ((this.base.get(index)).getStatut()){
				return true;
			}else{
				return false;
			}
		}else{
			throw new NoSuchElementException("Le document n'existe pas dans la mediathèque");
		}
	}

	/** permet d’emprunter un document
	* @param d le document concerne
	* @exception NoSuchElementException si le document n’existe
	* pas dans la mediathèque
	*/
	public boolean emprunte(Document d) throws NoSuchElementException{

		if(estDisponible(d)){
			(this.base.get(this.base.indexOf(d))).setStatut(false);
			return true;
		}else{
			return false;
		}
	}

	/** permet de rendre un document
	* @param d le document concerné
	*/
	public void rend(Document d){
		(this.base.get(this.base.indexOf(d))).setStatut(true);
	}





	/**
	 * Permet de selectionnner des document parfmis des critères
	 *
	 * @param s qui est un selectionneur pour trouver le document
	 * @return Iterator sur la collection des documents de la base satisfaisant le selectionneur s
	 *
	*/
	public Iterator selectionne(Selectionneur s) {

		ArrayList listeSelectionneur = new ArrayList();

		for(int i = 0; i < base.size(); i ++){
			if (s.estSatisfaitPar(base.get(i))){
				listeSelectionneur.add(base.get(i));
			}
		}
		return listeSelectionneur.iterator();
	}

	/**
	 * Permet de triee un liste de doc
	 *
	 * @param i l'iterator contenant les docs
	 * @param c le comparateur utilisé pour trié
	 *
	 * @return listeTri qui est la liste triée
	 *
	*/
	public List listeTriee(Iterator<Document> i, Comparator c){

		List<Document> listeTri = new ArrayList<Document>();

		while(i.hasNext()){
			listeTri.add(i.next());
		}
		Collections.sort(listeTri, c);
		System.out.println(listeTri);

		return listeTri;
	}



}
