/**
* @author Richefeu
* @version 0.1 : Date : Sat Jan 15 15:27:53 CET 2022
*
*/
public class Decaleur {

	private char [] message;

	public Decaleur(int uneTaille){
		this.message = new char [uneTaille];
		raz();
	}

	public int getLargeur(){
		return this.message.length;
	}

	public void raz(){

		for(int i = 0; i < this.message.length ; i++){
			this.message[i] = ' ';
		}
	}


	public char decale(char uneLettre){
		int i;
		char tmp = message[0];

		for(i = 0 ; i< this.message.length -1 ; i++){
			this.message[i] = this.message[i+1];
		}
		this.message[this.message.length -1] = uneLettre;

		return tmp;
	}


	@Override
	public String toString(){
		return new String(this.message);
	}



}
