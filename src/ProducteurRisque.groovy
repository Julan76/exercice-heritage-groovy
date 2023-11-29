class ProducteurRisque extends Producteur{

    ProducteurRisque(String nom, String prenom, int age, String dateEntree, int nbUnitProduits) {
        super(nom, prenom, age, dateEntree, nbUnitProduits)
    }

    @Override
    int calculerSalaire() {

        return super.calculerSalaire() + Constant.RISK_PRIME
    }
}
