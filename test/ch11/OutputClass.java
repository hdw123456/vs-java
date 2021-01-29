package test.ch11;

public class OutputClass extends ClassA {
    public OutputClass() {
        super();
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        OutputClass out = new OutputClass();
        ClassB b = out.new ClassB();
    }
}

class ClassA {
    ClassA() {
        System.out.println("父类A");
    }

    class ClassB {
        ClassB() {
            System.out.println("父类B");
        }
    }
}