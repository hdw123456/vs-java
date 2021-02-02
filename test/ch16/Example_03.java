package test.ch16;

/**
 * Example_03
 */
public class Example_03 {
    static void staticmethod() {
        System.out.println("static");
    }

    public int pubmethod(int i) {
        System.out.println("public");
        return i;
    }

    protected int promethod(String s, int i) throws NumberFormatException {
        System.out.println("protected");
        return Integer.valueOf(s) + i;
    }
    private String primethod(String...strings) {
        System.out.println("private");
        StringBuffer stringBuffer = new StringBuffer();
        for (String string : strings) {
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }
}