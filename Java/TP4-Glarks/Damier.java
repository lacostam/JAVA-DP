/**
* @author Ricehfeu
* @version 0.1 : Date : Fri Feb 04 13:39:48 CET 2022
*
*/
public class Damier {
	private Case [][] plateau;


	/**
	 * Constructeur de la classe damier permettrant de creer un platean de case de taille 10 par 10
	 *
	*/
	public Damier(){
		int i =0;
		int j = 0;

		 for(i=0; i < 10; i++){
		 	for(j=0; j < 10; j++){
		 		this.plateau [i][j] = new Case(i, j);
		 	}
		 }
	}


	/**
	 *Donne un case en fontion de coordonnées
	 *
	 * @param i une coordonnée
	 * @param j une autre coordonnée
	 * @return la case
	*/
	public Case donneTaCase(int i, int j){
		if (i > 10 || i< 0 || j >10 || j<0){
			System.err.println("coordonnées mauvaise");
			return;
		}else{
			return plateau[i][j];
		}
	}


	/**
	 *Modifie une case en fontion de coordonnées
	 *
	 * @param i une coordonnée
	 * @param j une autre coordonnée
	 * @param uneCase la case qui remplace
	*/
	public void modifieTaCase(int i, int j, Case uneCase){
		if (i > 10 || i< 0 || j >10 || j<0){
			System.err.println("coordonnées mauvaise");
		}else{
			plateau[i][j] = uneCase;
		}
	}


}
