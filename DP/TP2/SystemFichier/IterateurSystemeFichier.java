/**
* @author Richefeu
* @version 0.1 : Date : Wed Mar 16 14:15:06 CET 2022
*
*/
import java.lang.*;
import java.util.*;

public class IterateurSystemeFichier implements Iterator<Fichier> {

	private Fichier[] systeme;
	private int courrant = 0;


	public IterateurSystemeFichier(Fichier[] f){
		this.systeme = f;
	}

	@Override
	public boolean hasNext(){
		return courrant< this.systeme.length-1 ;
	}

	@Override
	public Fichier next(){
		if( ! hasNext()){
			throw new NoSuchElementException();
		}
		return systeme[courrant++];
	}

}
