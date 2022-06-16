/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue Mar 22 14:50:12 CET 2022
*
*/
import java.util.*;
import java.time.LocalDate;

public class VisiteurPlusAncienFichier implements Visiteur {

	private Composant plusAncien;

	@Override
	public void visiteFichier(Fichier f){

		if((plusAncien == null) || (plusAncien.getDate().compareTo(f.getDate()) <0)){
			plusAncien = f;

		}

	}

	@Override
	public void visiteRepertoire(Repertoire r){

		if((plusAncien == null) || (plusAncien.getDate().compareTo(r.getDate()) <0)){
			plusAncien = r;
		}
	}

	public Composant getPlusAncien(){
		return this.plusAncien;
	}
}
