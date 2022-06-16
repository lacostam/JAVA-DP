/**
* @author Richefeu
* @version 0.1 : Date : Fri Jan 21 14:05:20 CET 2022
*
*/

public class Test {


	/**
	 * Programme de test permettant de tester la classe Date et ces fonctionnalités
	*/
	public static void main(String args[]){

		System.out.println("\n\n\t#############################\n");
		System.out.println("\t############ DATE ###########\n");
		System.out.println("\t#############################\n");


		try{
			Date d1 = new Date(20,9, 2000);
			Date d3 = new Date(33,12, 2000);


			System.out.println(d1);
			System.out.println(d3);

		}catch(InvalidDateException e){
			System.err.println(e);
		}



		try{
			Date d2 = new Date(20,13, 2000);
			System.out.println(d2);

		}catch(InvalidDateException e){
			System.err.println(e);
		}

		try{
			Date d5 = new Date(20,9, 2000);
			Date d6 = new Date(20,9, 2000);

			Date d7 = new Date(21,9, 2000);
			Date d8 = new Date(20,8, 2000);
			Date d9 = new Date(20,9, 2001);

			System.out.println(d5);

			System.out.println(d5.compareTo(d6));
			System.out.println(d5.compareTo(d7));
			System.out.println(d5.compareTo(d8));
			System.out.println(d5.compareTo(d9));

		}catch(InvalidDateException e){
			System.err.println(e);
		}


		System.out.println("\n\n\t#############################\n");
		System.out.println("\t########### AUTEUR ##########\n");
		System.out.println("\t#############################\n");


		try{
			Date dN = new Date(20, 8, 1995);
			Date dM =new Date (10, 4, 2022);

			Auteur a1 = new Auteur("PATRICK", dN, null);
			Auteur a2 = new Auteur("JEAN", dN, dM);

			System.out.println(a1);
			System.out.println(a2);

			if (a2.equals(a1)){
				System.out.println("Ces auteurs sont le memes");
			}else {
				System.out.println("Pas les memes auteurs");
			}

			if (a1.equals(a1)){
				System.out.println("Ces auteurs sont les memes");
			}else{
				System.out.println("Pas les memes auteurs");
			}
		}catch(InvalidDateException e){
			System.err.println(e);
		}


		System.out.println("\n\n\t#############################\n");
		System.out.println("\t########## DOCUMENT #########\n");
		System.out.println("\t#############################\n");


		try{
			Date dN = new Date(20, 8, 1995);
			Date dM =new Date (10, 4, 2022);

			Auteur a1 = new Auteur("PATRICK", dN, null);
			Auteur a2 = new Auteur("JEAN", dN, dM);

			Document d1 = new Document(a1, "JAVA POUR LES NULS", true);
			Document d2 = new Document (a1, "RUBY POUR LES NULS", true);
			Document d3 = new Document(a1, "JAVA POUR LES NULS", true);

			System.out.println(d1);
			System.out.println(d2);
			d1.setStatut(false);
			System.out.println(d1);

			if (d1.equals(d2)){
				System.out.println("Meme document");
			}else {
				System.out.println("Pas les memes documents");
			}

			if (d1.equals(d3)){
				System.out.println("Meme document");
			}else{
				System.out.println("Pas les memes documents");
			}

		}catch(InvalidDateException e){
			System.err.println(e);
		}


	}//fin main


}
