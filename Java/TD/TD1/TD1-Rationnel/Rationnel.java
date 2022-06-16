/**
* @author Richefeu
* @version 0.1 : Date : Thu Jan 13 16:05:36 CET 2022
*
*/
public class Rationnel {


	private int numerateur;
	private int denumerateur;




	// constructeur
	public Rationnel(int num,int denum){
		this.numerateur = num;
		this.denumerateur = denum;
	}



	// Renvoie la valeur du numérateur du rationnel
	public int getNum(){
		return numerateur;
	}




	// Renvoie la valeur du dénominateur du rationnel
	public int getDen(){
		return denumerateur;
	}




	// Renvoie le double le plus proche du rationnel représenté par l'objet
	public double toDouble(){
		return ((double) numerateur/denumerateur);
	}




	// Renvoie un nouvel objet Rationnel somme du rationnel sur lequel
	// s’applique la méthode et du rationnel r (this + r)
	public Rationnel somme(Rationnel r){
		Rationnel res = new Rationnel( (this.numerateur * r.denumerateur + r.numerateur * this.denumerateur) , (this.denumerateur * r.denumerateur));
		return res;
	}




	// Renvoie un nouvel objet Rationnel différence du rationnel sur lequel
	// s’applique la méthode et du rationnel r (this – r)
	public Rationnel difference(Rationnel r){
		Rationnel res = new Rationnel( (this.numerateur * r.denumerateur - r.numerateur * this.denumerateur) , (this.denumerateur * r.denumerateur));
		return res;
	}




	// Renvoie un nouvel objet Rationnel produit du rationnel sur lequel
	// s’applique la méthode et du rationnel r (this * r)
	public Rationnel produit(Rationnel r){
		Rationnel res = new Rationnel( (this.numerateur * r.numerateur) , (this.denumerateur * r.denumerateur));
		return res;
	}




	// Renvoie un nouvel objet Rationnel quotient du rationnel sur lequel
	// s’applique la méthode et du rationnel r (this / r)
	public Rationnel quotient(Rationnel r){
		Rationnel res = new Rationnel( (this.numerateur * r.denumerateur) , (this.denumerateur * r.numerateur));
		return res;
	}



	// Renvoie un entier :
	// < 0 si le rationnel sur lequel s’applique la méthode est plus petit
	// que r
	// = 0 s’ils sont égaux
	// > 0 si r est plus petit
	public int compareTo(Rationnel r){
		return ((int) (difference(r).numerateur)) * (numerateur * denumerateur > 0 ? 1 : -1);
	}




	//Renvoie le rationnel valeur absolue du rationnel appelant.
	public Rationnel abs(){
		Rationnel res = new Rationnel(this.numerateur * (-1), this.denumerateur);

		if(this.compareTo(res) >= 0)
			return this;

		return res;
	}




	public static Rationnel moyenne(Rationnel[] t){

		Rationnel som = new Rationnel(0, 1);
		Rationnel div = new Rationnel(t.length, 1);

		int i;
		for (i=0; i<t.length ; i++){
			som = som.somme(t[i]);
		}

		som = som.quotient(div);

		return som;
	}


	//public static Rationnel[] systeme(int a, int b, int c, int d, int e, int f){

	//}




	@Override
	public String toString(){
		return this.numerateur + "/" + this.denumerateur;
	}


	public static void main (String [] args){


		Rationnel r1 = new Rationnel(2, 3);
		Rationnel r2 = new Rationnel(5, 3);
		Rationnel r3 = new Rationnel(5, 7);

		System.out.println("\t\t##########################");
		System.out.println("\t\t# AFFICHAGE DES FACTIONS #");
		System.out.println("\t\t##########################");


		System.out.println("\t\t Fraction n° 1 : " + r1);
		System.out.println("\t\t Fraction n° 2 : " + r2);
		System.out.println("\t\t Fraction n° 3 : " + r3);


		System.out.println("\n\n\t\t##########################");
		System.out.println("\t\t#  SOMMES DE FACTIONS    #");
		System.out.println("\t\t##########################");

		System.out.println("\t\t Fraction n° 1 + n° 2 : " + r1.somme(r2));
		System.out.println("\t\t Fraction n° 1 + n° 3 : " + r1.somme(r3));


		System.out.println("\n\n\t\t##########################");
		System.out.println("\t\t# DIFFERENCES DE FACTIONS #");
		System.out.println("\t\t##########################");

		System.out.println("\t\t Fraction n° 2 - n° 1 : " + r2.difference(r1));
		System.out.println("\t\t Fraction n° 3 - n° 1 : " + r3.difference(r1));


		System.out.println("\n\n\t\t##########################");
		System.out.println("\t\t# PRODUIT DE FACTION     #");
		System.out.println("\t\t##########################");

		System.out.println("\t\t Fraction n° 2 * n° 1 : " + r2.produit(r1));
		System.out.println("\t\t Fraction n° 3 * n° 1 : " + r3.produit(r1));


		System.out.println("\n\n\t\t##########################");
		System.out.println("\t\t# QUOTIENT DE FACTION    #");
		System.out.println("\t\t##########################");

		System.out.println("\t\t Fraction n° 2 / n° 1 : " + r2.quotient(r1));
		System.out.println("\t\t Fraction n° 3 / n° 1 : " + r3.quotient(r1));



	}


}
