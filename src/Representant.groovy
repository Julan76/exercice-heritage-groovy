class Representant extends Vendeur{


    Representant(String nom, String prenom, int age, String dateEntree, int chiffreAffaire) {
        super(nom, prenom, age, dateEntree, chiffreAffaire)
    }
    //public static final int PRIME_REPRESENTANT = 800

    @Override
    int calculerSalaire() {
        return (Constantes.POURCENTAGE_VENDEUR * chiffreAffaire)/100+ Constantes.PRIME_REPRESENTANT
    }
}
