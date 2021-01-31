package test.ch15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example {
    public static void main(String[] args) {
        try {
            FileOutputStream fs = new FileOutputStream("word.txt");
            DataOutputStream outfs = new DataOutputStream(fs);
            outfs.writeUTF("utf"+'\n');
            outfs.writeChars("char"+'\n');
            outfs.writeBytes("byte"+'\n');
            outfs.close();
            FileInputStream fis = new FileInputStream("word.txt");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readUTF());
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            dis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
