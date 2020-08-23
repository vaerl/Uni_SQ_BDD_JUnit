import verwaltung.Fachgebiet;
import verwaltung.Mitarbeiter;

public class Main {

    public static void main(String[] args) {
        Mitarbeiter m = new Mitarbeiter("Uwe", "Mey");
        m.addFachgebiet(Fachgebiet.ANALYSE);
        m.addFachgebiet(Fachgebiet.C);
        m.addFachgebiet(Fachgebiet.JAVA);
        System.out.println(m + " " + m.equals(m));
        m.addFachgebiet(Fachgebiet.TEST);
    }
}
