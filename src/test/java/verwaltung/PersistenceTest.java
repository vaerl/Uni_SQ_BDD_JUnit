package verwaltung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PersistenceTest {

    @Test
    public void serializeMitarbeiter(){
        Mitarbeiter m = new Mitarbeiter("Kai", "Herrmann");
        m.addFachgebiet(Fachgebiet.ANALYSE);
        try {
            Helper.serialize(m);
        } catch (IOException e) {
            Assertions.fail("Should not have thrown exception!");
        }
    }

    @Test
    public void deserializeMitarbeiter(){
        Mitarbeiter m = new Mitarbeiter("Kai", "Herrmann");
        m.addFachgebiet(Fachgebiet.ANALYSE);
        try {
            Helper.serialize(m);
            m = Helper.deserialize(m.getId());
        } catch (IOException | ClassNotFoundException e) {
            Assertions.fail("Should not have thrown exception!");
        }
    }
}
