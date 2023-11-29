class ProducteurRisque extends Producteur{


    //public static final int RISK_PRIME = 200

    ProducteurRisque(String nom, String prenom, int age, String dateEntree, int nbUnitProduits) {
        super(nom, prenom, age, dateEntree, nbUnitProduits)
    }

    @Override
    int calculerSalaire() {
        return super.calculerSalaire() + Constantes.RISK_PRIME
    }
}
