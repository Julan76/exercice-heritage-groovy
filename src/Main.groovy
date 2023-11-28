static void main(String[] args) {

    def vendeur = new Vendeur("Maxime", "Del", 45, "1995", 30000); //30000 : CA
    def representant = new Representant("Julien", "Roy", 25, "2001", 20000); //30000 : CA
    def producteur = new Producteur("Evans", "To", 28, "1998", 1000); //1000 nb unités produites
    def manutentionnaire = new Manutentionnaire("Gilles", "Ho", 32, "1998", 45); // 45 nb heures //travaillées
    def producteurRisque = new ProducteurRisque("Sylvain", "Mo", 28, "2000", 1000); //1000 : nb unité //produites
    def manutentionnaireRisk = new ManutentionnaireRisk("Thierno", "Ca", 30, "2001", 45); // nb heures


     def personnel = new Personnel();
  personnel.ajouterEmploye(vendeur)
    personnel.ajouterEmploye(representant)
    personnel.ajouterEmploye(producteur)
    personnel.ajouterEmploye(manutentionnaire)
    personnel.ajouterEmploye(producteurRisque)
    personnel.ajouterEmploye(manutentionnaireRisk)
    personnel.each { println(it.afficheSalaire()) };


}