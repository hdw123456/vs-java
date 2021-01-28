package test.ch10;

class Test {
    int i = 0;
}

public class FinalData {
    private final Test test = new Test();
    private Test test2 = new Test();
    public static void main(String[] args) {
        FinalData data = new FinalData();
        /*data.test;*/
        data.test2 = new Test();
        System.out.println(data);

    }
}
