package test.ch11;

public class OuterClass {
    InnerClass in = new InnerClass();

    public void ouf() {
        in.inf();
    }

    class InnerClass {
        InnerClass() {
        }

        public void inf() {
        }

        int y = 0;
    }

    public void doit() {
        in.y = 4;
        // return new InnerClass();
    }

    public static void main(String[] args) {
        OuterClass out1 = new OuterClass();
        OuterClass out = new OuterClass();
        // out1.doit();
        OuterClass.InnerClass in = out1.in;
        OuterClass.InnerClass in2 = out.new InnerClass();
        System.out.println(in.y);
        System.out.println(in2.y);
    }
}
