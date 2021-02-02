package test.ch16;

import java.lang.reflect.Constructor;

public class getannotation {
    public static void main(String[] args) {
        Record record = new Record();
        Class<?> recordC = record.getClass();
        Constructor<?>[] constructors = recordC.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            if (constructor.isAnnotationPresent(Constructor_Annotation.class)) {
                Constructor_Annotation ca=(Constructor_Annotation)constructor.getAnnotation(Constructor_Annotation.class);
                System.out.println(ca.value());
            }
        }
    }
}
