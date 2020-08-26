import verwaltung.Abteilungsleiter;
import verwaltung.Fachgebiet;
import verwaltung.Helper;
import verwaltung.Mitarbeiter;

import java.io.IOException;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Mitarbeiter m = new Mitarbeiter("Uwe", "Mey");
        m.addFachgebiet(Fachgebiet.ANALYSE);
        m.addFachgebiet(Fachgebiet.C);
        System.out.println("Before serialization:");
        System.out.println(m);
        Helper.serialize(m);

        System.out.println("After serialization:");
        System.out.println(Helper.deserialize(m.getId()));

        System.out.println("==========================");
        Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Aiko", "O", new HashSet<>());
        System.out.println("Before serialization:");
        System.out.println(abteilungsleiter);
        Helper.serialize(abteilungsleiter);

        System.out.println("After serialization:");
        abteilungsleiter = (Abteilungsleiter) Helper.deserialize(abteilungsleiter.getId());
        System.out.println(abteilungsleiter);
    }
}
