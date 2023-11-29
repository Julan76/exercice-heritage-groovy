class Representant extends Vendeur{

    Representant(String nom, String prenom, int age, String dateEntree, int chiffreAffaire) {
        super(nom, prenom, age, dateEntree, chiffreAffaire)
    }

    @Override
    int calculerSalaire() {
        return (Constant.POURCENTAGE_VENDEUR * chiffreAffaire)/100+  Constant.PRIME_REPRESENTANT
    }
}
