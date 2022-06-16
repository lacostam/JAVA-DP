/**
* @author Richefeu
* @version 0.1 : Date : Tue Jan 25 10:30:26 CET 2022
*
*/
public class RectangleSitue extends ObjetGeometrique2DSitue {

	private double  x, y;
	private double longeur, largeur;

	public RectangleSitue(double uneLongeur, double uneLargeur, double unX, double unY){
		this.x = unX;
		this.y = unY;
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

	@Override
	public void deplacerHorizontalement(double dep){
		this.x = dep;
	}
	@Override
	public void deplacerVerticalement(double dep){
		this.y = dep;
	}
}
