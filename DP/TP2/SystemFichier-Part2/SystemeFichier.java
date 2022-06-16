/**
* @author Richefeu
* @version 0.1 : Date : Wed Mar 16 16:10:14 CET 2022
*
*/
import java.util.*;


public class SystemeFichier implements Iterable<Fichier> {

	private Fichier [] systeme;
	private Repertoire racine;


	public SystemeFichier(){
		this.systeme = new Fichier[3];
	}

	@Override
   	public Iterator<Fichier> iterator() {
      	return new IterateurSystemeFichier(this.systeme);
   	}

   	public Fichier[] getSysteme(){
   		return this.systeme;
   	}

}
