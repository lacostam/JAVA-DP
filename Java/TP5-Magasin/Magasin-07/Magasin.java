import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Magasin {
    private String nom;
    private List<Client> clients;

    public Magasin(String nom, List<Client> clients) {
        this.nom = nom;
        this.clients = clients;
    }


 	public static List<Article> tousLesArticlesClient(Client client){
		TODO
	}

	public Set<Article> articlesCommandes(){
		TODO
	}
}
