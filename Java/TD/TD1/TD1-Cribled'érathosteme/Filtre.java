/**
* @author Richefeu
* @version 0.1 : Date : Mon Jan 10 16:18:24 CET 2022
*
*/
public class Filtre {


	private int valeur;
	private Filtre suivant;

	public Filtre(int uneValeur){
		valeur = uneValeur;
		suivant = null;
	}

	public boolean aToiDeTraiter(int unNombre){
		if( unNombre == valeur){
			System.out.println(unNombre + "est premier");
			return true;
		}else{

			if(unNombre % valeur == 0){
				System.out.println(unNombre + "n'est pas premier");
				return false;
			}else{

				if(suivant != null){
					suivant.aToiDeTraiter(unNombre);
				}else {
					System.out.println(unNombre + "est premier");
					suivant = new Filtre(unNombre);
					return true;
				}
			}
			return false;
		}
	}//fin aToiDeTraiter

	@Override
	public String toString(){

		String chaine = String.valueOf(valeur) + "     ";

		if (suivant != null){
			chaine+=suivant.toString();
		}
		return chaine;
	}

}
