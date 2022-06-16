JFLAGS = -g
JC = javac



.SUFFIXES:	.java .class




.java.class:
	$(JC) $(JFLAGS) $*.java



CLASSES = \
	Pokemon.java \
	Terrestre.java \
	Marin.java \
	Sportif.java \
	Casanier.java \
	Croisiere.java \
	Main.java \



default:	classes


classes:	$(CLASSES:.java=.class)
	java Main



clean:
	$(RM) *.class
