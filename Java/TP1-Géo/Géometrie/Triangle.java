/**
* @author Richefeu
* @version 0.1 : Date : Tue Jan 11 14:11:50 CET 2022
*
*/

/**
 * class permetant de mettre en place un trriangle, un triangle est definit par trois points
*/
public class Triangle {

	private Point premierPoint, dexiemePoint, troisiemePoint;



	/**
	 * Constucteur de la class triangle pour creer un triangle avec trois points
	 *
	 * @param pointUn correspond premier point du triangle
	 * @param pointDeux correspond deuxieme point du triangle
	 * @param pointTrois correspond troisième point du triangle
	*/
	public Triangle(Point pointUn, Point pointDeux, Point pointTrois){
		premierPoint = pointUn;
		dexiemePoint = pointDeux;
		troisiemePoint = pointTrois;
	}


	/**
	 * Constucteur de la classe triangle pour creer un triangle avec trois Droites
	 *
	 * @param d1 correspond a la première droite
	 * @param d2 correspond a la dexièeme droite
	 * @param d3 correspond troisième droite
	*/
	public Triangle(Droite d1, Droite d2, Droite d3){

		if(d1.estParallele(d2) && d2.estParallele(d3) && d3.estParallele(d1)){
			premierPoint = d1.intersection(d2);
			dexiemePoint = d2.intersection(d3);
			troisiemePoint = d3.intersection(d1);
		}
	}


	/**
	 *	Methode permettant de calculer le perimetre d'un triangle
	 *
	 * @return le perimetre du triangle
	*/
	public double perimetre(){
		return (  this.premierPoint.distance(this.dexiemePoint) + this.dexiemePoint.distance(this.troisiemePoint) + this.troisiemePoint.distance(this.premierPoint) );
	}



	/**
	 * Methode permettant de calculer le surface d'un triangle
	 * @return la surface
	*/
	public double surface(){
		double p = this.perimetre()/2;
		return (Math.sqrt( p * ( p - this.premierPoint.distance(this.dexiemePoint) ) * ( p - this.dexiemePoint.distance(this.troisiemePoint) ) * (p-this.troisiemePoint.distance(this.premierPoint) )));
	}




	/**
	 * Redefinition de toString pour l'affichage d'un triangle
	 * @return un string
	*/
	public String toString(){
		return "triangle avec les points : \n" + this.premierPoint +  this.dexiemePoint + this.troisiemePoint +"\n";
	}

}
