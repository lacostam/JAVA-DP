/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Mon Jan 17 14:48:12 CET 2022
*
*/
public class Voiture extends Vehicule{

	protected int nbRoues = 4;

	public void  demarrer(){

	}
    public void  rouler(){

    }
    public void  arreter(){

    }

    @Override
    public String categorie(){
        return "Je suis une voiture";
    }

	@Override
    public void description(){
        System.out.println(categorie() + " a " + this.nbRoues + " roues");
    }



}
