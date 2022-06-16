/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue Mar 22 11:31:56 CET 2022
*
*/
import java.util.*;

public class VisiteurContenu implements Visiteur{



	@Override
	public void visiteFichier(Fichier f){
		System.out.println(f.getContenu());
	}

	@Override
	public void visiteRepertoire(Repertoire r){
		System.out.println("\nNom Repoertoire: \t" + r.getNom() + "\n");
		for(Composant c  : r){
			System.out.println(c.getNom());
		}
	}

}
