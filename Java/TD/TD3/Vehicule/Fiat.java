/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Mon Jan 17 14:50:00 CET 2022
*
*/
public class Fiat extends Voiture{

	public void  demarrer(){

	}
    public void  rouler(){

    }
    public void  arreter(){

    }

    @Override
    public String categorie(){
        return "Je suis une fiat";
    }
	@Override
    public void description(){
        System.out.println(categorie() + " a " + this.nbRoues + " roues");
    }


}
