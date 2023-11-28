abstract class Employe implements GestionPaye{
    int age
    String nom
    String prenom
    String dateEntree

    Employe( String nom, String prenom,int age, String dateEntree) {
        this.age = age
        this.nom = nom
        this.prenom = prenom
        this.dateEntree = dateEntree
    }

    String getNom() {
        return nom
    }
}
