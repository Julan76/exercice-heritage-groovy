class Vendeur extends Employe  {

    int chiffreAffaire

    Vendeur(String nom, String prenom, int age, String dateEntree, int chiffreAffaire) {
        super(nom, prenom, age, dateEntree)
        this.chiffreAffaire = chiffreAffaire
    }

    @Override
    int calculerSalaire() {
        return (Constant.POURCENTAGE_VENDEUR * chiffreAffaire)/100+ Constant.PRIME_VENDEUR

    }

}
