package test.ch16;

//import java.lang.reflect.Constructor;
//import java.lang.reflect.Method;

import test.ch11.OuterClass;
import test.ch13.Emp;
//import java.lang.reflect.Modifier;
public class GetTest {

    public static void main(String[] args) {
        Emp exaEmp = new Emp("01", "hdw");
        OuterClass exaClass = new OuterClass();
        Class<?> textClass = exaEmp.getClass();
        Class<?> text2 = exaClass.getClass();
        System.out.println(textClass);
        System.out.println(text2);

        //Class<?> mod= exaEmp.getClass();

    }
}
