package lesson2;

public class homework_basic {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже) используя String.trim()
        //затроить (Можно вызвать тольку одну команду System.out.println())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
        //String fullString = ( hi.trim() + world.toLowerCase() + newLine).repeat(3);
        System.out.println( ( hi.trim() + world.toLowerCase() + newLine).repeat(3));

        //Задача №2
        //Создать переменные с ростом (!в метрах), весом в кило.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0345645
        double rostVmetrah = 1.76;
//        float rostVmetrah = 1.76f;
        double vesVkilo = 100;
//        float vesVkilo = 100f;
        System.out.println(vesVkilo/(rostVmetrah*rostVmetrah));

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche
        char[] arrayChar = new char[]{'a','b','c','d','e'};
        String strokaChar = String.valueOf(arrayChar);
        System.out.println(strokaChar);
        arrayChar[3] = 'h';
        strokaChar = String.valueOf(arrayChar);
        System.out.println(strokaChar);
    }
}

