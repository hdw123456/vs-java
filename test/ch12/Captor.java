package test.ch12;


public class Captor {
    static int quotient(int x,int y)throws ArithmeticException{
        return x/y;
    }
    public static void main(String[] args) {
        try {
            int result = quotient(7, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }
    }
}
