import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class Magasin {
    private String nom;
    private List<Client> clients;

    public Magasin(String nom, List<Client> clients) {
        this.nom = nom;
        this.clients = clients;
    }

    // Retourne vrai si tous les clients habitent une ville donnée
    public boolean tousLesClientsHabitentA(String ville){
    	return clients.stream().allMatch(m -> m.getVille().equals(ville));
    }

    // Retourne vrai si au moins un client habite une vile donnée
    public boolean unClientHabiteA(String ville){
        return clients.stream().anyMatch(m -> m.getVille().equals(ville));
    }

    // Retourne le nombre de clients habitant dans une ville donnée
    public long nbClientsDe(String ville){
        return clients.stream().filter(m -> m.getVille().equals(ville)).count();
    }

    // Retourne un clients habitant dans une ville donnée
    public Optional<Client> trouveUnClientDe(String ville){
        return clients.stream().filter(m -> m.getVille().equals(ville)).findAny();

    }

}
