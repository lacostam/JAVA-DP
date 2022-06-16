/**
* @author Richefeu
* @version 0.1 : Date : Fri Mar 25 13:40:22 CET 2022
*
* Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*
*/
public class Cellule{


	/**
	 * Une cellule est une CelluleEtat
	 * @see CelluleEtat
	*/
	private CelluleEtat etat;
	/**
	 * corordonnées de la cellule
	*/
	private int x, y;



	/**
	 * Constructeur d'une cellule
	 * @param unX coordonnée X
	 * @param unY coordonnée Y
	 * @param unEtat etat de la cellule
	*/
	public Cellule(int unX, int unY, CelluleEtat unEtat){
		this.x = unX;
		this.y = unY;
		this.etat = unEtat;
	}

	/**
	 * Pour connaitre le nombre de cellule vivante autour d'un cellule
	 * @param jeu un grille de cellule
	 * @return le nombre de cellules vivantes
	*/
	public int nombreDeVoisinesVivantes(JeuDeLaVie jeu){


		 int nbVoisin = 0;

		 for (int x = -1 ; x <=1; x++){
		 	for (int y = -1; y <=1 ; y++){

		 		if (x != 0 || y != 0){
		 			if((this.x + x) >= 0 && (this.x+x) < jeu.getXMax() && (this.y + y) >= 0 && (this.y+y) < jeu.getYMax()){
		 				if(jeu.getGrilleXY(this.x+x, this.y+y).estVivante()){
		 					nbVoisin++;
		 				}
		 			}
		 		}
		 	}
		 }

		return nbVoisin;
	}





	/**
	 * Fonction permettant a la cellule de continuer a vivre
	*/
	void vit(){
		this.etat = etat.vit();
	}

	/**
	 * Fonction permettant a la cellule de mourrir
	*/
	void meurt(){
		this.etat = etat.meurt();
	}

	/**
	 * Fonction permettant de sir l'etat d'une cellule
	 * @return boolean, l'etat de la cellule
	*/
	boolean estVivante(){
		 return this.etat.estVivante();
	}


	/**
	 * Methode permettant d'accepeter le visiteur
	 *
	 * @param visiteur qui est le visiteur a accepter
	 * @see CelluleEtat
	*/
	public void accepte(Visiteur visiteur){
		etat.accepte(visiteur, this);
	}

}
