/**
* @author Richefeu
* @version 0.1 : Date : Tue Jan 11 15:20:22 CET 2022
*
*/
public class Droite {


	private double a, b;

	/**
	 * Constucteur de la calsse Droite
	 *
	 * @param unA correspond a un  reel
	 * @param unB correspond a un autre reel
	*/
	public Droite(double unA, double unB){
		a = unA;
		b = unB;
	}

	/**
	 * Constucteur de la classe Droite avec deux points
	 *
	 * @param point1 correspond a un point
	 * @param point2 correspond a un autre point
	*/
	public Droite(Point point1, Point point2){
		a = (point1.getX()  - point2.getX() ) / ( point1.getY()  - point2.getY() );
		b = point1.getY() - a * point1.getX();
	}



	/**
	 * Permet de savoir si deux droites sont parallèle
	 *
	 * @param droite  correspond a une droite
	 * @return true or false
	*/
	public boolean estParallele(Droite droite){
		return (this.a == droite.a);
	}



	/**
	 * Permet de calculer l'intersection de deux droites
	 *
	 * @param d  correspond a une droite
	 * @return un point  qui est l'intersection des deux droites
	*/
	public Point intersection(Droite d){


		double x = (d.getB() - this.b) / (this.a - d.getA());
		double y = this.a * x + this.b;

		return new Point(x,y);
	}


	/**
	 * Redefinition de toString pour l'affichage d'une droite
	 * @return un string
	*/
	public String toString(){
		return "\n Droite avec a = " + this.a +  " et b ="+ this.b+ "\n";
	}


	/**
	 * methode d'acces en lecteure de la variable de classe a
	 * @return la vc a
	*/
	public double getA(){
		return a;
	}



	/**
	 * methode d'acces en lecteure de la variable de classe b
	 * @return la vc b
	*/
	public double getB(){
		return b;
	}



}
