/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Sat Jan 29 17:49:02 CET 2022
*
*/


import java.util.Scanner;


public class Main {

	public static void main(String [] args){

		Ecran ecran = new Ecran();
		UniteCentrale uc = new UniteCentrale(ecran);
		ecran.setUc(uc);


		Touche t0 = new ToucheNumerique ("0", ecran);
		Touche t1 = new ToucheNumerique ("1", ecran);
		Touche t2 = new ToucheNumerique ("2", ecran);
		Touche t3 = new ToucheNumerique ("3", ecran);
		Touche t4 = new ToucheNumerique ("4", ecran);
		Touche t5 = new ToucheNumerique ("5", ecran);
		Touche t6 = new ToucheNumerique ("6", ecran);
		Touche t7 = new ToucheNumerique ("7", ecran);
		Touche t8 = new ToucheNumerique ("8", ecran);
		Touche t9 = new ToucheNumerique ("9", ecran);

		Touche clear = new ToucheSpeciale("Clear", uc, "clear");
		Touche entrer = new ToucheSpeciale("ent", uc, "entrer");

		Touche carre = new ToucheOpUnaire("^2", uc, "auCarre");
		Touche facto = new ToucheOpUnaire("fct", uc, "facto");

		Touche add = new ToucheOpBinaire("+", uc, "addition");
		Touche sous = new ToucheOpBinaire("-", uc, "soustraction");
		Touche mul = new ToucheOpBinaire("*", uc, "multiplication");
		Touche div = new ToucheOpBinaire("/", uc, "division");

		System.out.println(ecran);

/*

		Scanner sc = new Scanner(System.in);

		System.out.println("Saisissez une operation postFixe : ");
    	String equation = sc.nextLine();

 	 	String[] equationSplit = equation.split(" ");

 	 	for (String s : equationSplit){
 	 		System.out.println(s);
 	 	}
*/



		t3.appuie();
		System.out.println(ecran);

		t0.appuie();
		System.out.println(ecran);

		entrer.appuie();
		System.out.println(ecran);

		t5.appuie();
		System.out.println(ecran);

		facto.appuie();
		System.out.println(ecran);

		add.appuie();

		System.out.println("RESULTAT");
		System.out.println(ecran);


	}

}
