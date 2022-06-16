/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Wed Mar 09 10:38:17 CET 2022
*
*/
public class FabriqueDeComptage implements FabriqueAbstraite {

	@Override
	public Cancaneur creerColvert(){
		return new CompteurDeCancans(new Colvert());
	}

	@Override
	public Cancaneur creerMandarin(){
		return new CompteurDeCancans(new Mandarin());
	}

	@Override
	public Cancaneur creerCanardEnPlastique(){
		return new CompteurDeCancans(new CanardEnPlastique());
	}

	@Override
	public Cancaneur creerAppeau(){
		return new CompteurDeCancans(new Appeau());
	}

	@Override
	public Cancaneur creerOie(){
		return new CompteurDeCancans(new AdaptateurOie());
	}

	@Override
	public Cancaneur ajouterBagaiment(Cancaneur c){
		return new Begue(c);
	}
}
