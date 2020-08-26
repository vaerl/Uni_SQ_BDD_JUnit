package verwaltung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbteilungsleiterTest {

    @Test
    public void createAbteilungsleiter(){
        Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Kai", "Herrmann");
        abteilungsleiter.addFachgebiet(Fachgebiet.ANALYSE);
        abteilungsleiter.addFachgebiet(Fachgebiet.JAVA);
        abteilungsleiter.addFachgebiet(Fachgebiet.DESIGN);
        abteilungsleiter.addFachgebiet(Fachgebiet.CPLUSPLUS);
        abteilungsleiter.addFachgebiet(Fachgebiet.CSHARP);
        Assertions.assertEquals(abteilungsleiter.vorname, "Kai");
        Assertions.assertEquals(abteilungsleiter.nachname, "Herrmann");
    }
}
