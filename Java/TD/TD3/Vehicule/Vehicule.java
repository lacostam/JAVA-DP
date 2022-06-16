/**
* @author Richefeu
* @version 0.1 : Date : Mon Jan 17 14:40:20 CET 2022
*
*/
public class Vehicule{
    protected int nbRoues;

    public void  demarrer(){ };
    public void  rouler(){ };
    public void  arreter(){ };

    public String categorie(){
        return "Je suis un vehicule";
    }

    public void description(){
        System.out.println(categorie() + " a " + nbRoues + " roues");
    }
} 
