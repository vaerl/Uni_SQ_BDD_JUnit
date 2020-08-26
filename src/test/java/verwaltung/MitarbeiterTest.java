package verwaltung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MitarbeiterTest {

    @Test
    public void createMitarbeiter(){
        Mitarbeiter m = new Mitarbeiter("Kai", "Herrmann");
        m.addFachgebiet(Fachgebiet.ANALYSE);
        Assertions.assertEquals(m.vorname, "Kai");
        Assertions.assertEquals(m.nachname, "Herrmann");
    }

    @Test
    public void createMitarbeiterWithBadSurname(){
        IllegalArgumentException illegalArgumentException = Assertions.assertThrows(IllegalArgumentException.class, () -> new Mitarbeiter("A", "E"));
        Assertions.assertEquals(illegalArgumentException.getMessage(), "Nachname mit mindestens zwei Zeichen!");
    }

    @Test
    public void createMitarbeiterWithTooManyFachgebieten(){
        Mitarbeiter m = new Mitarbeiter("Kai", "Herrmann");
        m.addFachgebiet(Fachgebiet.ANALYSE);
        m.addFachgebiet(Fachgebiet.C);
        m.addFachgebiet(Fachgebiet.DESIGN);
        m.addFachgebiet(Fachgebiet.JAVA);
        IllegalArgumentException illegalArgumentException = Assertions.assertThrows(IllegalArgumentException.class, () -> m.addFachgebiet(Fachgebiet.JAVA));
        Assertions.assertEquals(illegalArgumentException.getMessage(), "Maximal 3 Fachgebiete!");
    }
}
