/**
* @author Richefeu
* @version 0.1 : Date : Wed Mar 30 15:43:46 CEST 2022
*
*
*	Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*
*/
public class VisiteurClassique extends Visiteur{

	/**
	 * constructeur de visiteurClassique
	 * @param unJeu le jeu de la vie
	*/
	public VisiteurClassique(JeuDeLaVie unJeu){
		super(unJeu);
		this.nom = "classique";
	}


	/**
	 * Methode permettant de visiter une cellule vivante
	 * @param cellule a visiter
	*/
	public void visiteCelluleVivante(Cellule cellule){
		int nbVoisins = cellule.nombreDeVoisinesVivantes(jeu);

		if(nbVoisins < 2 || nbVoisins > 3){
			jeu.ajouterCommande(new CommandeMeurt(cellule));
		}
	}


	/**
	 * Methode permettant de visiter une cellule morte
	 * @param cellule a visiter
	*/
	public void visiteCelluleMorte(Cellule cellule){

		int nbVoisins = cellule.nombreDeVoisinesVivantes(jeu);

		if(nbVoisins == 3){
			jeu.ajouterCommande(new CommandeVit(cellule));
		}
	}



}
