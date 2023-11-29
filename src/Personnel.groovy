class Personnel {
    List<GestionPaye> employeList
    double moyenSalaire

    Personnel() {
        this.employeList = new ArrayList<>()
    }

    void ajouterEmploye(Employe employe) {
        this.employeList.add(employe)
    }

    void ajouterEmployeList(def employeList) {
        this.employeList.addAll(employe)

    }

    String afficheSalaire() {
        employeList.each {
            println("le nom :" + it.getNom())
            println("le salaire :" + it.calculerSalaire())
            moyenSalaire += it.calculerSalaire()/employeList.size()

        }

    }


}
