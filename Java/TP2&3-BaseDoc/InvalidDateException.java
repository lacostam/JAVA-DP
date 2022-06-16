/**
* @author Richefeu
* @version 0.1 : Date : Fri Jan 21 14:01:42 CET 2022
*
*/

/**
 * Creation d'une classe pour l'excepetion d'une date
*/

public class InvalidDateException extends Exception{


	/**
 	* Constructeur de la class InvalidDateException
	*/
	public InvalidDateException (String message){
		super(message);
	}
}
