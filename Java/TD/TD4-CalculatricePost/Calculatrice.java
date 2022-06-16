/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Sat Jan 29 15:06:05 CET 2022
*
*/

import java.util.Map;
import java.util.HashMap;

public class Calculatrice {

	private Ecran ecran;
	private UniteCentrale uc;
	private Map<String, Touche> touches;


	public Calculatrice(){
		this.ecran = new Ecran ();
		this.uc = new UniteCentrale(this.ecran);
		this.ecran.setUc(this.uc);

		remplissage();
	}

	private void remplissage(){

		int i;
		this.touches = new HashMap<>();

		for(i=0; i<10; i++){
			this.touches.put(Integer.toString(i) , new ToucheNumerique(Integer.toString(i), this.ecran));
		}

		this.touches.put("+", new ToucheOpBinaire("+", this.uc , "Addition"));
		this.touches.put("-", new ToucheOpBinaire("-", this.uc , "Soustraction"));
		this.touches.put("/", new ToucheOpBinaire("/", this.uc , "Division"));
		this.touches.put("*", new ToucheOpBinaire("*", this.uc , "Multiplication"));

		this.touches.put("^2", new ToucheSpeciale("^2", this.uc , "auCarre"));
		this.touches.put("entre", new ToucheSpeciale("entre", this.uc , "enregistrer"));
		this.touches.put("clr", new ToucheSpeciale("clear", this.uc , "clear"));
	}


	public void afficheCatalogue(){
		System.out.println("Touche dispo : ");

		for(String s : this.touches.keySet()){
			System.out.println(s);
		}
	}

	public void appuieSurLaTouche(String id){

			if(!id.equals("aide")){
				Touche t = this.touches.get(id);

				if(t != null){
					t.appuie();
				}else{
					System.err.println("Saisie incorrect \"aide\" pour afficher touches");
				}
			}else{
				afficheCatalogue();
			}
	}


}
