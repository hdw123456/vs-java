package test.ch10;

interface drawTest {
    public void draw();
}

class SquareUseInterface extends QuadrangleUseInterface implements drawTest {
    public void draw() {
        System.out.println("2");
    }
}

class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest {
    public void draw() {
        System.out.println("1");
    }
}

public class QuadrangleUseInterface {

    public static void main(String[] args) {
        drawTest[] d = { new SquareUseInterface(), new ParallelogramgleUseInterface() };
        for (drawTest drawTest : d) {
            drawTest.draw();
        }
    }
}
