/**
* @author Richefeu
* @version 0.1 : Date : Sat Jan 15 16:02:55 CET 2022
*
*/
public class Test {

	public void tester(Afficheur afficheur) {
		char[] message = {'D', 'e', 's', 'p', 'r', 'é' , 's'};
		afficheur.setMessage(message);
		for (int i = 0; i < 10; i++) {
			afficheur.top();
			System.out.println("<<" + afficheur + ">>");
		}

	}

	public static void main(String [] args){
		System.out.println("\n\n========TEST AFFICHEUR========\n\n");
		new Test().tester(new Afficheur(6));
		System.out.println("\n\n========TEST LATENCE========\n\n");
		new Test().tester(new Latence(6, 3));
		System.out.println("\n\n========TEST VITESSE========\n\n");
		new Test().tester(new Vitesse(6,3,2));
	}
}
