/**
* @author Ricehfeu
* @version 0.1 : Date : Wed Mar 09 13:33:08 CET 2022
*
*/


public class Test {

	public static void main(String[] args) {

		System.out.println("\n\t #####################");
		System.out.println("\n\t #  TEST TRI  JAVA  #");
		System.out.println("\n\t #####################");

		BaseDonnees maBase = new BaseDonnees(new TriJava());

		maBase.ajouter("Dert");
		maBase.ajouter("Aert");
		maBase.ajouter("Nert");

		System.out.println("\n\tAFFICHAGE BASE NON TRIÉES");

		maBase.afficheDonneesNonTriees();

		System.out.println("\n\tAFFICHAGE BASE TRIÉES");
		maBase.afficheDonneesTriees();






		System.out.println("\n\t #####################");
		System.out.println("\n\t #  TEST TRI  BULLE #");
		System.out.println("\n\t #####################");

		BaseDonnees maBase2 = new BaseDonnees(new TriBulles());

		maBase2.ajouter(3);
		maBase2.ajouter(4);
		maBase2.ajouter(1);

		System.out.println("\n\tAFFICHAGE BASE NON TRIÉES");

		maBase2.afficheDonneesNonTriees();

		System.out.println("\n\tAFFICHAGE BASE  TRIÉES");
		maBase2.afficheDonneesTriees();







		System.out.println("\n\t #####################");
		System.out.println("\n\t #TEST TRI INSERTION #");
		System.out.println("\n\t #####################");

		BaseDonnees maBase3 = new BaseDonnees(new TriInsertion());

		maBase3.ajouter("Dert");
		maBase3.ajouter("Aert");
		maBase3.ajouter("Nert");

		System.out.println("\n\tAFFICHAGE BASE NON TRIÉES");

		maBase3.afficheDonneesNonTriees();

		System.out.println("\n\tAFFICHAGE BASE  TRIÉES");
		maBase3.afficheDonneesTriees();



	}
}
