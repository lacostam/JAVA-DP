/**
* @author Richefeu
* @version 0.1 : Date : Mon Mar 21 15:39:07 CET 2022
*
*/
import java.time.LocalDate;

public interface Composant extends Iterable<Composant>, Visitable{
	public String getNom();
	public int getTaille();
	public LocalDate getDate();
}
