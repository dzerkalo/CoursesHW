package ACO7.week6.week2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by acer on 23.08.2015.
 */
public class Ex1 {

    public static void main(String[] args) {

        String FilePath = "C:\\TestFile.txt";
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(FilePath);
            int result = -1;
            StringBuilder stringBuilder = new StringBuilder();

            do {
                result = inputStream.read();
                stringBuilder.append((char) result);

            }   while (result != -1);
                System.out.print(stringBuilder);

        } catch (FileNotFoundException e) {
            System.err.println("No such file" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) ;
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
