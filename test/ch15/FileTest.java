package test.ch15;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("D:/dev/vs-java/test/ch15/", "word.txt");
        if (file.exists()) {
            String name = file.getName();
            long len = file.length();
            boolean hidden = file.isHidden();
            System.out.println(name);
            System.out.println(len);
            System.out.println(hidden);
        }
    }
}
