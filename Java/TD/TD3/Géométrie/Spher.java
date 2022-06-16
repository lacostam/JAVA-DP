/**
* @author Richefeu
* @version 0.1 : Date : Thu Jan 20 13:56:26 CET 2022
*
*/
public class Spher extends ObjetGeometrique3D {


	private double rayon;


	public Spher(double unRayon){
		this.rayon = unRayon;
	}

	@Override
	public double surface(){
		return (4*Math.PI*this.rayon*this.rayon);
	}

	@Override
	public double volume(){
		return ((4*Math.PI*this.rayon*this.rayon*this.rayon)/3);
	}

	@Override
	public void agrandir(double facteur)throws IllegalZoomFactorException{
		if(facteur <= 0){
			throw new IllegalZoomFactorException("facteur <=0");
		}
		this.rayon = this.rayon*facteur;
	}

	@Override
	public void reduire(double facteur)throws IllegalZoomFactorException{
		if(facteur <= 0){
			throw new IllegalZoomFactorException("facteur <=0");
		}
		this.rayon = this.rayon/facteur;
	}

}
