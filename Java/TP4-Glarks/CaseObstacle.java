/**
* @author Richefeu
* @version 0.1 : Date : Fri Feb 04 13:40:30 CET 2022
*
*/
public class CaseObstacle extends Case{



	/**
	 * Conctructeur de la classe CaseObstacle, permettant de creer un case avec obstacle
	*/
	public CaseObstacle(int i, int j){
		super(i, j);
	}

	/**
	 * Redefinition de estObsatcle
	 *
	 * @return true
	*/
	@Override
	public boolean  estObstacle(){
		return true;
	}
}
