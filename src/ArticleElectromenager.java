public class ArticleElectromenager extends Article implements VendableParPiece, SusceptibleDeSolde {
    private int stock;

    public ArticleElectromenager(double prixAchat, double prixVente, String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0;
    }

    public double remplirStock(int quantite) {
        stock += quantite;
        return quantite * prixAchat;
    }

    @Override
    public double vendre(int quantite) {
        if (quantite > stock) {
            System.out.println("Stock insuffisant !");
            return 0;
        }
        stock -= quantite;
        return quantite * prixVente;
    }

    @Override
    public void lancerSolde(double pourcentage) {
        prixVente -= prixVente * (pourcentage / 100);
    }

    @Override
    public void terminerSolde(double pourcentage) {
        prixVente += prixVente * (pourcentage / 100);
    }

    @Override
    public void afficherDescription() {
        super.afficherDescription();
        System.out.println("Stock: " + stock + " pièces");
    }
}
