/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Wed Mar 09 10:31:10 CET 2022
*
*/
public interface FabriqueAbstraite {

	public Cancaneur creerColvert();
	public Cancaneur creerMandarin();
	public Cancaneur creerCanardEnPlastique();
	public Cancaneur creerAppeau();
	public Cancaneur creerOie();

	public Cancaneur ajouterBagaiment(Cancaneur c);
}
