/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Mon Jan 10 17:15:24 CET 2022
*
*/
public class Test {
	public static void main(String [] args){

		int leNombre = Integer.parseInt(args[0]);
		Generateur leGene = new Generateur();
		leGene.lanceToi(leNombre);
		System.out.println(leGene);

	}
}
