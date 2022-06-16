import java.util.List;
import java.util.Objects;

public class Client {
    private String nom;
    private String ville;
    private List<Commande> commandes;

    public Client(String nom, String ville, List<Commande> commandes) {
        this.nom = nom;
        this.ville = ville;
        this.commandes = commandes;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nom, client.nom) &&
                Objects.equals(ville, client.ville) &&
                Objects.equals(commandes, client.commandes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, ville, commandes);
    }
}
