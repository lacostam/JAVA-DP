/**
* @author Richefeu
* @version 0.1 : Date : Sat Jan 15 15:38:12 CET 2022
*
*/
public class Afficheur {

	protected char[] message;
	private Decaleur monDecaleur;
	private int courant;

	public Afficheur(int uneTaille){
		this.monDecaleur = new Decaleur(uneTaille);
		this.message = new char[uneTaille];
	}

	public Afficheur(int uneTaille, char[] m ){
		this.monDecaleur = new Decaleur(uneTaille);
		setMessage(m);
	}


	// fixe un nouveau message a afficher
	public void setMessage(char[] unMessage){
		this.message = unMessage;
		this.courant = 0;
	}


	// un top d’horloge
	public void top() {

		monDecaleur.decale(this.message[this.courant]);
		this.courant ++;

		if(this.courant >= this.message.length)
			this.courant = 0;

	}


	// renvoie ce qui doit etre affiche
	public String toString(){
		return this.monDecaleur.toString();
	}
}
