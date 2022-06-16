/**
* @author Richefeu
* @version 0.1 : Date : Thu Jan 13 14:24:48 CET 2022
*
*/
import java.lang.Math;

public class EnsembleDeChiffres {


	private boolean[] present ;

	// constructeur
	// construit et initialise present de sorte que l'objet EnsembleDeChiffres
	// créé corresponde à l'ensemble vide
	public EnsembleDeChiffres(){
		present = new boolean[10];
	}




	// méthodes
	// marque la présence du chiffre i dans l'ensemble
	public void ajoute(int i){
		present[i] = true;
	}



	// marque le chiffre i comme n'étant plus présent dans l'ensemble
	public void retire(int i){
		present[i] = false;
	}



	// initialise au hasard l'ensemble
	// (la présence ou non de chaque chiffre est tirée au hasard)
	public void tirerAuHasard(){
		int i;
		for(i = 0; i < present.length ; i++){
			present[i] = (Math.random() < 0.5);
		}
	}



	// retourne true si le chiffre i appartient à l'ensemble false sinon
	public boolean appartient(int i){
		return present[i];
	}



	// construit et retourne un nouvel ensemble qui est le résultat de
	// l'intersection de l'ensemble sur lequel s’applique la méthode
	// et de l'ensemble e passé en paramètre
	public EnsembleDeChiffres intersectionAvec(EnsembleDeChiffres e){

		EnsembleDeChiffres inter = new EnsembleDeChiffres();

		int i;

		for(i = 0; i < present.length; i++){
			inter.present[i] = this.present[i] && e.present[i];
		}

		return inter;

	}



	// construit et retourne un nouvel ensemble qui est le résultat de
	// l'union de l'ensemble receveur avec l'ensemble e
	public EnsembleDeChiffres unionAvec(EnsembleDeChiffres e){

		EnsembleDeChiffres union = new EnsembleDeChiffres();

		int i;

		for(i = 0; i < present.length; i++){
			union.present[i] = this.present[i] || e.present[i];
		}

		return union;
	}

	@Override
	public boolean equals (Object o){

		if( o instanceof EnsembleDeChiffres){

			EnsembleDeChiffres e = (EnsembleDeChiffres) o;
			int i;
			for(i = 0 ; i < present.length && (this.present[i] == e.present[i]) ; i++){
				return (i>=10) ?  true:false;
			}
		}
		return false;
	}

	// retourne true si l'ensemble est inclus dans l'ensemble e, false sinon
	public boolean estInclusDans(EnsembleDeChiffres e){
		return this.equals(this.intersectionAvec(e));
	}



	// affiche l'ensemble à l'écran, sous la forme suivante : {0 4 6 9}
	@Override
	public String toString(){
		String chaine = "";

		int i;

		for(i=0; i < present.length; i++){

			if(this.present[i] == true){
				chaine += i;
			}

		}
		return "Ensemble de chiffres => {"+chaine+"}";
	}






	public static void main(String [] args){

		EnsembleDeChiffres e1 = new EnsembleDeChiffres();
		e1.tirerAuHasard();
		System.out.println(e1);

		EnsembleDeChiffres e2 = new EnsembleDeChiffres();
		e2.tirerAuHasard();
		System.out.println(e2);


		EnsembleDeChiffres e3 = new EnsembleDeChiffres();

		System.out.println("retire de 3");
		e1.retire(3);
		System.out.println(e1);

		System.out.println("Ajout de 3");
		e1.ajoute(3);
		System.out.println(e1);

		System.out.println("Test si 3 fait parti de l'ensemble");

		System.out.println(e1.appartient(3));

		System.out.println("retire de 3");
		e1.retire(3);
		System.out.println(e1);

		System.out.println("Test si 3 fait parti de l'ensemble");
		System.out.println(e1.appartient(3));

		System.out.println("UNION");
		e3 = e1.unionAvec(e2);
		System.out.println(e3);

		System.out.println("INTER");
		e3 = e1.intersectionAvec(e2);
		System.out.println(e3);


	}




}
