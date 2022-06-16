/**
* @author Richefeu
* @version 0.1 : Date : Fri Mar 25 13:40:57 CET 2022
* Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*/



public class CelluleEtatVivant implements CelluleEtat{

	/**l'instance est une cellule vivante*/
	private static CelluleEtatVivant instance = new CelluleEtatVivant();


	/**Constructeur en prive*/
	private CelluleEtatVivant(){}


	/**
	 * Methode d'acces a la varibla instance
	 * @return instance qui est la cellule vivnate
	*/
	public final static CelluleEtatVivant getInstance(){
		return instance;
	}

	/**
	 * Definition de la fonction vit
	 *
	 * @see CelluleEtat
	*/
	@Override
	public CelluleEtat vit(){
		return this;
	}

	/**
	 * Definition de la fonction meurt
	 *
	 * @see CelluleEtat
	*/
	@Override
	public CelluleEtat meurt(){
		 return  CelluleEtatMort.getInstance();
	}

	/**
	 * Definition de la fonction estVivante
	 *
	 * @see CelluleEtat
	*/
	 @Override
	public boolean estVivante(){
		return true;
	}

	/**
	 * Methode permettant d'accepeter le visiteur
	 *
	 *  @param visiteur le visiteur
	 *  @param cellule la cellule
	*/
	@Override
	public void accepte(Visiteur visiteur, Cellule cellule){
		visiteur.visiteCelluleVivante(cellule);
	}
}
