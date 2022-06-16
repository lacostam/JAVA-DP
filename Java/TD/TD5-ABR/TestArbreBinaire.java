/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Thu Feb 03 19:39:30 CET 2022
*
*/
package abr;


public class TestArbreBinaire {

	public static void main(String [] args){

		ABR <Integer> abInt = new ABR<Integer>(5);
		ABR <String> abString = new ABR<String>("test");

		try{
			abInt.inserer(1);
			//abInt.inserer(1);
			abInt.inserer(2);
			abInt.inserer(4);
			abInt.inserer(11);
			abInt.inserer(3);
			abInt.inserer(100);
			abInt.inserer(30);
			abInt.inserer(300);
			abInt.inserer(3000);


			abInt.afficherInfixe();



		}catch(DejaPresentException e){
			System.out.println("Erreur 		: " + e.getMessage() );
		}


	}
}
