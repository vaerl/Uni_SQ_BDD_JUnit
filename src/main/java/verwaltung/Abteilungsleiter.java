package verwaltung;

import java.util.HashSet;

public class Abteilungsleiter extends Mitarbeiter{

    public Abteilungsleiter(String vorname, String nachname) {
        super.setVorname(vorname);
        super.setNachname(nachname);
        super.setId(idGenerator++);
    }

    public Abteilungsleiter(String vorname, String nachname, HashSet<Fachgebiet> fachgebiete) {
        super.setVorname(vorname);
        super.setNachname(nachname);
        super.setId(idGenerator++);
        super.setFachgebiete(fachgebiete);
    }

    @Override
    public void addFachgebiet(Fachgebiet fachgebiet) {
        this.fachgebiete.add(fachgebiet);
    }
}
