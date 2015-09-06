package ACO7.week6.day2;

/**
 * Created by acer on 25.08.2015.
 */
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/amakogon/myFile";
        FileReader reader = null;
        try {
            reader = new FileReader(filePath);
            StringBuilder builder = new StringBuilder();
            int result;
            char[] buff = new char[5];
            do {
                result = reader.read(buff);
                for (int i = 0; i < result; i++) {
                    builder.append(buff[i]);
                }
            } while (result != -1);
            System.out.println(builder);
        } finally {
            if (reader != null) {
                reader.close();
            }
        }


    }
}
