/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Sun Jan 16 14:39:59 CET 2022
*
*/
public class StrategieTypeTrois extends Strategie{


	public StrategieTypeTrois (Joueur[] j, int nbJ, int num){
		super(j, nbJ, num);
	}

	public int changePosition(int de){

		int dernierJ = joueur[numJoueur].getPosition();
		int i;

		for(i=2; i< nombreJoueur ; i++){

			if(joueur[i].getPosition() < dernierJ){
				dernierJ = joueur[i].getPosition();
			}
		}
		int pos = de + (joueur[numJoueur].getPosition() - dernierJ )/2;

		return (de == 1 || de == 2) ? pos : -pos;
	}

	@Override
	public String toString(){
		return super.toString() + "3";
	}
}
