import java.util.stream.Collectors

class Personnel {
    List<GestionPaye> employeList
    List<Double> listS = new ArrayList<>()

    Personnel() {
        this.employeList = new ArrayList<>()
    }

    void ajouterEmploye(Employe employe) {
        this.employeList.add(employe)
    }

    void ajouterEmployeList(def employeList) {
        this.employeList.addAll(employe)

    }

    double mo = 0, moyenne

    String afficheSalaire() {
        employeList.each {
            println("le nom :" + it.getNom())
            println("le salaire :" + it.calculerSalaire())
            listS.add((it.calculerSalaire()))
        }

    }

    double salaireMoyen() {

        //moyenne = listS.average()
        moyenne= employeList.stream().map(t ->t.calculerSalaire()).collect(Collectors.toList()).average()
        //employeList.stream().filter(employe->employe.calculerSalaire()<3000).collect().toList()
        /*employeList.each {
            mo = mo + it.calculerSalaire()
        }
        moyenne = mo  employeList.size()*/
        return moyenne
    }

    def employeSalInf3000() {

        return  employeList.stream().filter(employe -> employe.calculerSalaire() < 3000)
                .map(t->t.getNom()+" "+t.calculerSalaire()).collect().toList()

    }
}
