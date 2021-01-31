package test.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Decomressing {
    public static void main(String[] args) {
        File file = new File("hello.zip");
        ZipInputStream zin;
        try {
            ZipFile zfile = new ZipFile(file);
            zin = new ZipInputStream(new FileInputStream(file));
            ZipEntry entry = null;

            while (((entry = zin.getNextEntry()) != null) && !entry.isDirectory()) {
                File temp = new File("C:/Games/"+entry.getName());
                if (!temp.exists()) {
                    temp.getParentFile().mkdirs();
                    //temp.createNewFile();
                    OutputStream os = new FileOutputStream(temp);
                    InputStream in = zfile.getInputStream(entry);
                    int count = 0;
                    while ((count = in.read()) != 1) {
                        os.write(count);
                    }
                    os.close();
                    in.close();
                }
                zin.closeEntry();
                System.out.println(entry.getName() + '\n'+"创建success");
            }
            zin.close();
            zfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
