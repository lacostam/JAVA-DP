/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Thu Feb 03 18:39:32 CET 2022
*
*/
package abr;

public class ABR <A extends Comparable<A>> {

	private A racine;
	private ABR <A> sousArbreGauche = null;
	private ABR <A> sousArbreDroit = null;


	public ABR(A uneRacine){
		this.racine = uneRacine;
	}


	public ABR(A uneRacine, ABR <A> unDroit, ABR <A> unGauche){
		this.racine = uneRacine;
		this.sousArbreGauche = unGauche;
		this.sousArbreDroit = unDroit;
	}

	public A valeur(){
		return this.racine;
	}

	public ABR filsGauche(){
		return this.sousArbreGauche;
	}

	public ABR filsDroit(){
		return this.sousArbreDroit;
	}

	public void affecterFilsGauche(ABR<A> nom){
		this.sousArbreGauche = nom ;
	}

	public void affecterFilsDroit(ABR<A> nom){
		this.sousArbreDroit = nom ;
	}

	public boolean existeFilsGauche(){
		return (this.sousArbreGauche != null);
	}

	public boolean existeFilsDroit(){
		return (this.sousArbreDroit != null);
	}

	public boolean estFeuille(A elem){
		return (!existeFilsDroit() && !existeFilsGauche());
	}

	public boolean contient (A elem){
		return (this.racine.equals(elem) || (existeFilsDroit() && this.sousArbreDroit.contient(elem)) || (existeFilsGauche() && this.sousArbreGauche.contient(elem)));
	}



	public void inserer (A elem)throws DejaPresentException{

		if(contient(elem)){

			throw new DejaPresentException ("Il y a deja " + elem + " dans l'arbre");

		}else{

			int compar = this.racine.compareTo(elem);

			if(compar > 0){
				if(existeFilsGauche()){
					this.sousArbreGauche.inserer(elem);
				}else{
					this.sousArbreGauche = new ABR<A>(elem);
				}
			}else{
				if(existeFilsDroit()){
					this.sousArbreDroit.inserer(elem);
				}else{
					this.sousArbreDroit = new ABR<A>(elem);
				}
			}
		}
	}


	public void afficherRacine(int nb){
		int i;

		for(i=0; i< nb; i++){
			System.out.println("\t");
		}
		System.out.println(this.racine);

	}





	public void afficherPrefixe(){
		afficherPrefixe(0);
	}

	public void afficherPrefixe(int nb){

		afficherRacine(nb);

		if(existeFilsGauche()){

			for(int i= 0; i <nb; i++){
				System.out.println("\t");
			}
		}
		System.out.println("SousGauche");

		sousArbreGauche.afficherPrefixe(nb+1);


		if(existeFilsDroit()){

			for(int i= 0; i <nb; i++){
				System.out.println("\t");
			}
		}
		System.out.println("SousDroit");

		sousArbreGauche.afficherPrefixe(nb+1);

	}











	public void afficherInfixe(){
		afficherInfixe(0);
	}

	public void afficherInfixe(int nb){


		if(existeFilsGauche()){
			nb +=1;
			sousArbreGauche.afficherInfixe(nb);

			for(int i= 0; i <nb; i++){
				System.out.println("\t");
			}
			System.out.println("SousGauche");
		}


		afficherRacine(nb);


		if(existeFilsDroit()){
			nb+=1;
			for(int i= 0; i <nb; i++){
				System.out.println("\t");
			}
			System.out.println("SousDroit");
			sousArbreGauche.afficherInfixe(nb);
		}
	}









	public void afficherPostfixe(){
		afficherPostfixe(0);
	}

	public void afficherPostfixe(int nb){


		if(existeFilsGauche()){

			sousArbreGauche.afficherPostfixe(nb+1);

			for(int i= 0; i <nb; i++){
				System.out.println("\t");
			}
			System.out.println("SousGauche");
		}


		if(existeFilsDroit()){

			sousArbreGauche.afficherPostfixe(nb+1);

			for(int i= 0; i <nb; i++){
				System.out.println("\t");
			}
			System.out.println("SousDroit");

		}

		afficherRacine(nb);
	}

}
