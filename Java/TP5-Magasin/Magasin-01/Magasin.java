import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Magasin {
    private String nom;
    private List<Client> clients;

    public Magasin(String nom, List<Client> clients) {
        this.nom = nom;
        this.clients = clients;
    }

    // Retourne la liste des clients habitant dans une ville donnée
    public List<Client> habitantsVille(String ville){

       List<Client> hab = clients.stream()
         	.filter( m -> m.getVille().equals(ville))
         	.collect(toList());

       System.out.println(hab);
       return hab;
    }
}
