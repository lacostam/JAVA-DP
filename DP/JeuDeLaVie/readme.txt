JEU DE LA VIE

Projet réalisé dans le cadre du module design patterns


OBJECTIFS :

	- Implementer le je de la vie en utilisant différents partterns
	- Utiliser les partterns :

						- Etat
    					- Singleton
   						- Observateur
   						- Commande
    					-Visiteur



TECHNOLOGIE :

	- JAVA
	- JAVA swing pour l'interface




UTILISATION :

	Utiliser les boutons Compilier puis Executer dans Hop3x

							OU

	Ouvrir un terminal puis faire les commandes suivantes
	- javac Main.java
	- java Main




FONCTIONNALITÉS IMPLEMENTÉES :

	- Affichage dans le teminal du nombres de générations et du nombres de cellules vivantes
	- Bouton pour exécuter/arrêter la boucle d’exécution ;
	- Bouton pour avancer d’une génération lorsque la boucle est arrêtée ;
	- Slider pour ajuster la vitesse de la boucle d’exécution ;
	- Un mode classique, un mode high life et un day night excutés en parrallele
	- Remise a zero des grilles
	- Initialisation aleatoire et une spéciale permettant de mettre toutes les cellule en viviantes




PRINCIPE DU JEU DE LA VIE :

	Un automate cellulaire est un objet mathématique qui permet de simuler l’évolution d’une population de cellules virtuelles au cours du temps, selon des règles de voisinage.
	Ces règles sont appliquées à toutes les cellules d’une même génération, produisant ainsi une nouvelle génération, entièrement dépendante de la génération précédente.
	Le « Jeu de la Vie » du mathématicien John Conway est un exemple d’automate cellulaire à deux dimensions dont les règles d’évolution sont les suivantes :

    Si une cellule possède moins de deux voisines, elle va mourir (solitude) ;
    Si une cellule possède plus de trois voisines elle va mourir (étouffement) ;
    Si un emplacement vide possède trois voisines, une nouvelle cellule va naître ;

AUTEUR :
	Richefeu Mattéo
