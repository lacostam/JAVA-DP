/**
* @author Ricehfeu
* @version 0.1 : Date : Tue Jan 25 10:27:45 CET 2022
*
*/
public class CercleSitue extends ObjetGeometrique2DSitue{

	private double x, y;
	private double rayon;


	public CercleSitue(double unRayon, double unX, double unY){
		this.x = unX;
		this.y = unY;
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

	@Override
	public void deplacerHorizontalement(double dep){
		this.x = dep;
	}

	@Override
	public void deplacerVerticalement(double dep){
		this.y = dep;
	}


}
