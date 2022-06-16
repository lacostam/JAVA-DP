/**
* @author Richefeu
* @version 0.1 : Date : Fri Apr 01 14:24:10 CEST 2022
*
*	Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*
*/
public class VisiteurDayNight extends Visiteur {
	/**
	 * constructeur de VisiteurDayNight
	 * @param unJeu le jeu de la vie
	*/
	public VisiteurDayNight(JeuDeLaVie unJeu){
		super(unJeu);
		this.nom = "Day Night";
	}


	/**
	 * Methode permettant de visiter une cellule vivante
	 * et d'appliquer VisiteurDayNight
	 * @param cellule a visiter
	*/
	public void visiteCelluleVivante(Cellule cellule){
		int nbVoisins = cellule.nombreDeVoisinesVivantes(jeu);

		if(nbVoisins < 3 || nbVoisins == 5){
			jeu.ajouterCommande(new CommandeMeurt(cellule));
		}
	}


	/**
	 * Methode permettant de visiter une cellule morte
	 * et d'appliquer VisiteurDayNight
	 * @param cellule a visiter
	*/
	public void visiteCelluleMorte(Cellule cellule){

		int nbVoisins = cellule.nombreDeVoisinesVivantes(jeu);

		if(nbVoisins == 3 || nbVoisins == 6 || nbVoisins == 7 || nbVoisins == 8){
			jeu.ajouterCommande(new CommandeVit(cellule));
		}
	}
}
