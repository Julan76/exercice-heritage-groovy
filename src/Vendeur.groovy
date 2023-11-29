class Vendeur extends Employe {
    //public static final int PRIME_VENDEUR = 400
    //public static final int POURCENTAGE_VENDEUR = 20
    int chiffreAffaire

    Vendeur(String nom, String prenom, int age, String dateEntree, int chiffreAffaire) {
        super(nom, prenom, age, dateEntree)
        this.chiffreAffaire = chiffreAffaire
    }

    @Override
    int calculerSalaire() {
        return (Constantes.POURCENTAGE_VENDEUR * chiffreAffaire)/100+ Constantes.PRIME_VENDEUR
    }

}
