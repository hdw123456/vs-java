package test.ch16;

import java.lang.reflect.Method;

public class Main_03 {
    public static void main(String[] args) {
        Example_03 example = new Example_03();
        Class<?> exampleC = example.getClass();
        Method[] methods = exampleC.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("name=" + method.getName());
            System.out.println("changeable=" + method.isVarArgs());
            Class<?>[] types = method.getParameterTypes();
            for (Class<?> type : types) {
                System.out.println("type=" + type);
            }
            System.out.println("returntype=" + method.getReturnType());
            Class<?>[] exctype = method.getExceptionTypes();
            for (Class<?> type : exctype) {
                System.out.println(type);
            }
            boolean isturn = true;
            while (isturn) {
                try {
                    isturn = false;
                    if ("staticmethod".equals(method.getName()))
                        method.invoke(example);
                    else if ("pubmethod".equals(method.getName()))
                        System.out.println(method.invoke(example, 10)); 
                    else if ("promethod".equals(method.getName()))
                        System.out.println(method.invoke(example, "7", 10)); 
                    else if ("primethod".equals(method.getName())) {
                        Object[] meters = new Object[] { new String[] { "H", "D", "w" } };
                        System.out.println(method.invoke(example, meters)); 
                    }
                } catch (Exception e) {
                    System.out.println("error");
                    method.setAccessible(true);
                    isturn = true;
                }
            }
            System.out.println();
        }

    }
}
