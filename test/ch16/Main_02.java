package test.ch16;

import java.lang.reflect.Field;

public class Main_02 {
    public static void main(String[] args) {
        Example_02 example = new Example_02();
        Class<?> exampleC = example.getClass();
        Field[] dFields = exampleC.getDeclaredFields();
        for (Field field : dFields) {
            System.out.println("name=" + field.getName());
            // Class<?> fieldtype=field.getType();
            System.out.println("type=" + field.getType());
            boolean isturn = true;
            while (isturn) {
                try {
                    isturn =false;
                    System.out.println(field.get(example));
                    if (field.getType().equals(int.class)) {
                        field.setInt(example, 12);
                    }
                    else if (field.getType().equals(float.class)) {
                        field.setFloat(example, 12.5F);
                    }
                    else if (field.getType().equals(boolean.class)) {
                        field.setBoolean(example, true);
                    }
                    else if (field.getType().equals(String.class)) {
                        field.set(example, "hdw");
                    }
                    System.out.println(field.get(example));
                } catch (Exception e) {
                    field.setAccessible(true);
                    isturn=true;
                }
            }
            System.out.println();
        }
    }
}
