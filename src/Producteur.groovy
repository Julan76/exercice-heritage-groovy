class Producteur extends Employe {

    int nbUnitProduits

    Producteur(String nom, String prenom, int age, String dateEntree, int nbUnitProduits) {
        super(nom, prenom, age, dateEntree)
        this.nbUnitProduits = nbUnitProduits
    }

    @Override
    int calculerSalaire() {
        return nbUnitProduits * Constant.TAUX_FIXE_PRODUCTEUR
        //return nbUnitProduits * TAUX_FIXE_PRODUCTEUR
    }
}
