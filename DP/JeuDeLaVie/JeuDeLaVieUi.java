/**
* @author Richefeu
* @version 0.1 : Date : Fri Mar 25 16:22:36 CET 2022
*
* Dans le cadre de la realisation d'un TP de design patterns
* 		permettant de mettre en place un jeu de la vie en JAVA
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


/**
 * classe permettant de mettre en oeuvre l'observteur graphique du jeu de la vie
*/
public class JeuDeLaVieUi extends JPanel implements Observateur{

	/**Jeu de la vie pour crrer une je de la vie UI*/
	private JeuDeLaVie jeu;


	/**
	 * Constructeur de la class JeuDeLaVieUi
	 * @param jeu qui est le jeu de la vie
	*/
	public JeuDeLaVieUi(JeuDeLaVie jeu){
		this.jeu = jeu;
        this.jeu.attacheObservateur(this);
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(360, 360));
        this.setBorder(new MatteBorder(2, 0, 2, 0, new Color(255, 255, 255)));
        this.setBackground(new Color(255, 255, 255));

	}



	/**
	 * reaction a un notification
	 * @see Observateur
	*/
	@Override
	public void actualise(){
		 repaint();
	}


	/**
	 * Permettant d'afficher la grille du jeu de la vie
	 *
	 * @param g graphic
	*/
	public void paint(Graphics g){

		super.paint(g);

		for(int x = 0 ; x < jeu.getXMax(); x++){
			for(int y = 0 ;  y < jeu.getYMax(); y++){
				if(jeu.getGrilleXY(x, y).estVivante()){
					g.fillOval(x*3, y*3, 3, 3);
				}
			}
		}

	}




}
