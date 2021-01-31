package test.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOut {
    public static void main(String[] args) {
        File file = new File("word2.txt");
        byte buy[] = "abcdefg".getBytes();
        try {
            FileOutputStream out = new FileOutputStream(file);
            out.write(buy);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(file);
            byte byt[] = new byte[12345];
            int len=in.read(byt);
            System.out.println(in);
            System.out.println(new String(byt,0,len));
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
