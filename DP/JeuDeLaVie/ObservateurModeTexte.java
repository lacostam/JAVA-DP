/**
* @author Richefeu
* @version 0.1 : Date : Fri Apr 22 12:15:02 CEST 2022
*
*	Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*
*/

/**
 * classe mettant en place l'observateur permettant de savoir ciombien de cellulues vivantes il y a sur la grille
 * 		a chaque generation mais aussi permet en compter le nombre de generations
*/
public class ObservateurModeTexte implements Observateur {

	/**jeu de la vie*/
	private JeuDeLaVie jeu;

	/**
	 * constructeur de ObservateurModeTexte
	 *
	 * @param j le jeu de la vie
	*/
	public ObservateurModeTexte(JeuDeLaVie j){
		this.jeu = j ;
	}

	/**
	 * @see Observateur
	*/
	@Override
    public void actualise() {

    	int nbVivant =0, x, y;

    	System.out.println("Generation n° " + this.jeu.getNbGene());

		for(x =0 ; x < jeu.getXMax(); x++){
			for(y =0 ; y < jeu.getYMax(); y++){

				if(jeu.getGrilleXY(x, y).estVivante()){
					nbVivant++;
				}

			}
		}
		System.out.println("Nombres de cellules vivantes" + nbVivant);

    }

}
