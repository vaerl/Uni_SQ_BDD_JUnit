import java.io.*;

public class Verwaltung {

    static String destination = "./serialized";

    public static void serialize(Mitarbeiter mitarbeiter) throws IOException {
        File file = new File(destination + "/" + mitarbeiter.getId() + ".txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(mitarbeiter);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static Mitarbeiter deserialize(int id) throws IOException, ClassNotFoundException {
        File file = new File(destination + "/" + id + ".txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        return (Mitarbeiter) objectInputStream.readObject();
    }
}
