package test.ch17;

interface InnerConstantsTest {
    public final static int constants_A = 1;
    public final static int constants_B = 12;

}
public class Constants {
    enum constants2{
        constants_A,constants_B
    }
    public static void doit(int c) {
        switch (c) {
            case InnerConstantsTest.constants_A:
                System.out.println("A");
                break;
            case InnerConstantsTest.constants_B:
                System.out.println("B");
                break;
        }
    }
    public static void doit2(constants2 c) {
        switch (c) {
            case constants_A:
                System.out.println("A");
                break;
        
            case constants_B:
            System.out.println("B");
                break;
        }
    }
    public static void main(String[] args) {
        Constants.doit(InnerConstantsTest.constants_A);
        Constants.doit2(constants2.constants_A);
        Constants.doit2(constants2.constants_B);
        Constants.doit(3);
    }

}
