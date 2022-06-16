/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Sat Jan 29 15:07:18 CET 2022
*
*/
import java.lang.reflect.Method;

public class ToucheOpBinaire extends ToucheFonction {

	public ToucheOpBinaire(String unNom, UniteCentrale uc, String fonction){
		super(unNom, uc, fonction);
	}


	@Override
	public void appuie(){

		Method m;

		try{
			m = this.uc.getClass().getMethod(this.nomFonction, int.class, int.class);

		}catch(NoSuchMethodException e ){
			System.err.println("La touche n'a pas de fonction");
			return ;
		}

		this.uc.traiteOpBiaire(m);
	}
}
