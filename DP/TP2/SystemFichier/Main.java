/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Wed Mar 16 14:48:26 CET 2022
*
*/
public class Main {

	public static void main(String [] args){


		SystemeFichier systeme = new SystemeFichier();

		systeme.getSysteme()[0] = new Fichier("toto", "dzadzadaz", 100);
		systeme.getSysteme()[1] = new Fichier("titi", "titi fichier", 500);
		systeme.getSysteme()[2] = new Fichier("tata", "tata fichier", 20);


		IterateurSystemeFichier it = (IterateurSystemeFichier)systeme.iterator();

		Fichier max = it.next();

		while(it.hasNext()){
			Fichier suivant = it.next();

			if (suivant.getTaille() > max.getTaille()){
				max = suivant;
			}
		}
		System.out.println("Le plus grand fichier est " +max.getNom()+ " Avec une taille de : " +max.getTaille());


	}
}
