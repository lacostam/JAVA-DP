import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toSet;

public class Magasin {
    private String nom;
    private List<Client> clients;

    public Magasin(String nom, List<Client> clients) {
        this.nom = nom;
        this.clients = clients;
    }

    // Retourne un Set de toutes les villes dans lesquelles habitent les clients
    public Set<String> villesDesClients(){

        Set<String> ville = clients.stream()
         	.map(Client::getVille)
         	.collect(toSet());


       return ville;
    }

}
