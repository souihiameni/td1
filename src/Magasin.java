import java.util.ArrayList;

public class Magasin {
    private double depenses;
    private double revenus;
    private ArrayList<Article> produits;

    public Magasin() {
        this.depenses = 0;
        this.revenus = 0;
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Article article) {
        produits.add(article);
    }

    public void afficherEtat() {
        System.out.println("Dépenses: " + depenses);
        System.out.println("Revenus: " + revenus);
        System.out.println("Produits en stock:");
        for (Article article : produits) {
            article.afficherDescription();
        }
    }

    public double calculerTauxRendement() {
        return (revenus - depenses) / depenses * 100;
    }

    public void enregistrerDepense(double montant) {
        depenses += montant;
    }

    public void enregistrerRevenu(double montant) {
        revenus += montant;
    }
}
