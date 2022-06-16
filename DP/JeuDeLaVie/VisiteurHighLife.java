/**
* @author Richefeu
* @version 0.1 : Date : Fri Apr 01 14:18:12 CEST 2022
*
*	Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*
*/

public class VisiteurHighLife extends Visiteur{

	/**
	 * constructeur de VisiteurHighLife
	 * @param unJeu le jeu de la vie
	*/
	public VisiteurHighLife(JeuDeLaVie unJeu){
		super(unJeu);
		this.nom = "High Life";
	}


	/**
	 * Methode permettant de visiter une cellule vivante
	 * et d'appliquer HighLife
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
	 * et d'appliquer HighLife
	 * @param cellule a visiter
	*/
	public void visiteCelluleMorte(Cellule cellule){

		int nbVoisins = cellule.nombreDeVoisinesVivantes(jeu);

		if(nbVoisins == 3 || nbVoisins == 6){
			jeu.ajouterCommande(new CommandeVit(cellule));
		}
	}
}
