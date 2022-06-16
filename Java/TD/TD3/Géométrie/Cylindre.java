/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Mon Jan 17 14:18:34 CET 2022
*
*/
public class Cylindre extends ObjetGeometrique3D {

	private double rayon, hauteur;


	public Cylindre(double unRayon, double uneHauteur){
		this.rayon = unRayon;
		this.hauteur = uneHauteur;
	}

	@Override
	public double surface(){
		return (2*Math.PI*this.rayon*this.hauteur);
	}

	@Override
	public double volume(){
		return (Math.PI* this.rayon * this.rayon *this.hauteur);
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
