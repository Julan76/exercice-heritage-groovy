class Producteur extends Employe{
    //public static final int TAUX_FIXE_PRODUCTEUR = 5
    int nbUnitProduits

    Producteur(String nom, String prenom, int age, String dateEntree, int nbUnitProduits) {
        super(nom, prenom, age, dateEntree)
        this.nbUnitProduits = nbUnitProduits
    }

    @Override
    int calculerSalaire() {
        return nbUnitProduits* Constantes.TAUX_FIXE_PRODUCTEUR
    }
}
