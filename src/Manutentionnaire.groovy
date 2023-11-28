class Manutentionnaire extends Employe{
    public static final int TAUX_FIXE_MANUTENTIONNAIRE = 65
    int nbHeures

    Manutentionnaire(String nom, String prenom, int age, String dateEntree, int nbHeures) {
        super(nom, prenom, age, dateEntree)
        this.nbHeures = nbHeures
    }

    @Override
    int calculerSalaire() {
        return nbHeures* TAUX_FIXE_MANUTENTIONNAIRE
    }
}
