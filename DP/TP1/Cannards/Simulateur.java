/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Wed Mar 09 09:55:20 CET 2022
*
*/
public class Simulateur{

	public void simuler(){

		Cancaneur colvert = new CompteurDeCancans(new Colvert());
		Cancaneur mandarin = new CompteurDeCancans(new Mandarin());
		Cancaneur canardEnPlastique = new CompteurDeCancans(new CanardEnPlastique());
		Cancaneur appeau = new CompteurDeCancans(new Appeau());
		Cancaneur oie = new CompteurDeCancans(new AdaptateurOie());
		Cancaneur mandarinBegayeur = new Begue(mandarin);

		System.out.println(" Simulateur de Canards ");

		simuler(colvert);
		simuler(mandarin);
		simuler(canardEnPlastique);
		simuler(appeau);
		simuler(oie);
		simuler(mandarinBegayeur);

		System.out.println(" Nous avons compté " + CompteurDeCancans.getNbCancans() + " cancans ");

		System.out.println("\n\t\t Test de fabrique \n\n");
		System.out.println("\n\t\t Test de fabrique  DE CANARDS\n\n");
		CompteurDeCancans.setNbCancans(0);

		FabriqueDeCanards fdca = new FabriqueDeCanards();
		FabriqueDeComptage fdco = new FabriqueDeComptage();

		Cancaneur colvert1 = fdca.creerColvert();
		Cancaneur mandarin1 = fdca.creerMandarin();
		Cancaneur canardEnPlastique1 = fdca.creerCanardEnPlastique();
		Cancaneur appeau1 = fdca.creerAppeau();
		Cancaneur oie1 = fdca.creerOie(); ;
		Cancaneur mandarinBegayeur1 = fdca.ajouterBagaiment(mandarin1);

		simuler(colvert1);
		simuler(mandarin1);
		simuler(canardEnPlastique1);
		simuler(appeau1);
		simuler(oie1);
		simuler(mandarinBegayeur1);

		System.out.println(" Nous avons compté " + CompteurDeCancans.getNbCancans() + " cancans ");

		System.out.println("\n\t\t Test de fabrique  DE COMPTAGE\n\n");

		Cancaneur colvert2 = fdco.creerColvert();
		Cancaneur mandarin2 = fdco.creerMandarin();
		Cancaneur canardEnPlastique2 = fdco.creerCanardEnPlastique();
		Cancaneur appeau2 = fdco.creerAppeau();
		Cancaneur oie2 = fdco.creerOie(); ;
		Cancaneur mandarinBegayeur2 = fdco.ajouterBagaiment(mandarin1);

		simuler(colvert2);
		simuler(mandarin2);
		simuler(canardEnPlastique2);
		simuler(appeau2);
		simuler(oie2);
		simuler(mandarinBegayeur2);

		System.out.println(" Nous avons compté " + CompteurDeCancans.getNbCancans() + " cancans ");
		CompteurDeCancans.setNbCancans(0);

		System.out.println("\n\t\t Test TROUPE\n\n");

		TroupeDeCancaneurs uneTroupe = new TroupeDeCancaneurs();

		uneTroupe.ajouter(mandarin1);
		uneTroupe.ajouter(mandarinBegayeur1);
		uneTroupe.ajouter(oie2);
		uneTroupe.ajouter(canardEnPlastique2);

		uneTroupe.cancaner();

	}

	public void simuler(Cancaneur c){
		c.cancaner();
	}

}
