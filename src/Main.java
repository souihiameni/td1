public class Main {
    public static void main(String[] args) {
        Magasin magasin = new Magasin();

        // Création des articles
        ArticleElectromenager tv = new ArticleElectromenager(500, 700, "Télévision", "LG");
        Primeur pomme = new Primeur(2, 3, "Pommes", "Ferme Bio");

        // Ajout des articles au magasin
        magasin.ajouterProduit(tv);
        magasin.ajouterProduit(pomme);

        // Remplissage du stock
        magasin.enregistrerDepense(tv.remplirStock(10));  // 10 pièces de télévisions
        magasin.enregistrerDepense(pomme.remplirStock(50));  // 50 kg de pommes

        // Vente
        magasin.enregistrerRevenu(tv.vendre(3));  // Vente de 3 télévisions
        magasin.enregistrerRevenu(pomme.vendre(20));  // Vente de 20 kg de pommes

        // Affichage de l'état du magasin
        magasin.afficherEtat();

        // Calcul du taux de rendement
        System.out.println("Taux de rendement du magasin: " + magasin.calculerTauxRendement() + "%");
    }
}
