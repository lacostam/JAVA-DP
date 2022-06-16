/**
* @author Richefeu
* @version 0.1 : Date : Sat Jan 22 18:29:41 CET 2022
*
*/
import java.util.*;

public class TestBase {


	/**
	 * Test de la base de dcument
	 * @see BaseDocuments
	*/
	public static void main(String [] args){

			System.out.println("\n\n\t\t###################################");
			System.out.println("\t\t######### TEST BASE  TP3 ##########");
			System.out.println("\t\t###################################\n\n");

		try{
			BaseDocuments bdMans = new BaseDocuments("Madiathèque du mans");

			Auteur isaac = new Auteur("ASIMOV", new Date(2, 1, 1920), new Date(6, 4, 1992));
			Auteur jack = new Auteur("LONDON", new Date(12, 1, 1870), new Date(22, 11, 1916));

			Auteur Jacoboni = new Auteur("Jacoboni", new Date(12, 1, 1980), null);

			Document d1 = new Document(isaac, "Les Robots", true);
			Document d2 = new Document(jack, "Le vagabond des etoiles", false);
			Document d3 = new Document(isaac, "Un defile de robots", true);
			Document d4 = new Document(isaac, "Les Robots", true);
			Document d5 = new Document(isaac, "Les cavernes d'acier", true);

			Document d6 = new Document(Jacoboni, "Le Polymorphisme A en Ruby", true);
			Document d7 = new Document(Jacoboni, "Le Polymorphisme B en Ruby", true);
			Document d8 = new Document(Jacoboni, "Le Polymorphisme C en Ruby", true);

			bdMans.ajoute(d1);
			bdMans.ajoute(d2);
			bdMans.ajoute(d3);
			bdMans.ajoute(d4);
			bdMans.ajoute(d6);
			bdMans.ajoute(d8);
			bdMans.ajoute(d7);

			bdMans.affiche();

			bdMans.supprime(d4);

			bdMans.affiche();




			try{


				NonEmprunteSelectionneur testEmprunt = new NonEmprunteSelectionneur();
				AuteurVivantSelectionneur testVivant =  new AuteurVivantSelectionneur(1930);
				MotDansTitreSelectionneur testTitre = new MotDansTitreSelectionneur("Robots");
				MotDansTitreSelectionneur test2Titre = new MotDansTitreSelectionneur("fraise");


				MotDansTitreSelectionneur titrePoly = new MotDansTitreSelectionneur("polymorphisme");
				AuteurVivantSelectionneur test2005 =  new AuteurVivantSelectionneur(2005);


				SelectionneurComposite SelecComposite =  new SelectionneurComposite();
				SelecComposite.add(titrePoly);
				SelecComposite.add(test2005);

				Iterator i;
				i = bdMans.selectionne(testEmprunt);


				System.out.println("Selection des doc non emprunté") ;
				while(i.hasNext()){
					System.out.println(i.next());
				}

				i = bdMans.selectionne(testVivant);


				System.out.println("\nTest si le document de l'auteur est decedé avec en 1930 ? :");
				while(i.hasNext()){
					System.out.println(i.next());
				}


				i = bdMans.selectionne(testTitre);

				System.out.println("\nTest si les documents ont le mot Robot dans son titre avec le document:");
				while(i.hasNext()){
					System.out.println(i.next());
				}


				i = bdMans.selectionne(test2Titre);

				System.out.println("\nTest si les documents ont le mot fraise dans son titre avec le document:");
				while(i.hasNext()){
					System.out.println(i.next());
				}


				i = bdMans.selectionne(SelecComposite);

				System.out.println("\nTest si le document a le mot polymorphisme dans son titre et que l'auteur etait toujours vivant en 2005 avec le document:");
				while(i.hasNext()){
					System.out.println(i.next());
				}

				Comparator c = new TitreComparator();
				i = bdMans.selectionne(titrePoly);



				System.out.println("\nTest liste document trié selon le titre de tous les documents dont le titre contient polymorphisme.");
				bdMans.listeTriee(i, c);

			}catch(NoSuchElementException e){
				System.err.println(e);
			}
		}catch(InvalidDateException e){
			System.err.println(e);
		}

	}//fin main
}//fin classe
