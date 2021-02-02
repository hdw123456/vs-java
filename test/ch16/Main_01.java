
package test.ch16;

import java.lang.reflect.Constructor;

public class Main_01 {
    public static void main(String[] args) {
        Example_01 example = new Example_01("10", "20", "30");
        Class<? extends Example_01> examplec = example.getClass();
        Constructor<?>[] constructors = examplec.getDeclaredConstructors();
        int i = 0;
        for (Constructor<?>  constructor : constructors) {
            System.out.println("changable:" + constructor.isVarArgs());
            System.out.println("参数类型:");
            Class<?>[] type = constructor.getParameterTypes();
            for (Class<?> type2 : type) {
                System.out.println(type2);
            }
            Class<?>[] extype = constructor.getExceptionTypes();
            for (Class<?> type2 : extype) {
                System.out.println(type2);
            }
            Class<?>[] exceptiontype = constructor.getExceptionTypes();
            for (Class<?> type2 : exceptiontype) {
                System.out.println(type2);
            }
            Example_01 example2 = null;
            while (example2 == null) {
                try {
                    if (i == 2)
                        example2 = (Example_01) constructor.newInstance();
                    else if (i == 1)
                        example2 = (Example_01) constructor.newInstance("7", 5);
                    else {
                        Object[] parameters = new Object[] { new String[] { "100", "200", "300" } };
                        example2 = (Example_01) constructor.newInstance(parameters);
                    }
                } catch (Exception e) {
                    System.out.println("error");
                    constructor.setAccessible(true);
                }

            }
            if (example2!=null) {
                example2.print();
                System.out.println();
            }
            i++;
        }
    }
}