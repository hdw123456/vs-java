package test.ch11;

import java.util.Random;
import static java.lang.System.out;

public class FinalStaticData {
    private static Random rand = new Random();
    private final int a1 = rand.nextInt(10);
    private final static int a2 = rand.nextInt(10);

    public static void main(String[] args) {
        FinalStaticData fData = new FinalStaticData();
        out.println(fData.a1);
        out.println(fData.a2);
        FinalStaticData fData2 = new FinalStaticData();
        out.println(fData2.a1);
        out.println(fData2.a2);
    }
}
