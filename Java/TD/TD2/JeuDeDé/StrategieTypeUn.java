/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Sun Jan 16 14:39:19 CET 2022
*
*/
public class StrategieTypeUn extends Strategie {

	public StrategieTypeUn (Joueur[] j, int nbJ, int num){
		super(j, nbJ, num);
	}

	public int changePosition(int de){

		int premierJ = joueur[numJoueur].getPosition();
		int i;

		for(i=2; i< nombreJoueur ; i++){
			if(joueur[i].getPosition() > premierJ){
				premierJ = joueur[i].getPosition();
			}
		}
		int pos = de + (premierJ - joueur[numJoueur].getPosition())/2;

		return (de>2)? pos : -pos;
	}

	@Override
	public String toString(){
		return super.toString() + "1";
	}

}
