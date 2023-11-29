class Manutentionnaire extends Employe{

    int nbHeures

    Manutentionnaire(String nom, String prenom, int age, String dateEntree, int nbHeures) {
        super(nom, prenom, age, dateEntree)
        this.nbHeures = nbHeures
    }

    @Override
    int calculerSalaire() {
        return nbHeures* Constant.TAUX_FIXE_MANUTENTIONNAIRE
    }
}
