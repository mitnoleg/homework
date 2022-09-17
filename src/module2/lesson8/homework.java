package module2.lesson8;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class homework {
    public static void main(String[] args) throws InterruptedException, InvocationTargetException,
            IllegalAccessException {
        //1. Создать аннотацию GetMetaData, которая может быть над атрибутом, методом, классом
        //2. Создать класс UserMeta, с атрибутом String name, Integer count, методом GetSuperName(String prefix)
        //3. Создать обработчик аннотации GetMetaData, так чтобы:
        //3.1 При нахождении @GetMetaData над классом, то печатаем все атрибуты класса - отдельный метод
        //3.2 При нахождении @GetMetaData над атрибутом, чтобы печаталось значение атрибута этого поля - отдельный метод
        //3.3 При нахождении @GetMetaData над методом, печатаем сколько времени выполнялся метод. - отдельный метод
        //4. Создаем класс Runner, запускаем
        UserMeta userMeta = new UserMeta("Ilya", 20);
//        userMeta.GetSuperName("Mr.");

        for (Method declaredMethod : UserMeta.class.getDeclaredMethods()) {
            if (declaredMethod.isAnnotationPresent(GetMetaData.class)) {
               long start = System.currentTimeMillis();
               declaredMethod.invoke(userMeta,"Mr. ");
               long end = System.currentTimeMillis();
               System.out.println(end - start);
           }
        }
        for (Field declaredField : userMeta.getClass().getDeclaredFields()) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(GetMetaData.class)) {
                System.out.println(declaredField.get(userMeta));
            }
        }
        if (userMeta.getClass().isAnnotationPresent(GetMetaData.class)) {
            Arrays.asList(userMeta.getClass().getDeclaredFields()).stream()
                    .peek(e -> e.setAccessible(true))
                    .forEach(System.out::println);
        }


    }


    //method3.1
    //method3.2
    //method3.3
}