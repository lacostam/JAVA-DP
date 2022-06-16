/**
* @author Richefeu
* @version 0.1 : Date : Tue Jan 11 13:40:09 CET 2022
*
*/



/**
 * Class permettant de mettre ne place des points, et:
 * De comparer si deux points sont egaux
 * De calculer la distance entre deux points
*/
public class Point {


	/**
	 * Variable de classe permettant de mettre ne place un point sur un plan
	*/
	private double x;
	private double y;


	/**
	 * Constucteur de la calsse Point pour creer une point
	 * @param unX correspond au axe des abcisses
	 * @param unY correspond au axe des ordonnées
	*/
	public Point(double unX, double unY){
		 x = unX;
		 y =  unY;
	}



	/**
	 * Redefinition de equals permetant de comparer si deux point sont les memes
	 * @param o une object
	 * @return boolean si le deux point sont le meme ou pas
	*/
	@Override
	public boolean equals(Object o){

		if( o instanceof Point){

			Point unPoint = (Point) o;

			System.out.print("Point 1 =" +this);
			System.out.print("Point 2 =" +unPoint);


			return (unPoint.x == this.x) && (unPoint.y == this.y);

		}else{return false;}
	}



	/**
	 * Methode permettant de calculer la distance entre deux points
	 * @param unPoint une point sur le plan
	 * @return la distance entre deux points
	*/
	public double distance(Point unPoint){
		return Math.sqrt( Math.pow(this.x - unPoint.x, 2) + Math.pow(this.y - unPoint.y, 2) );
	}



	/**
	 * Redefinition de toString pour l'affichage d'un point
	 * @return un string
	*/
	public String toString(){
		return "Point x = " + this.x + " y = " + this.y +"\n";
	}



	/**
	 * methode d'acces en lecteure de la variable de classe X
	 * @return la vc x
	*/
	public double getX(){
		return this.x;
	}



	/**
	 * methode d'acces en lecteure de la variable de classe Y
	 * @return la vc y
	*/
	public double getY(){
		return this.y;
	}


	/**
	 * methode permettant de savoir si un point est sur un droite
	 *
	 * @param uneDroite correspond a une droite
	 * @return true or false
	*/
	public boolean estSurDroite(Droite uneDroite){
		return ( this.y == (uneDroite.getA() * this.x - uneDroite.getB()));
	}

}
