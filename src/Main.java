import model.Auto;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Marko Marić", 25);
        Student student2 = new Student("Juanito Ivić", 24);
        Auto auto = new Auto();
        student1.prikazPodataka();
        System.out.println(student2.getIme());
        student2.setIme("Juanito Juarez");
        student2.prikazPodataka();
        student1.setOcjena(41);
        if (student1 instanceof Object) {
            System.out.println("Dio je klase Objekt");
            Object obj = (Object) student1; //casting pretvaranje objekta iz jedne klase u drugu
        }

    }
}
