/**
* @author Richefeu
* @version 0.1 : Date : Thu Apr 21 20:56:11 CEST 2022
*
*	Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
*
*/

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.io.*;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Classe permettant de mettre en place une interface graphique a l'aide de swing
*/
public class Interface extends JFrame {

	/** Liste comportant tout les jeu */
	private final List<JeuDeLaVie> listeJeu;
	/**listes de tout les JLabel donc des titres*/
	private final List<JLabel> titres;

	/**vistess entre les generation*/
	private int vitesse;


	/**
	 * Constructeur de la classe interface permettant de creer l'internface du jeu de la vie
	 *
	 * @param listeJdv la liste des jeux
	 * @param interfaces la liste des jeu de la viE UI
	 * @throws InterruptedException interception
	*/
	public Interface(List<JeuDeLaVie> listeJdv, List<JeuDeLaVieUi> interfaces) throws InterruptedException{

		this.listeJeu = listeJdv;
		this.titres = new ArrayList<>();

		this.setTitle("Jeu de la vie");
		this.setResizable(false);
		this.setSize(1200, 550);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel main = new JPanel();
		main.setBounds(0, 0, 10, 10);
		main.setBackground(Color.white);

		JPanel grilles = new JPanel();

		JPanel options = new JPanel();
		options.setBackground(new Color(149, 86, 73));
		options.setBounds(0, 450, 200, 100);

		JPanel panelGrille;

		for(int i = 0; i< this.listeJeu.size(); i++) {

			panelGrille = new JPanel();
			panelGrille.setLayout(new BoxLayout(panelGrille, BoxLayout.Y_AXIS));
			panelGrille.setBorder(new LineBorder(new Color(255, 255, 255), 2, false));
			panelGrille.setBackground(new Color(149, 86, 73));

			JLabel titre  = new JLabel(listeJeu.get(i).getVisiteur().getNom() + " : " , JLabel.CENTER);
			titre.setAlignmentX(JLabel.CENTER_ALIGNMENT);
			titre.setForeground(new Color(255, 255, 255));

			this.titres.add(titre);
			panelGrille.add(this.titres.get(i));

			panelGrille.add(interfaces.get(i));
			grilles.add(panelGrille);
		}



		JButton play = new JButton("PLAY");
		play.setForeground(Color.black);
		play.setBackground(new Color(255, 255, 255));
		play.addActionListener(e -> {
			for(JeuDeLaVie a : this.listeJeu) {
				a.lance();
			}
		});

		JButton stop = new JButton("STOP");
		stop.addActionListener(e -> {
			for(JeuDeLaVie j : this.listeJeu) {
				j.stop();
			}
		});

		JButton avancerUneG = new JButton("+1 generation");
		avancerUneG.setForeground(Color.black);
		avancerUneG.setBackground(new Color(255, 255, 255));
		avancerUneG.addActionListener(e -> {
			for(JeuDeLaVie z : this.listeJeu) {

				z.stop();
				z.calculerGenerationSuivante();
				z.stop();
			}
		});


		JSlider speed = new JSlider(JSlider.HORIZONTAL, 0, 800, 400);
		speed.setInverted(true);
		setVitesse(speed.getValue());
		speed.addChangeListener(e -> setVitesse(speed.getValue()));

		JButton reset = new JButton("RESET");
		reset.addActionListener(e -> {
			JeuDeLaVie j;
			for(int i = 0; i < this.listeJeu.size(); i++) {

				j = this.listeJeu.get(i);
				j.initialiseGrille();
				this.titres.get(i).setText(j.getVisiteur().getNom() + " : " + j.getNbGene());
				j.notifieObservateurs();
			}
		});

		JButton remplir = new JButton("REMPLIR TOUTE LA GRILLE");
		remplir.setForeground(Color.black);
		remplir.setBackground(new Color(255, 255, 255));
		remplir.addActionListener(e -> {
			for(JeuDeLaVie a : this.listeJeu) {
				a.initialiseGrilleRemplir();
				JeuDeLaVie j;
				for(int i = 0; i < this.listeJeu.size(); i++) {

					j = this.listeJeu.get(i);
					this.titres.get(i).setText(j.getVisiteur().getNom() + " : " + j.getNbGene());
				}

				a.lance();
			}
		});


		this.add(main);
		main.add(grilles);
		options.add(play);
		options.add(stop);
		options.add(speed);
		options.add(reset);
		options.add(avancerUneG);
		options.add(remplir);
		main.add(options);
		this.setVisible(true);
		lance();

	}


	/**
	 * Boucle principal du jeu de la vie permettant de calculer les generations et leur affichage
	 * @throws InterruptedException interception
	*/
	public void lance() throws InterruptedException {

		JeuDeLaVie j;
		int i;

		while(true) {
			for(i = 0; i < this.listeJeu.size(); i++) {
				j = getListeJeu(i);

				if(j.estLance()) {
					j.calculerGenerationSuivante();
					this.titres.get(i).setText(j.getVisiteur().getNom());
					this.titres.get(i).setText(j.getVisiteur().getNom() + " : " + j.getNbGene());
				}
			}
			Thread.sleep(this.vitesse);
		}
	}





	/////////////////////////Getter////////////////////////////////////
	/**
	 * methode d'acces en lecture a la liste des jeu de la vie
	 * @param i l'indice
	 * @return un jeu de la vie
	*/
	public JeuDeLaVie getListeJeu(int i) {
		return this.listeJeu.get(i);
	}


	/**
	 * methode d'acces en lecture a la vitesse
	 *
	 * @return la vitesse
	*/
	public int getVitesse() {
		return this.vitesse;
	}


	/////////////////////////SETTER////////////////////////////////////

	/**
	 * methode d'acces en modification de la vitesse
	 * @param v vitesse
	*/
	public void setVitesse(int v) {
		this.vitesse = v;
	}


}
