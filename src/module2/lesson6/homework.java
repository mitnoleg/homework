package module2.lesson6;

import java.util.HashMap;
import java.util.HashSet;

public class homework {
    public static void main(String[] args) {
//Задача №1
        //1. Создать класс User, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<User>
        //3. Переопределить hashcode и equals у User так, чтобы при записи в HashSet, были только уникальные name юзера
        HashSet<User> users = new HashSet<>();
        User viktor = new User(20, "Viktor");
        User viktor2 = new User(21, "Viktor");
        User yuri = new User(21, "Yuri");
        users.add(viktor);
        users.add(viktor2);
        users.add(yuri);

        System.out.println(users);

        //Задача №2
        //1. Создать класс UserBroken, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<UserBroken>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
        // в hashSet всегда оставался один юзер, который последний был вставлен

        HashSet<UserBroken> users2 = new HashSet<>();
        UserBroken userBroken = new UserBroken(20, "Yuri");
        UserBroken userBroken2 = new UserBroken(20, "Petr");
        users2.add(userBroken);
        users2.add(userBroken2);
        System.out.println(users2);

        //Задача №3
        //1. Создать класс CarBroken
        //2. Создать экземпляра класса HashMap<CarBroken, Integer>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого CarBroken в HashMap,
        //всегда CarBroken попадал в один бакет.
        HashMap<CarBroken, Integer> map = new HashMap<>();
        CarBroken carBroken = new CarBroken();
        CarBroken carBroken2 = new CarBroken();
        map.put(carBroken, 1);
        map.put(carBroken2, 2);

    }
}
