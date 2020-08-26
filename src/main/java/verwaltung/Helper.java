package verwaltung;

import verwaltung.Mitarbeiter;

import java.io.*;

public class Helper {

    static String destination = "./serialized";

    public static void serialize(Mitarbeiter mitarbeiter) throws IOException {
        File file = new File(destination + "/" + mitarbeiter.getId() + ".txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(mitarbeiter);
        oos.flush();
        oos.close();
    }

    public static Mitarbeiter deserialize(int id) throws IOException, ClassNotFoundException {
        File file = new File(destination + "/" + id + ".txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        return (Mitarbeiter) objectInputStream.readObject();
    }
}
