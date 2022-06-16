/**
* @author Richefeu
* @version 0.1 : Date : Sat Jan 29 15:08:12 CET 2022
*
*/

import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

/**
 * Gestion de la pile
 * connais l'ecran
 * enregistrer
 * traiter une operation uniaire et binaire
 * clear
*/
public class UniteCentrale {

	private Ecran ecran;
	private Stack<Integer> memoire;


	public UniteCentrale(Ecran unEcran){
		this.ecran = unEcran;
		memoire = new Stack<Integer>();
	}

	public void enregistrer(String s){
		this.memoire.add(Integer.parseInt(s));
	}




	public void traiteOpUnaire(Method uneMethode){
		try{
			int res = (Integer)uneMethode.invoke( this, Integer.parseInt(this.ecran.getBuffer()));
			this.ecran.setBuffer( Integer.toString(res) );
			this.ecran.setRecouvrement(false);

		}catch(IllegalAccessException e){
			System.out.println("Erreur IllegalAccessException pour traiteOpUnaire");
		}catch(InvocationTargetException e){
			System.out.println("Erreur InvocationTargetException pour traiteOpUnaire");
		}
	}

	public void traiteOpBiaire(Method uneMethode){

		try{
			int res = (Integer)uneMethode.invoke( this, memoire.pop(), Integer.parseInt(this.ecran.getBuffer()));
			this.ecran.setBuffer( Integer.toString(res) );
			this.ecran.setRecouvrement(true);

		}catch(IllegalAccessException e){
			System.out.println("Erreur IllegalAccessException pour traiteOpUnaire");
		}catch(InvocationTargetException e){
			System.out.println("Erreur InvocationTargetException pour traiteOpUnaire");
		}
	}


	public void traiteSpeciale(Method uneMethode){

		try{
			uneMethode.invoke( this, null);

		}catch(IllegalAccessException e){
			System.out.println("Erreur IllegalAccessException pour traiteOpUnaire");
		}catch(InvocationTargetException e){
			System.out.println("Erreur InvocationTargetException pour traiteOpUnaire");
		}
	}

	public void clear(){
		this.ecran.setBuffer("0");
		this.ecran.setRecouvrement(true);

		this.memoire = new Stack<Integer>();
	}

	public void entrer(){
		this.ecran.setRecouvrement(true);
	}


	public int auCarre(int x){
		return x*x;
	}

	public int facto(int x){
		int i, fact = 1;
		for(i=1; i<=x; i++){
			fact = fact*i;
		}
		return fact;
	}

	public int addition(int x, int y){
		return x+y;
	}

	public int soustraction(int x, int y){
		return x-y;
	}
	public int multiplication(int x, int y){
		return x*y;
	}
	public int division(int x, int y){
		return x/y;
	}






}
