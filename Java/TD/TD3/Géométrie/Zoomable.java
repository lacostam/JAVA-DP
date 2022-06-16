/**
* @author Richefeu
* @version 0.1 : Date : Mon Jan 17 13:54:12 CET 2022
*
*/
public interface Zoomable {

    public void agrandir(double facteur)throws IllegalZoomFactorException;
    public void reduire(double facteur)throws IllegalZoomFactorException;

}
