package test.ch16;

public class Example_01 {
    String s;
    int i, i2, i3;

    private Example_01() {

    }

    protected Example_01(String s, int i) {
        this.s = s;
        this.i = i;
    }
    public Example_01(String...strings) throws NumberFormatException{
        
    }
}
