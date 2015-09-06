package ACO7.week6.day2;

/**
 * Created by acer on 25.08.2015.
 */
import ACO7.week1.day2.Contact;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteContact {
    public static void main(String[] args) throws IOException {
        Contact contact = new Contact();

        File file = new File("/home/amakogon/contacts");
        System.out.println(file.createNewFile());

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(contact.toString());
            writer.newLine();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }


    }
}
