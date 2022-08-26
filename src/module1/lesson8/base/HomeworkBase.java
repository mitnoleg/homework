package module1.lesson8.base;

public class HomeworkBase {
    //Базовый уровень
    //Задача №1
    //^1. Создать два класса, которые умеют летать: самолет и утка. Атрибут утки: isInjured (ранен),
    // атрибут самолета: countPassengers.
    //^2. Создать интерфейс, который объединяет эти два класса.
    //^3. Имплементировать его в двух классах
    //^4. Реализовать метод летать:
    // Для утки:
    // Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
    // иначе печатать на экран "утка летит"
    // Для самолета:
    // Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
    // Иначе печать "самолет летит"
    //^5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
    //^6. Положить их всех в массив
    //^7. Перебрать массив и вызвать у каждого элемента метод летать
    // Перехватить исключения: вывести на экран message ошибки
    // Ожидание:
    // утка летит
    // Ошибка: утка ранена
    // самолет летит
    // Ошибка: пассажиров в самолете меньше 0
    public static void main(String[] args) {
        Duck duckIsInjurednew = new Duck(true,"red");
        Duck duckIsNotInjurednew = new Duck(false,"white");
        Airplane airplaneFromRussia = new Airplane(10,"Russia");
        Airplane airplaneFromGermany = new Airplane(-1,"Germany");
        Flying [] flyings = {duckIsInjurednew,duckIsNotInjurednew,airplaneFromRussia,airplaneFromGermany};
        for (Flying flying : flyings){
            try {
                flying.fly();
            }catch (FlyException e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("______________________");
            }
        }
    }
}
