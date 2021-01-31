package test.ch11;

public class InClassPractice {
    static class InClass{
        InClass() {
            System.out.println("dev success");
        }
    }
    public InClass doit() {
        return new InClass();
    }
    public static void main(String[] args) {
        InClassPractice out1 = new InClassPractice();
        out1.doit();
        new InClass();
        
    }
}
