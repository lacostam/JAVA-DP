/**
* @author Richefeu
* @version 0.1 : Date : Tue Jan 11 13:53:52 CET 2022
*
*/



/**
 * Class de test permettant de tester la classe Point et triangle
*/
public class Main {


	public static void main(String [] args){

		Point point1 = new Point(2, 4);
		Point point2 = new Point(2, 4);
		Point point3 = new Point(4, 8);
		Point point4 = new Point(3, 5);

		Point point5 = new Point(0, 4);
		Point point6 = new Point(4, 4);
		Point point7 = new Point(4, 0);

		Droite droite1 = new Droite(5, 6);
		Droite droite2 = new Droite(point1, point3);

		Triangle triangleSurface = new Triangle(point5, point6, point7);

		Triangle unTriangle = new Triangle(point1, point3, point4);

		System.out.println(point1);
		System.out.println(point2);
		System.out.println(point3);
		System.out.println(point4);

		System.out.println(point1.equals(point2));
		System.out.println(point1.equals(point3));

		System.out.println("\n\nDistance entre les points " + point1 + " et " + point3 +" = ");
		System.out.println(point1.distance(point3));

		System.out.println("\n\n");
		System.out.println(unTriangle);
		System.out.println("\n\nTriangle de perimetre " );
		System.out.println(unTriangle.perimetre());
		System.out.println("\n\nTriangle de Surface " );
		System.out.println(triangleSurface.surface());

		System.out.println(droite1);
		System.out.println(droite2);




	}
}
