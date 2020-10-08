package by.it.arhipova.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> structMath = Math.class;
        Method[] methods = structMath.getDeclaredMethods();
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)) {
        StringBuilder out = new StringBuilder();
        out.append("public ");
        if (Modifier.isStatic(modifiers))
            out.append("static ");
        out.append(method.getName()).append("(");
                Class<?>[] types = method.getParameterTypes();
        String delimiter = ";";
        for (Class<?> type : types){
            out.append(delimiter)
                    .append(type.getSimpleName());
        }
                System.out.println(method);
            }
        }


    }
}
