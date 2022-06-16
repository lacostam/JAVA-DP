/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Wed Mar 09 10:31:31 CET 2022
*
*/
public class FabriqueDeCanards implements FabriqueAbstraite {

	@Override
	public Cancaneur creerColvert(){
		return new Colvert();
	}

	@Override
	public Cancaneur creerMandarin(){
		return new Mandarin();
	}

	@Override
	public Cancaneur creerCanardEnPlastique(){
		return new CanardEnPlastique();
	}

	@Override
	public Cancaneur creerAppeau(){
		return new Appeau();
	}

	@Override
	public Cancaneur creerOie(){
		return new AdaptateurOie();
	}

	@Override
	public Cancaneur ajouterBagaiment(Cancaneur c){
		return new Begue(c);
	}
}
