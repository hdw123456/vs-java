package test.ch11;

interface OutInterface {
    public void f();
}

public class InterfaceInner {
    public static void main(String[] args) {
        OuterClass2 out=new OuterClass2();
        OutInterface outinter=out.doit();
        outinter.f();
    }
}

class OuterClass2 {
    private class Innerclass implements OutInterface {
        Innerclass(String s) {
            System.out.println(s);
        }

        public void f() {
            System.out.println("访问内部");
        }
    }

    public OutInterface doit() {
        return new Innerclass("123");
    }
}
