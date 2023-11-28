class ManutentionnaireRisk extends Manutentionnaire{


    public static final int PRIME_MANUTENTIONNAIRE_RISK = 200

    ManutentionnaireRisk(String nom, String prenom, int age, String dateEntree, int nbHeures) {
        super(nom, prenom, age, dateEntree, nbHeures)
    }

    @Override
    int calculerSalaire() {
        return super.calculerSalaire()+ PRIME_MANUTENTIONNAIRE_RISK
    }
}
