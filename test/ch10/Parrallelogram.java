package test.ch10;

class Quadrangle {
    public static void draw(Quadrangle q) {

    }
}

class Square extends Quadrangle {
    // ABC
}

public class Parrallelogram extends Quadrangle {
    public static void main(String[] args) {
        Quadrangle q = new Quadrangle();
        if (q instanceof Parrallelogram) {
            Parrallelogram p = (Parrallelogram) q;
        }
    }
}