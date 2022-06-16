/**
* @author Richefeu
* @version 0.1 : Date : Mon Jan 17 13:38:01 CET 2022
*
*/


public class Cercle extends ObjetGeometrique2D{

	private double rayon;


	public Cercle(double unRayon){
		this.rayon = unRayon;
	}

	public double getRayon(){
		return this.rayon;
	}

	@Override
	public double surface(){
		return (this.rayon * this.rayon * Math.PI);
	}

	@Override
	public double perimetre(){
		return (2 * Math.PI * this.rayon);
	}

	@Override
	public void agrandir(double facteur)throws IllegalZoomFactorException{
		if(facteur <= 0){
			throw new IllegalZoomFactorException("facteur <=0");
		}
		this.rayon = this.rayon * facteur;
	}

	@Override
	public void reduire(double facteur)throws IllegalZoomFactorException{
		if(facteur <= 0){
			throw new IllegalZoomFactorException("facteur <=0");
		}
		this.rayon = this.rayon / facteur;
	}
}
