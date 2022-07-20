package lesson4;
public class homework_basic {
    public static void main(String[] args) {
        // Базовый уровень
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        for (int i = 1; i < 101 ; i++){
            System.out.print(i + "a ");
        }
        //
        // Задание №2
        // Дано:
        // int ageChildren = 10;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        //
        for (int ageChildren = 0; ageChildren < 27; ageChildren += 2 ){
            if (ageChildren < 6 ){
                System.out.println("Возраст ребенка " + ageChildren + " года и он пошел в сад");
            }
            else if (ageChildren < 11 ){
                System.out.println("Возраст ребенка " + ageChildren + " лет и он пошел в младшую школу");
            }
            else if (ageChildren < 17 ){
                System.out.println("Возраст ребенка " + ageChildren + " лет и он пошел в среднюю школу");
            }
            else {
                if (ageChildren == 22 || ageChildren == 24){
                System.out.println("Возраст ребенка " + ageChildren + " года и он пошел в университет");
                }
                else {
                    System.out.println("Возраст ребенка " + ageChildren + " лет и он пошел в университет");
                }
            }
        }
        // Задание №3
        // Дано:
        boolean chicken = true;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        if (chicken  && vegetables && sour  && toast ) {
            System.out.println("\nПовар у тебя есть все ингридиенты:курица, овощи, соус и гренки,лучше сделать \"Цезарь\"");
        }else if ((vegetables  && eggs) && (chicken ||sausage) )
            {
            System.out.println("\nПовар у тебя есть все ингридиенты:овощи, колбаса или курица, яйца,лучше сделать \"Оливье\"");
        }else if (vegetables )
            {
            System.out.println("\nПовар у тебя есть только овощи,лучше сделать \"Овощной салат\"");
        }else {
            System.out.println("\nПовар у тебя нет ингридиентов для салатов по приоритету");
        }
        System.out.println("");
        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.
        Mouse gleb = new Mouse("Глебяо","Зеленого");
        Mouse vzhig = new Mouse("Вжиг","Красного");
        System.out.println(gleb.getColor());
        System.out.println(gleb.getData());
        System.out.println(vzhig.getData());
        gleb.setName("Миони");
        vzhig.setColor("Синего");
        System.out.println(gleb.getData());
        System.out.println(vzhig.getData());
        Dolphin zip = new Dolphin("Зипяо",5);
        Dolphin zep = new Dolphin("Зубик",10);
        System.out.println(zip.getAge());
        System.out.println(zip.getData());
        System.out.println(zep.getData());
        zip.setName("Звезда");
        zep.setAge(19);
        System.out.println(zip.getData());
        System.out.println(zep.getData());
    }
}
