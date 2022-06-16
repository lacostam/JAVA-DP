/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Sun Jan 16 16:09:36 CET 2022
*
*/
public class Latence extends Afficheur{

	private int latence = 0;

	public Latence(int uneTaille, int lat){
		super(uneTaille);
		this.latence = lat;
	}

	public void setMessage(char[] unMessage){
		int i;
		char[] newMsg = new char[unMessage.length +this.latence];

		for(i=0; i< unMessage.length ; i++)
			newMsg[i] = unMessage[i];

		for(i=unMessage.length; i< newMsg.length ; i++)
			newMsg[i] = ' ';

		this.message = newMsg;
	}
}
