package test.ch10;
public class OverLoadTeat {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(double a, int b) {
        return a + b;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public static int add(int... a) {
        int s = 0;
        for (int x : a)
            s += x;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(2.1, 3.5));
        System.out.println(add(3.4, 2));
        System.out.println(add(5, 2.7));
        System.out.println(add(10, 20, 30, 40, 80));
        ParallelogramgleUseInterface p=new ParallelogramgleUseInterface();
        p.draw();
    }
}
