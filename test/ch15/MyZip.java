package test.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyZip {
    private void zip(String name, File file) throws Exception {
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(name));
        zip(out, file, "");
        out.close();
    }

    private void zip(ZipOutputStream out, File file, String string) throws Exception {
        if (file.isDirectory()) {
            File[] fl = file.listFiles();
            if (string.length() != 0) {
                out.putNextEntry(new ZipEntry(string + "/"));
            }
            for (int i = 0; i < fl.length; i++) {
                zip(out, fl[i], string + fl[i]);
            }
        } else {
            out.putNextEntry(new ZipEntry(string));
            FileInputStream in = new FileInputStream(file);
            int b;
            System.out.println(string);
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            in.close();
        }
    }

    public static void main(String[] args) {
        MyZip book = new MyZip();
        try {
            book.zip("hello.zip", new File("hello"));
            System.out.println("success");
        } catch (Exception ex) {

        }
    }
}
