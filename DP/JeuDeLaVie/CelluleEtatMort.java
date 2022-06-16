/**
* @author Richefeu
* @version 0.1 : Date : Fri Mar 25 13:41:13 CET 2022
*
* Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*/
public class CelluleEtatMort implements CelluleEtat{

	/**l'instance est une cellule morte*/
	private static CelluleEtatMort instance = new CelluleEtatMort();


	/**Constructeur en prive*/
	private CelluleEtatMort(){}



	/**
	 * Methode d'acces a la varibla instance
	 * @return instance qui est la cellule morte
	*/
	public final static CelluleEtatMort getInstance(){
		return instance;
	}



	/**
	 * Definition de la fonction vit
	 *
	 * @see CelluleEtat
	*/
	@Override
	public CelluleEtat vit(){
		return  CelluleEtatVivant.getInstance();
	}

	/**
	 * Definition de la fonction meurt
	 *
	 * @see CelluleEtat
	*/
	@Override
	public CelluleEtat meurt(){
		 return this;
	}

	/**
	 * Definition de la fonction estVivante
	 *
	 * @see CelluleEtat
	*/
	@Override
	public boolean estVivante(){
		return false;
	}


	/**
	 * Methode permettant d'accepeter le visiteur
	 *
	 *  @param visiteur le visiteur
	 *  @param cellule la cellule
	*/
	@Override
	public void accepte(Visiteur visiteur, Cellule cellule){
		visiteur.visiteCelluleMorte(cellule);
	}
}
