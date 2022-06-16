/**
* @author Richefeu
* @version 0.1 : Date : Fri Mar 25 14:35:25 CET 2022
*
* Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*/

import java.lang.*;
import java.io.IOException;
import java.util.*;

/**
 * Classe permettant de mettr en oeuvre les differen observateur visitteur commande... afin que le jeu de la vie se deroule correctement
*/
public class JeuDeLaVie implements Observable{



	/**Le jeu est une grille de cellule*/
	private Cellule[][] grille ;

	/**Taille de la grille ici 10x10 */
	private final int xMax = 120, yMax=120;

	/**Liste des observateur*/
	private List<Observateur> observateurs;

	/**Liste des Commandes*/
	private List<Commande> commandes;

	/**visiteur*/
	private Visiteur visiteur;

	/**Permet de savoir si le le jeu est lancé*/
	private boolean lance;

	/**GEstion du nombres de generation*/
	private int nbGene;





	/**
	 * Constructeur du jeu de la vie
	 * creeation de  la grille avec le xMAx et yMax
	*/
	public JeuDeLaVie (){

		this.grille = new Cellule[xMax][yMax];
		this.observateurs = new ArrayList<Observateur>();
		this.commandes = new ArrayList<Commande>();
		this.lance = false;
	}

	/**
	 * Initialise la gille de facon aléatroire
	*/
	public void initialiseGrille (){
		int x, y;

		for(x =0 ; x < xMax; x++){
			for(y =0 ; y < yMax; y++){

				int rand = (int)(Math.random() * 2 );

				if(rand == 1){
					this.grille[x][y] = new Cellule(x ,y, CelluleEtatVivant.getInstance());
				}
				else{
					this.grille[x][y] = new Cellule(x ,y, CelluleEtatMort.getInstance());
				}
			}
		}
		nbGene = 0;
	}

	/**
	 * Initialise la gille remplie
	*/
	public void initialiseGrilleRemplir(){
		int x, y;

		for(x =0 ; x < xMax; x++){
			for(y =0 ; y < yMax; y++){
				this.grille[x][y] = new Cellule(x ,y, CelluleEtatVivant.getInstance());
			}
		}
		nbGene = 0;
	}





	//////////////////////////Observateur//////////////////////
	/**
	 * Attache un nouvel observateur
	 * @see Observable
	*/
	@Override
	public void attacheObservateur(Observateur o){
		this.observateurs.add(o);
	}

	/**
	 * Detache un nouvel observateur
	 * @see Observable
	*/
	@Override
	public void detacheObservateur(Observateur o){
		this.observateurs.remove(o);
	}

	/**
	 * notifie observateurs`
	 *  @see Observable
	*/
	@Override
	public void notifieObservateurs(){
		observateurs.forEach(Observateur :: actualise);
		nbGene++;
		/*
		for (Observateur o : this.observateurs){
			o.actualise();
		}
		*/
	}





	/////////////////////////Commande////////////////////////////////////
	/**
	 * Ajoute un commande dans la liste
	 *
	 * @param c la commande a ajouter
	*/
	public void ajouterCommande(Commande c){
		this.commandes.add(c);
	}

	/**
	 * Excecute toutes le commandes de la liste
	*/
	public void executerCommandes(){
		commandes.forEach(Commande::executer);
		commandes.clear();
	}





	/////////////////////////Visiteur////////////////////////////////////
	/**
	 * Methode permettant de distribuer les visiteur(meut ou vit) a toutes les cellules
	*/
	public void distribueVisiteur(){

		for(int x =0 ; x < xMax-1; x++){
			for(int y =0 ; y < yMax-1; y++){
				grille[x][y].accepte(visiteur);
			}
		}
	}

	/**
	 * Mathode permettan de faire avancer d'une generation l'automate
	*/
	public void calculerGenerationSuivante(){
		distribueVisiteur();
		executerCommandes();
		notifieObservateurs();
	}







	/////////////////////////Setter////////////////////////////////////

	/**
	 * Methode d'acces en modification de visiteur
	 * @param unV le visiteur
	*/
	public void setVisiteur(Visiteur unV){
		this.visiteur = unV;
	}

	/**
	 * Methode d'acces en modification de lance
	*/
	public void lance() {
        this.lance = true;
    }

	/**
	 * Methode d'acces en modification de lance
	*/
    public void stop() {
        this.lance = false;
    }






	/////////////////////////Getter////////////////////////////////////
	/**
	 * Mehtode d'acces a une cellule de la gille de coordonnées unX et unY
	 * @param unX coordonnee X
	 * @param unY coordonnée Y
	 *
	 * @return la cellule ciblée
	*/
	Cellule getGrilleXY(int unX, int unY){
		return this.grille[unX][unY];
	}

	/**
	 * Methode d'acces a la variable xMax
	 * @return xMax
	*/
	public int getXMax(){
		return this.xMax;
	}

	/**
	 * Methode d'acces a la variable yMax
	 * @return yMax
	*/
	public int getYMax(){
		return this.yMax;
	}

	/**
	 * Methode d'acces a la variable visiteur
	 * @return visiteur
	*/
	public Visiteur getVisiteur(){
		return this.visiteur;
	}


	/**
	 * Methode d'acces a la variable lance
	 * @return lance
	*/
    public Boolean estLance() {
        return this.lance;
    }

	/**
	 * Methode d'acces a la variable nbGene
	 * @return nbGene
	*/
    public int getNbGene(){
    	return this.nbGene;
    }




}//fin JeuDeLaVie
