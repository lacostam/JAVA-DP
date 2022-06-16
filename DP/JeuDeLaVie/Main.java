/**
* @author Richefeu
* @version 0.1 : Date : Fri Apr 01 15:50:31 CEST 2022
*
*	Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*
*/
import java.util.concurrent.TimeUnit;
import java.util.*;


/**
 * Classe principal
*/
public class Main {


	/**
	 * Class de test permettant de visualiser un jeu
	 * 	sur un grille de 120 par 120
	 *
	 * 	@param args arguments
	 * 	@throws InterruptedException interception
	 *
	*/
	public static void main(String [] args)throws InterruptedException{

		JeuDeLaVie classique = new JeuDeLaVie();
		JeuDeLaVie highLife = new JeuDeLaVie();
		JeuDeLaVie dayNight = new JeuDeLaVie();

		classique.initialiseGrille();
		highLife.initialiseGrille();
		dayNight.initialiseGrille();

		classique.setVisiteur(new VisiteurClassique(classique));
		highLife.setVisiteur(new VisiteurHighLife(highLife));
		dayNight.setVisiteur(new VisiteurDayNight(dayNight));

		List<JeuDeLaVie> listeJeu = new ArrayList<>();
		listeJeu.add(classique);
		listeJeu.add(highLife);
		listeJeu.add(dayNight);

		List<JeuDeLaVieUi> interfaces = new ArrayList<>();
		interfaces.add(new JeuDeLaVieUi(classique));
		interfaces.add(new JeuDeLaVieUi(highLife));
		interfaces.add(new JeuDeLaVieUi(dayNight));

		System.out.println("ObservateurModeTexte sur lle jeu classique");

		classique.attacheObservateur(new ObservateurModeTexte(classique));
		new Interface(listeJeu, interfaces);

		/*int x, y;
		int gene = 1;
		Cellule c;



		while(gene < 30){

			System.out.println("################## GENERATION NUM "+gene+" ##################");

			for( x = 0 ; x < jeu.getXMax(); x++){
				for( y = 0 ; y < jeu.getYMax() ; y++){

					c = jeu.getGrilleXY(x, y);
					if(c.estVivante()){
						System.out.print("| * ");
					}
					else{
						System.out.print("|   ");
					}
				}
				System.out.print("|");
				System.out.println();
			}

			jeu.calculerGenerationSuivante();


			gene++;

			try {
				TimeUnit.SECONDS.sleep(1);
			}
			catch (Exception e) {
				System.out.println("ERROR SLEEP");
			}

			System.out.print("\033[H\033[2J");// clear terminal

		}//fin while */
	}

}//fin class main
