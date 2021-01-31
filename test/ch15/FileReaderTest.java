package test.ch15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("D:/dev/vs-java/test/ch15", "FileReader");
        String str = "abcdefg";
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(str);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileReader reader = new FileReader(file);
            char byt[] = new char[1024];
            int len = reader.read(byt);
            System.out.println(new String(byt, 0, len));
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
