/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Wed Mar 09 10:16:22 CET 2022
*
*/
public class CompteurDeCancans implements Cancaneur{

	private static int nbCancans = 0;
	Cancaneur c;

	public CompteurDeCancans(Cancaneur c){
		this.c = c;
		nbCancans++;
	}

	@Override
	public void cancaner(){
		this.c.cancaner();
	}

	public static int getNbCancans(){
		return nbCancans;
	}

	public static void setNbCancans(int nb){
		nbCancans = nb ;
	}


}
