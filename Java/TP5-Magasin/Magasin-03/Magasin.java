import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//import static java.util.stream.Collectors.toList;


public class Magasin {
    private String nom;
    private List<Client> clients;

    public Magasin(String nom, List<Client> clients) {
        this.nom = nom;
        this.clients = clients;
    }

    // Retourne une liste des clients du magasin triée selon le nombre de commandes
    public List<Client> clientsParNbCommandes(){

       List<Client> cli = clients.stream()
      		.sorted((o1, o2) -> o1.getCommandes().size() - o2.getCommandes().size())
         	.collect(Collectors.toList());

       return cli;
    }

}
