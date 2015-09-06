package ACO7.week6.day2;

/**
 * Created by acer on 25.08.2015.
 */
import ACO7.week1.day2.Contact;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/amakogon/serial"));
        Contact contact = new Contact();
        oos.writeObject(contact);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/amakogon/serial"));
        Contact restored = (Contact) ois.readObject();
        System.out.println(restored);

    }
}
