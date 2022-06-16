/**
* @author Richefeu
* @version 0.1 : Date : Fri Jan 14 17:24:51 CET 2022
*
*/
package location;

public class Personne {

	private String nom;
	private int age, salaire;
	private boolean permis;

	public Personne(String unNom, int unAge, int unSalaire, boolean unPermis){
		this.nom = unNom;
		this.age = unAge;
		this.salaire = unSalaire;
		this.permis = unPermis;
	}

	public String getNom(){
		return nom;
	}

	public int getAge(){
		return age;
	}

	public int getSalaire(){
		return salaire;
	}

	public boolean hasPermis(){
		return permis;
	}

	public String toString(){
		return nom;
	}
}
