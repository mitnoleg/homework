package module2.lesson2.task2;

import java.lang.reflect.Array;

public class GenericsArray {
    @SuppressWarnings({ "unchecked", "hiding" })
    public static <T>  T[] getArray(Class<T> componentType,int length) {
        return (T[]) Array.newInstance(componentType, length);
    }
    public static <T>  T[] add(Class<T> componentType,int length) {
        return (T[]) Array.newInstance(componentType, length);
    }


}

