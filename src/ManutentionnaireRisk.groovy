class ManutentionnaireRisk extends Manutentionnaire {

    ManutentionnaireRisk(String nom, String prenom, int age, String dateEntree, int nbHeures) {
        super(nom, prenom, age, dateEntree, nbHeures)
    }

    @Override
    int calculerSalaire() {
        return super.calculerSalaire()+ Constant.PRIME_MANUTENTIONNAIRE_RISK
        //return super.calculerSalaire()+ PRIME_MANUTENTIONNAIRE_RISK
    }
}
