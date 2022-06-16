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

    // Retourne la somme des prix de tous les articles achetés par un client
    public static int sommesDepenseesClient(Client client){
        //TODO
    }

}
