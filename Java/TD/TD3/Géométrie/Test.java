/**
* @author Richefeu
* @version 0.1 : Date : Mon Jan 17 13:49:19 CET 2022
*
*/
public class Test {

	public static void main (String [] args){

		Cercle unCercle = new Cercle(3);
		Rectangle unRectangle = new Rectangle(4, 2);

		System.out.println("==========AIR CERCLE RAYON : "+unCercle.getRayon()+"==========");
		System.out.println(unCercle.surface());
		System.out.println("==========PERIMETRE CERCLE==========");
		System.out.println(unCercle.perimetre());



		System.out.println("\n\n===================ZOOM CERCLE x2===================\n\n");

		try{
			unCercle.agrandir(2);
		}catch(IllegalZoomFactorException e){
			e.printStackTrace();
		}

		System.out.println("==========AIR CERCLE RAYON : "+unCercle.getRayon()+"==========");
		System.out.println(unCercle.surface());
		System.out.println("==========PERIMETRE CERCLE==========");
		System.out.println(unCercle.perimetre());

		System.out.println("===================REDUIRE CERCLE x2===================");

		try{
			unCercle.reduire(2);
		}catch(IllegalZoomFactorException e){
			e.printStackTrace();
		}


		System.out.println("RAYON = " + unCercle.getRayon());



		System.out.println("\n\n\n==========AIR RECTANGLE LONGEUR ET LARGEUR =  : "+unRectangle.getLongeur()+"  "+unRectangle.getLargeur()+"==========");
		System.out.println(unRectangle.surface());
		System.out.println("==========PERIMETRE RECTANGLE==========");
		System.out.println(unRectangle.perimetre());

		System.out.println("\n\n===================ZOOM RECTANGLE x2===================\n\n");

		try{
			unRectangle.agrandir(2);
		}catch(IllegalZoomFactorException e){
			e.printStackTrace();
		}

		System.out.println("==========AIR RECTANGLE LONGEUR ET LARGEUR =  : "+unRectangle.getLongeur()+"  "+unRectangle.getLargeur()+"==========");
		System.out.println(unRectangle.surface());
		System.out.println("==========PERIMETRE RECTANGLE==========");
		System.out.println(unRectangle.perimetre());

		System.out.println("===================REDUIRE RECTANGLE x2===================");

		try{
			unRectangle.reduire(2);
		}catch(IllegalZoomFactorException e){
			e.printStackTrace();
		}

		System.out.println("LONGEUR ET LARGEUR = " +unRectangle.getLongeur()+"  "+unRectangle.getLargeur());

	}
}
