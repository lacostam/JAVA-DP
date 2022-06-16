/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Mon Jan 17 14:54:00 CET 2022
*
*/
public class Test {
	public static void main(String args[]){
        Vehicule v;
        v = new Vehicule();
        v.description();
        v = new Voiture();
        v.description();
        v = new Bus();
        v.description();
        v = new Fiat();
        v.description();
    }
}
