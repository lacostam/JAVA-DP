/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Wed Mar 09 10:23:37 CET 2022
*
*/
public class Begue implements Cancaneur{

	private Cancaneur c;

	public Begue(Cancaneur c){
		this.c = c;
	}

	@Override
	public void cancaner(){
		System.out.println("Je bebebegaye");
	}

}
