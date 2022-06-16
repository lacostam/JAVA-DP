import java.util.List;
import java.util.Objects;

public class Commande {
    private List<Article> articles;
    private boolean livree;

    public Commande(List<Article> articles, boolean livree) {
        this.articles = articles;
        this.livree = livree;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public boolean isLivree() {
        return livree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commande commande = (Commande) o;
        return livree == commande.livree &&
                Objects.equals(articles, commande.articles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articles, livree);
    }
}
