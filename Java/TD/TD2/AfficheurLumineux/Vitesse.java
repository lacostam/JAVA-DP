/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Sun Jan 16 16:27:18 CET 2022
*
*/
public class Vitesse extends Latence{
	private int vitesse = 0;

	public Vitesse (int uneTaille, int lat, int uneVitesse){
		super(uneTaille, lat);
		this.vitesse = uneVitesse;
	}

	public void top(){
		int i;

		for(i=0; i<this.vitesse; i++)
			super.top();
	}
}
