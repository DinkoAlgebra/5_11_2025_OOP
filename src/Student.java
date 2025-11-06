public class Student {
    private String ime;
    private double ocjena;
    private final int studentID;

    public Student(String ime, int studentID) {
        this.ime = ime;
        this.studentID = studentID;
        this.ocjena = 0.0; //definiramo početnu/default vrijednost
    }
    //definicija gettera
    public int getStudentID() {
        return studentID;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setOcjena(double ocjena) {

        //umetnuti provjeru unesene ocjene, postaviti mogućnost unosa samo ocjene od 1.0 - 5.0
        //u slučaju drugog unosa, ispisati poruku u konzoli
        if (ocjena >= 0.0 && ocjena <= 5.0) {
            this.ocjena = ocjena;
            System.out.println("Studentu " + this.ime + "ocjena postavljena: " + ocjena);
        } else {
            System.out.println("Pogreška ocjene: " + ocjena + " Ocjena mora biti između 1.0 i 5.0!");
        }


    }

    public String getIme() {
        return ime;
    }

    public double getOcjena() {
        return ocjena;
    }


    public void prikazPodataka() {
        System.out.println("Ime: " + ime + ", ID studenta: " + studentID + ", ocjena: " + ocjena);
    }

}
