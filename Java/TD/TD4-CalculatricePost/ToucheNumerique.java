/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Sat Jan 29 15:07:40 CET 2022
*
*/
public class ToucheNumerique extends Touche {
	private Ecran ecran;


	public ToucheNumerique(String unNom, Ecran e){
		super(unNom);
		this.ecran = e;
	}

	@Override
	public void appuie(){
		this.ecran.traite(this.nom);
	}
}
