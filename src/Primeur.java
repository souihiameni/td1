public class Primeur extends Article implements VendableParKilogramme {
    private double stock;

    public Primeur(double prixAchat, double prixVente, String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0.0;
    }

    public double remplirStock(double quantite) {
        stock += quantite;
        return quantite * prixAchat;
    }

    @Override
    public double vendre(double quantite) {
        if (quantite > stock) {
            System.out.println("Stock insuffisant !");
            return 0;
        }
        stock -= quantite;
        return quantite * prixVente;
    }

    @Override
    public void afficherDescription() {
        super.afficherDescription();
        System.out.println("Stock: " + stock + " kg");
    }
}
