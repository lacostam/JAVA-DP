import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Magasin {
    private String nom;
    private List<Client> clients;

    public Magasin(String nom, List<Client> clients) {
        this.nom = nom;
        this.clients = clients;
    }

    // Retourne le client qui a passé le plus de commandes
    public Optional<Client> clientPlusDeCommandes(){
       return clients.stream()
      			.sorted((o1, o2) -> o1.getCommandes().size() - o2.getCommandes().size())
      			.findFirst();

    }

    // Retourne l'article le plus cher commandé par un client donné
    public static Optional<Article> articlePlusCher(Client client){

      		Optional maxcommande = clients.getCommandes().stream()
														.foreach(
														.max();
			return maxcommande;
    }

}
