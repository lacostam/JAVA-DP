/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Wed Mar 09 10:08:29 CET 2022
*
*/
public class AdaptateurOie implements Cancaneur {

	private Oie oie;

	public AdaptateurOie(){
		this.oie = new Oie();
	}

	@Override
	public void cancaner(){
		this.oie.cacarder();
	}


}
