/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Sat Jan 29 15:07:52 CET 2022
*
*/
import java.lang.reflect.Method;

public class ToucheSpeciale extends ToucheFonction {


	public ToucheSpeciale(String unNom, UniteCentrale uc, String fonction){
		super(unNom, uc, fonction);
	}


	@Override
	public void appuie(){

		Method m;

		try{
			m = this.uc.getClass().getMethod(this.nomFonction, null);
		}catch(NoSuchMethodException e ){
			System.err.println("La touche n'a pas de fonction");
			return ;
		}

		this.uc.traiteSpeciale(m);
	}
}
