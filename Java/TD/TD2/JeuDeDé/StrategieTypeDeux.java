/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Sun Jan 16 14:39:39 CET 2022
*
*/
public class StrategieTypeDeux extends Strategie {


	public StrategieTypeDeux (Joueur[] j, int nbJ, int num){
		super(j, nbJ, num);
	}

	public int changePosition(int de){
		return (de%2 == 0 )? (3* de) : de;
	}

	@Override
	public String toString(){
		return super.toString() + "2";
	}
}
