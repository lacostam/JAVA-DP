/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Sun Jan 16 15:31:49 CET 2022
*
*/
public class Jeu {

	private Joueur[] tabJoueur;
	private java.util.Random rnd = new java.util.Random();
	private int nombreJoueurs;
	private int i;

	public Jeu(int nbJ){
		this.nombreJoueurs = nbJ;
		tabJoueur = new Joueur[nombreJoueurs + 1];

		for(i=0 ; i<5000 ; i ++){
			rnd.nextDouble();
		}

		for(i=1 ; i<=nombreJoueurs ; i ++){
			tabJoueur[i] = new Joueur(i, rnd);
		}

		for(int joueurNum = 1 ; joueurNum <= nombreJoueurs ; joueurNum ++){
			stratAleatoire(tabJoueur[joueurNum]);
		}
	}

	public void stratAleatoire(Joueur j){
		switch(1 +rnd.nextInt(3)){
			case 1:
				j.donneStrat(new StrategieTypeUn(tabJoueur, nombreJoueurs, j.getNumJoueur())); break;
			case 2:
				j.donneStrat(new StrategieTypeDeux(tabJoueur, nombreJoueurs, j.getNumJoueur())); break;
			case 3:
				j.donneStrat(new StrategieTypeTrois(tabJoueur, nombreJoueurs, j.getNumJoueur())); break;
		}
	}

	public void joue(){

		int jNum= 0;

		do{
			jNum++;

			if(jNum> nombreJoueurs)
				jNum = 1;

			if (tabJoueur[jNum].getDureeStrat() ==0)
				stratAleatoire(tabJoueur[jNum]);

			tabJoueur[jNum].deplace(1 +rnd.nextInt(6));

			System.out.println("Joueur " + jNum +" position : " + tabJoueur[jNum].getPosition());
		}while(!tabJoueur[jNum].gagnant());

		System.out.println("\n\n=============== JOUEUR " + jNum + " GAGNE LE JEU ===============");

	}
}
