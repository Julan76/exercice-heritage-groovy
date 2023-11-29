class Personnel {
    List<GestionPaye> employeList

    Personnel() {
        this.employeList = new ArrayList<>()
    }
    void ajouterEmploye(Employe employe) {
        this.employeList.add(employe)
    }
    void ajouterEmployeList(def employeList){
        this.employeList.addAll(employe)

    }

    String afficheSalaire() {
        employeList.each {
            println("le nom :"+it.getNom())
            println("le salaire :"+it.calculerSalaire())

            def calculerSalaireMoyen(employes) {
                def salaires = employes.collect { it.calculerSalaire() }
                return salaires.sum() / salaires.size()

        }

    }


}
