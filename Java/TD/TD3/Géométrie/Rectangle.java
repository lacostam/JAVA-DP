/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Mon Jan 17 13:45:52 CET 2022
*
*/
public class Rectangle extends ObjetGeometrique2D {


	private double longeur, largeur;

	public Rectangle(double uneLongeur, double uneLargeur){
		this.longeur = uneLongeur;
		this.largeur = uneLargeur;
	}

	public double  getLongeur(){
		return this.longeur;
	}

	public double  getLargeur(){
		return this.largeur;
	}

	@Override
	public double surface(){
		return (this.longeur * this.largeur);
	}

	@Override
	public double perimetre(){
		return ((this.longeur * 2) + (this.largeur * 2));
	}

	@Override
	public void agrandir(double facteur)throws IllegalZoomFactorException{
		if(facteur <= 0){
			throw new IllegalZoomFactorException("facteur <=0");
		}

		this.longeur = this.longeur * facteur;
		this.largeur = this.largeur * facteur;
	}

	@Override
	public void reduire(double facteur)throws IllegalZoomFactorException{
		if(facteur <= 0){
			throw new IllegalZoomFactorException("facteur <=0");
		}
		this.longeur = this.longeur / facteur;
		this.largeur = this.largeur / facteur;
	}
}
