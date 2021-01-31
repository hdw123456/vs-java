package test.ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Student {
    public static void main(String[] args) {
        String content[] = { "你好", "今天", "明天" };
        File file = new File("string.txt");
        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter fw = new BufferedWriter(writer);
            for (String string : content) {
                fw.write(string);
                fw.newLine();
            }
            fw.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            //String s = null;
            //int i = 0;
            String str[]=new String[content.length];
            for (int j = 0; j < str.length; j++) {
                str[j]=bufr.readLine();
            }
            /*while ((s = bufr.readLine()) != null) {
                str[i]=s;
                i++;
            }*/
            for (String string : str) {
                System.out.println(string);
            }
            bufr.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
