/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Mon Jan 17 14:48:27 CET 2022
*
*/
public class Bus extends Vehicule{
	protected int nbRoues = 6;

	public void  demarrer(){

	}
    public void  rouler(){

    }
    public void  arreter(){

    }
	@Override
    public String categorie(){
        return "Je suis un Bus";
    }
	@Override
    public void description(){
        System.out.println(categorie() + " a " + this.nbRoues + " roues");
    }


}
